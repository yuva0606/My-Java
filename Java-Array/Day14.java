public class Day14 { //https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1#
    static int minJumps(int[] arr, int n) {// int[] arr = {1, 4, 3, 2, 6, 7}, int n = arr.length
        if(n==1){
            return 0;
        }
        if(arr[0] == 0){
            return -1;
        }
        int maxSteps = 0;
        int currentIndex = 0;
        int jumps = 0;
        // Here we are basically trying to find out max jump value in the range of the
        //current value jump then after we reach the desired index we will update
        //the current,i.e we did a jump and if the maxSteps is greater than n-1
        //then it means we reached the end of the array
        for(int i = 0;i<n;i++){
            maxSteps = Math.max(maxSteps,i+arr[i]);
            if(currentIndex == i){
                currentIndex = maxSteps;
                jumps++;
                if(currentIndex >= n-1){
                    return jumps;
                }
            }
        }
        return -1;
     }
    
        public static void main(String[] args) {
            int[] arr1 = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
            int n1 = arr1.length;
            System.out.println(minJumps(arr1, n1)); // Output: 3
    
            int[] arr2 = {1,1,1,1,1,1};
            int n2 = arr2.length;
            System.out.println(minJumps(arr2, n2)); // Output: 2
        }
    }

