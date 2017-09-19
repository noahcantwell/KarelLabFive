
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        sortPile();
        chooseDirection();
        eatPile();
        turnOff();
    }
   
    int beepersInPile = 0;
    
    public void sortPile() {
        while(nextToABeeper()) {
            pickBeeper();
            beepersInPile++;
        }
    }
    
    public void chooseDirection() {
        if(beepersInPile % 2 == 0) {
            turnLeft();
            turnLeft();
            turnLeft();
            move();
        }
        else {
            turnLeft();
            move();
        }
    }
    
    public void eatPile() {
        while(nextToABeeper()) {
            pickBeeper();
        }
    }
    
}

