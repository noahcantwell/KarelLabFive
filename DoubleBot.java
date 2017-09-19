


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
        // put your code here
        move();
        removeBeepers();
        placeOriginalPile();
        move();
        placeBeeper();
        move();
    }
    
    int beeperCount = 0;
    
    public void removeBeepers() {
        while(nextToABeeper()) {
            pickBeeper();
            beeperCount++;
        }
    }
    
    public void placeOriginalPile() {
        for(int q=0; q<beeperCount; q++) {
            putBeeper();
        }
    }
    
    
    public void placeBeeper() {
        for(int i=0; i<(2*beeperCount); i++) {
            putBeeper();
        }
    }
}
