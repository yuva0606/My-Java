import java.util.Arrays;

public class Day16 {//https://www.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1
   public static void main(String[] args) {
    int arr[] = {1, 4, 45, 6, 10, 8};
    int target = 13;
    System.out.println(find3Numbers(arr, arr.length, target));
   } 
   //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
        
        if(n<3){
            return false;
        }
               // Your code Here
       Arrays.sort(A);
       for(int i=0;i<A.length-2;i++){
           int l = i+1;
           int r = A.length-1;
           while(l<r){
           int sum = A[i]+A[l]+A[r];
           if(sum == X){
               return true;
           }else if(sum<X){
               l++;
           }else{
               r--;
           }
       }
    }
       return false;
       }
}
