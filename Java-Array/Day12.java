import java.util.Arrays;

public class Day12 { //Minimum number of Platforms
    //https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1
    public static void main(String[] args) {
        int[] arrival = {900,940, 950, 1500, 1800 ,1100};  //{0900, 0940, 0950, 1100, 1500, 1800}
        int[] departure = {910, 1200, 1120, 1900, 2000, 1130};
        System.out.println("the minimum number of platforms required at the railway station such that no train waits : "+findPlatform(arrival, departure, arrival.length));

    }
    static int findPlatform(int arr[], int dep[], int n)
    {   
        //we are sorting arr and dep because the order of trains doesnt matter, since we wanna
        //find out the maximum number of trains on the platform(which is equal to min no of platforms needed)
        Arrays.sort(arr);
        Arrays.sort(dep);
        int maxTrains = 0; //(max arrived at the given time)
        int ans = 0; //Maximum Trains on the platform
        int i,j;
        i = j =0;
        while(i<n & j<n){
            if(arr[i]<=dep[j]){
               maxTrains++;
               i++;
            }else{
                maxTrains--;
                j++;
            }
            ans = Math.max(maxTrains,ans);
        }
        return ans;
        
    }
}
