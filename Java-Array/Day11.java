public class Day11 {
    public static void main(String[] args) {
        int[] arr = {8, 3, 1, 2};
        System.out.println("the maximum value of the sum of i*a[i] is "+max_sum(arr, arr.length));

    }
    //https://www.geeksforgeeks.org/problems/max-sum-in-the-configuration/1
    static long max_sum(int arr[], int n) {
        long SumOfElements = 0;
        long ProductSum = 0;
        for(int i = 0;i<n;i++){
            SumOfElements += arr[i];
            ProductSum += (long)i*arr[i];
        }
        long MaxValue = ProductSum;
        for(int i = 0;i<n-1;i++){
            ProductSum = SumOfElements + ProductSum - (long)n*arr[n-1-i];
            MaxValue = Math.max(MaxValue,ProductSum);
        }
        return MaxValue;
    }
    //if you dont understand watch this video https://youtu.be/41rFv9KpHJQ
    
}
