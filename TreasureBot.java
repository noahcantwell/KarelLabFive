
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public boolean foundTreasure = false;
    
    public void findTreasure() {
        while(foundTreasure == false) {
            followClue();
            decodeClue();
        }
        turnOff();
    }
    
    public void decodeClue() {
        int beeperAmount = 0;
        while(nextToABeeper()) {
            pickBeeper();
            beeperAmount++;
        }
        
        if(beeperAmount == 1) {
            faceNorth();
        }
                
        if(beeperAmount == 2) {
            faceEast();
        }
                
        if(beeperAmount == 3) {
            faceSouth();
        }
                
        if(beeperAmount == 4) {
            faceWest();
        }
                
        if(beeperAmount == 5) {
            foundTreasure = true;
        }
    }
    
    public void followClue() {
        while(!nextToABeeper()) {
            move();
        }
    }
    
    public void faceNorth() {
        while(!facingNorth()) {
            turnLeft();
        }
    }
    
    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }
    
    public void faceSouth() {
        while(!facingSouth()) {
            turnLeft();
        }
    }
    
    public void faceWest() {
        while(!facingWest()) {
            turnLeft();
        }
    }
}

