import java.util.Arrays;

public class Day17 {//https://www.geeksforgeeks.org/problems/smallest-positive-missing-number-1587115621/1
    public static void main(String[] args) {
        int[] arr = {9,1, -2, 0, -1, -2, 1, -4, 2, -3};
        System.out.println("The Smallest Positive missing number is "+missingNumber(arr, arr.length));
    }

    static int missingNumber(int arr[], int n){
        // 1 is the smallest positive number
        if(n == 1){// edge cases
            if(arr[0] != 1)
            return 1;
            else
            return 2;
        }
        Arrays.sort(arr);//Sorting the array
        
        //Trying to find lowest positive integer in the given array
        int num = 0;
        int j=-1;
        for(int i = 0; i<n; i++){
            if(arr[i] == 1){
                num = 1;
                j = i;
                break;
            }
        }
        //if 1 isn't present in the array then return 1;
    
        if(num != 1)
        return 1;
        
        for(int i = j+1; i<n; i++){
            if(num+1 == arr[i])
                num = arr[i];
            else if(num == arr[i])
                continue;
            else
                break;
        }
        return num+1;
    }
}
