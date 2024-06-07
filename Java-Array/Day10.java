public class Day10 {
    public static void main(String[] args) {
        int[] arr = {4 ,5 ,1 ,2 ,3};
        System.out.println("the minimum element of the array is "+findMin(arr, arr.length));

    }
    static int findMin(int arr[], int n)
    //https://www.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1
    {
        for(int i = 0; i<n-1;i++){
            if(arr[i]>arr[i+1])
            return arr[i+1];
        }
        return arr[0];
    }
}
