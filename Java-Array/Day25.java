public class Day25 {
    public static void main(String[] args) {
        int A[] = {2,3,7,10,12};
        int B[] = {1,5,7,8};
        System.out.println("The maximum sum of a path from the beginning of any array to the end of any of the two arrays is "+maxPathSum(A, B));
    }

    static int maxPathSum(int ar1[], int ar2[])
    {
        int m = ar1.length;
        int n = ar2.length;
        int i = 0;
        int j = 0;
        int sum1 = 0;
        int sum2 = 0;
        int max = 0;
        //Same as Merge Sort Merging Algorithm
        while(i<m && j<n){
            if(ar1[i]>ar2[j]){
                sum2 += ar2[j];
                j++;
            }else if(ar1[i]<ar2[j]){
                sum1 += ar1[i];
                i++;
            }else{
                //Selecting max sum
                max += Math.max(sum1,sum2)+ar1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        while(i<m){
             sum1 += ar1[i];
                i++;
        }
        while(j<n){
            sum2 += ar2[j];
                j++;
        }
         max += Math.max(sum1,sum2);
         return max;
    }
}
