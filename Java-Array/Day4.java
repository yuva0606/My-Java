import java.util.ArrayList;
import java.util.Arrays;

public class Day4 {
    public static void main(String[] args) {
        int arr[] = {-5,-2,5,2,4,7,1,8,0,-8};
        rearrange(arr, arr.length);
        System.out.println("Modified array is "+Arrays.toString(arr) );
    }
   private static void rearrange(int arr[], int n) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        int pos = 0;
        int neg = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]>=0){
            a1.add(arr[i]);
            }
            else{
                a2.add(arr[i]);
            }
        }
        int i = 0;
        while(pos<a1.size() && neg<a2.size()){
            arr[i] = a1.get(pos);
            i++;
            pos++;
            
            arr[i] = a2.get(neg);
            i++;
            neg++;
        }
        while(pos<a1.size()){
            arr[i] = a1.get(pos);
            i++;
            pos++;
        }
        while(neg<a2.size()){
            arr[i]=a2.get(neg);
            i++;
            neg++;
        }
    }
}
