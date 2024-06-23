import java.util.Arrays;

public class Day26 {
    public static void main(String[] args) {
        int[] arr = {9,9,8,5,6,7,4,2,1};
        System.out.println("The repeated element and the missing elements are "+Arrays.toString(findTwoElement(arr, arr.length)));

    }
    static int[] findTwoElement(int arr[], int n) {
        
        int[] a2 = new int[2];
        Arrays.sort(arr);
        //calculating sum of n integers
        long sum = (n*(n+1L))/2; //Must add 1L(long) or else sum will act as int
        long sum2 = 0;
        //finding the repeated element and also find the sum2
        for(int i = 0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                a2[0]  = arr[i];
            }else{
                sum2 += arr[i];
            }
        }
        //adding the last element to the sum(since its missed in the for loop)
        sum2 += arr[n-1];
        
        //Now finding the missing element in the given array
        sum = sum - sum2;
        a2[1] = (int)sum;

        
        return a2;
    }
}
