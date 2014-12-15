import TerminalIO.*;

public class Factorial {

    public static void main (String[] args){
        
    KeyboardReader kr = new KeyboardReader();
    //use double because int can't store enough data
    //kr not able to use long
    double x;
    
    while(true){        
        x = kr.readDouble("Enter a number between from 1-15: ");
        if(x <= 15 && x >= 1)break;
    }
    System.out.println(x + " factorial is equal to " + factorial(x));

    }

    public static double factorial(double n){
        if(n==1)
            return 1;
        else
            return n * factorial(n-1);
    }
}
