// import java.util.Arrays;

public class Day23 {
    //https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
    public static void main(String[] args) {
        int[] arr = {8 ,8 ,2 ,4 ,5 ,5 ,1};
        System.out.println("Trapped Rain Water between the blocks is "+trappingWater(arr, arr.length));
    }
    static long trappingWater(int arr[], int n) { 
        int[] left = new int[n];
        int[] right = new int[n];
        long ans = 0;
        int water = 0;
        // System.out.println(Arrays.toString(arr));
        for(int i = 1;i<n;i++){
            left[i] = Math.max(left[i-1],arr[i-1]);
        }
        // System.out.println(Arrays.toString(left));
        for(int i = n-2;i>0;i--){
            right[i] = Math.max(right[i+1],arr[i+1]);
        }
        // System.out.println(Arrays.toString(right));
        for(int i = 1;i<n-1;i++){
            water = Math.min(left[i],right[i]) - arr[i];
            
            if(water<0)
            water = 0;
            
            ans = ans + water;
        }
        return ans;
    }
}
