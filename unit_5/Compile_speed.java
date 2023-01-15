import java.util.*;
import java.util.concurrent.*;
import java.lang.*;

class Compile_speed {
    public static void main(String[] args) {
        int num = 50;
        double total = 0;
        for (int i=0; i<num+1; i++) {
            long s = System.currentTimeMillis();
            fib_r(i);
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
            long f = System.currentTimeMillis();
            double seconds = ((double)f-s) * Math.pow(10, -3);
            total += seconds;
            
            System.out.printf("round: %d - %fs\n", i, seconds);
            System.out.printf("total time taken: %f\n", total);
            
        }
    }

    public static int fib_r(int n) {
        if (n==0) {
            return 0;
        } else if (n==1) {
            return 1;
        } else {
            return 
                fib_r(n-1)
                + fib_r(n-2);
        }
    }
}
