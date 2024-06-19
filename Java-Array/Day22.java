import java.util.Arrays;

public class Day22 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Converted Wave-Like array is ");
        convertToWave(arr.length, arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void convertToWave(int n, int[] arr) {
        if(n==1){
            return;
        }
        int temp = -1;
        if(n%2 == 0){
            for(int i = 0;i<n;i = i+2){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        else
        for(int i =0;i<n-1;i = i+2){
            temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
        }
    }
}
