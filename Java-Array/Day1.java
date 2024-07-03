//First Repeating Element

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Day1{
    //https://www.geeksforgeeks.org/problems/first-repeating-element4018/1
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


    //Different approach
    public static int firstRepeated2(int[] arr, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int index = n+1;
        boolean notRep = true;
        for(int i =0;i<n;i++){
            if(map.containsKey(arr[i])){
                notRep = false;
                // System.out.println("--------");
                index = Math.min(index,map.get(arr[i]));
            }else
            map.put(arr[i],i+1);
        }
        
        // System.out.println(map);
        
        if(notRep)
        return -1;
        
        return index;
    }
}