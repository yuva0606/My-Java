//First Repeating Element

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Day1{
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println("First Repeating Element Index is : "+firstRepeated(arr, arr.length));
    }
    public static int firstRepeated(int[] arr, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n;i++){
            if(map.containsKey(arr[i])){
                list.add(map.get(arr[i])+1);
            }
            map.put(arr[i],i);
        }
        
        if(list.isEmpty())
        return -1;
        
        Collections.sort(list);
        
        return list.get(0);
    }
}