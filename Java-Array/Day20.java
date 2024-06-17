import java.util.HashMap;

public class Day20 {
    //https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
    public static void main(String[] args) {
       long a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
       long a2[] = {11, 3, 7, 1, 7};
       if(isSubset(a1, a2, a1.length, a2.length)){
        System.out.println("Yes, a2 is the subset of the a1");
       }else
       System.out.println("No, a2 is not the subset of a1");
    }
    public static boolean isSubset( long a1[], long a2[], long n, long m) {
        
        //Edge Cases
        
        if(m>n){
            return false;
        }
        
        HashMap<Long,Integer> map = new HashMap<>();
        //calculating frequencies of the each element
        for(long num : a1){
            if(map.containsKey(num))
            map.put(num,map.get(num)+1);
            else
            map.put(num,1);
        }
        
        //checking whether the elements of a2 present in a2
        for(long ele : a2){
            if(map.containsKey(ele) && map.get(ele)>=1){
                map.put(ele,map.get(ele)-1);
            }
            else
            return false;
        }
        
        return true;
    }
}
