package Dynamic_Programming;

import java.util.Arrays;

/**
 * Fibonacci Series using Dynamic Programming approach
 * 
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n = 45;
        System.out.printf("Printing %d Fibonacci numbers", n);
        System.out.println(Arrays.toString(fibonacci(n)));
    }

    static long[] fibonacci(int num){
        long[] arr = new long[num];
        arr[0]=0;
        arr[1]=1;
        for(int i = 2;i<num;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;
    }
    
}