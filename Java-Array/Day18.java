public class Day18 {//https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 1, 1},
                       {0, 0, 1, 1},
                       {1, 1, 1, 1},
                       {0, 0, 0, 0}};
        System.out.println("the first row that has the most number of 1s is "+rowWithMax1s(arr, arr.length, arr[0].length));

    }

    static int rowWithMax1s(int arr[][], int n, int m) {
        int count = 0;
        int max = 0;
        int row = -1;
        for(int i = 0;i<n;i++){
            count = 0;
            for(int j = 0;j<m;j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(count>max){
                max= count;
                row = i;
            }
        }
        return row;
     }

}
