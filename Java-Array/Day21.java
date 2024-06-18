import java.util.HashMap;
import java.util.Map;

public class Day21 {
    //https://www.geeksforgeeks.org/problems/majority-element-1587115620/1
    public static void main(String[] args) {
     int[] arr = {3,1,3,3,2};
     System.out.println("the majority element in the array is "+majorityElement(arr, arr.length));   
    }
    static int majorityElement(int a[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : a){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else
            map.put(num,1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > n/2)
            return entry.getKey();
        }
        
        return -1;
    }
}
