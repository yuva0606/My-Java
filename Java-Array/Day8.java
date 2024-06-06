//https://www.geeksforgeeks.org/problems/maximum-product-subarray3604/1
public class Day8 {
    public static void main(String[] args) {
        int[] arr = {3,12,15,23,33,-35,30,-40,-30,-30,-30,26,28};
        System.out.println("The product of the maximum product subarray is "+ MaxProduct(arr, arr.length));
    }
    static long MaxProduct(int[] arr, int n) {
        if(n==1){
            return arr[0];
        }
        long MaxProduct = arr[0];
        long MinProduct = arr[0];
        long MaxSoFar = arr[0];
        for(int i = 1;i<n;i++){
            long a = MaxProduct*arr[i];//choice one
            long b = MinProduct*arr[i];//choice two
            
            MaxProduct = Math.max(Math.max(a,b),arr[i]);//MaxProduct is maximum value among choice 1, choice 2,current element
            MinProduct = Math.min(Math.min(a,b),arr[i]);//MinProduct is minimum value among choice 1, choice 2,current element
            MaxSoFar = Math.max(MaxProduct,MaxSoFar);//MaxSoFar is max value among MaxProduct and itself
        }
        return MaxSoFar;
    }
}
