import TerminalIO.*;

public class Fibonacci {
    
    public static void main (String[] args){
    KeyboardReader kr = new KeyboardReader();
    //use double because int can't store enough data
    //kr not able to use long
    int x;
    
    while(true){
        x = kr.readInt("Enter a number from 1 to 15: ");
        if(x <= 15 && x >= 1)break;
    }
    
    System.out.println(fibonacci(x) + " is fibonacci number " + x + ".");
    }
    
    public static int fibonacci(int n){
        if(n<=2)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}
