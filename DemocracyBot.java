
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        move();
        for(int i=0; i<5; i++) {
            checkStreet();
            nextBlock();
        }
    }
    
    public boolean approvedStreet = false;
    
    public void checkStreet() {
        if(nextToABeeper()) {
            approvedStreet = true;
        }
        else {
            approvedStreet = false;
        }
        checkRooms();
    }
    
    public void checkRooms() {
        turnLeft();
        move();
        correctBeepers();
        turnLeft();
        turnLeft();
        move();
        move();
        correctBeepers();
        turnLeft();
        turnLeft();
        move();
        turnRight();
    }
    
    public void correctBeepers() {
        if( approvedStreet==true && !nextToABeeper()) {
            putBeeper();
        }
        else if( approvedStreet==false && nextToABeeper()) {
            while(nextToABeeper()) {
                pickBeeper();
            }
        }
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void nextBlock() {
        move();
        move();
    }
}

