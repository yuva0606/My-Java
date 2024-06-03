public class Day6 { //https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        System.out.println(maxSubarraySum(arr, arr.length));
        
    }
    public static int maxSubarraySum(int arr[], int n){
        
        int currSum = arr[0];
        int maxSum = arr[0];
        for(int i = 1;i<arr.length;i++){
            currSum = Math.max(arr[i],arr[i]+currSum);
            maxSum = Math.max(maxSum,currSum);
        }
        
        return maxSum;
          
      }
    
}
