import java.util.ArrayList;

public class Day19 {
    //https://www.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1
    public static void main(String[] args) {
        int[][] arr = {{6,6,2,28,2}, 
                      {12,26,3,28,7},
                      {22,25,3,4,23}};

         System.out.println(spirallyTraverse(arr, arr.length, arr[0].length));
    }

    static ArrayList<Integer> spirallyTraverse(int arr[][], int n, int m)
    {
        ArrayList<Integer> list = new ArrayList<>();
        //Edge Cases
        if(n==1 && m==1){
            list.add(arr[0][0]);
            return list;
        }
        if(n==1){
            for(int i = 0;i<m;i++){
                list.add(arr[1][i]);
            }
        }
        if(m==1){
            for(int i = 0;i<n;i++){
                list.add(arr[i][1]);
            }
        }
        //n = number of rows, m = number of columns
        //to print the first row
         int a = 0;
        //to print the last column
         int b = m-1;
        //to print the bottom row 
         int c = n-1;
        //to print the first column 
         int d = 0;
        //to limit traversing 
         int count = 0;
         while(count<m*n){
            //traversing the first row depends on bottom row(d) and last column(b)
            for(int i = d;i<=b && count<m*n;i++){
                list.add(arr[a][i]);
                count++;
            }
            a++;
            for(int i = a;i<=c && count<m*n;i++){
                list.add(arr[i][b]);
                count++;
            }
            b--;
            for(int i = b; i>=d && count<m*n;i--){
                list.add(arr[c][i]);
                count++;
            }
            c--;
            for(int i = c; i>=a && count<m*n;i--){
                list.add(arr[i][d]);
                count++;
            }
            d++;
         }

         return list;
    }
}
