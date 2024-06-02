import java.util.HashMap;

/**
 * Day5
 */
public class Day5 {

    public static void main(String[] args) {
        int arr[] = {-5,-2,5,2,4,7,1,8,0,-8};
        if(findsum(arr,arr.length))
        System.out.println("True");
        else
        System.out.println("False");
    }
    public static boolean findsum(int arr[],int n)
    {
         int sum = 0 ; 

        HashMap<Integer , Integer> map = new HashMap<>();
        //Inserting key '0' since wish to find sum 0
        map.put(0,1); 
        //iterating through and adding the sum as key while checking if the sum is already existed in the map
        // because if the sum is already exist in the map that means, their is subarray which some is equal to 0
        // and Here, we used the HashMap because for search operation HashMap takes O(1) and ArrayList will take O(n)[list.contains(num)]
        for(int i = 0 ; i < n ; i++){
            sum += arr[i] ;
            if(map.containsKey(sum)) return true ;
            map.put(sum,1);
        }
        return false;
        
    }
}