import TerminalIO.*;

public class Hanoi {
    
    static int nummoves = 0;
    
    public static void main(String[] args) {
        KeyboardReader kr = new KeyboardReader();
        int numrings;
        
        while(true){
            numrings = kr.readInt("Enter number of rings from 3 to 10: ");
            if(numrings>=3 && numrings<=10)break;
        }
        
        //call move - requires number of rings, going from where to where
        //and which ring is the in-between step
        move(numrings, 1, 3, 2);
        System.out.println("Total moves = " + nummoves);
    }
    
    public static void move(int n, int i, int j, int k){
        //stop doing it when we are down to 0 rings (n=0)
        if(n>0){
            nummoves++;
            move(n-1, i, k, j);//move calls itself note j and k reversed
            System.out.println("Move ring " + n + " from peg " + i + " to peg " + j);
            //move calls itself again - back from k to j
            move(n-1, k, j, i);
        }
    }
    }
