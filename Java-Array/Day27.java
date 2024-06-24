import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day27 {
    public static void main(String[] args) {
        Integer[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        
        System.out.println("The Mininmum possible difference is "+ findMinDiff(new ArrayList<>(Arrays.asList(arr)), arr.length, 5));
    }
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        //Base Case
        if(m==1){
            return 0;
        }
        // if we have same no.of chocolate packets and students
        if(m==n){
            Collections.sort(a);
            return a.get(n-1)-a.get(0);
        }
        
        //if n>m
        Collections.sort(a);
        //assigning Long max value to min
        long min = Long.MAX_VALUE;
        // Finding min value of difference between Max chocolates and min chocolates given to students
        for(int i = 0; i+m-1<n;i++){
            min = Math.min(a.get(i+m-1) - a.get(i),min);
        }
        return min;
    }
}
