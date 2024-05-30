import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Day2 {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println("First Non Repeating Element is : "+ firstNonRepeating(arr, arr.length));
    }

    public static int firstNonRepeating(int arr[], int n) 
    { 
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        //Using LinkedHashMap to maintain the insertion order
        
        for(int i = 0; i<n;i++){  //adding frequncies of the elements to map
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            map.put(arr[i],1);
        }
        //iterating through the each Entry of the entryset using enhanced for loop
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        
        return 0;
        
    }   
}
