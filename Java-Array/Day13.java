import java.util.Arrays;

public class Day13 {
    public static void main(String[] args) {
        int arr[] = {1, 5, 10, 8};
        System.out.println("the minimum difference is "+getMinDiff(arr, arr.length, 2));

    }
    static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int diff = arr[n-1]-arr[0];
        for(int i = 1; i<n;i++ ){
            if(arr[i]-k < 0)continue;
            int min = Math.min(arr[0]+k,arr[i]-k);
            int max = Math.max(arr[n-1]-k, arr[i-1]+k);
            diff = Math.min(diff,max-min);
        }
        return diff;
    }
}
