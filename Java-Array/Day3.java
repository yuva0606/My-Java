import java.util.HashMap;

public class Day3 {
    public static void main(String[] args) {
        int arr[] = {1,0,0,1,0,1,1};
        System.out.println("number of subarrays with equal number of 0s and 1s : "+ countSubarrWithEqualZeroAndOne(arr, arr.length));
    }
    static int countSubarrWithEqualZeroAndOne(int arr[], int n){
        HashMap<Integer,Integer> m=new HashMap<>();
        //changing all 0s to -1
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        
        m.put(0,1);
        System.out.println(0);
        int ans=0;
        //calculating cummulative sum 
        //if we encounter same sum it means that there are equal number of 0s and 1s between those freqencies
        // lets say sum 0 is occured at 1 (i.e array{1,0(-1)}) and 0 is already present in the map as we added it first
        // so from 0 to 1 we have equal number of 0s and 1s
        // and lets say we encounter sum 0 again at index 5, it means there are equal number of 0s and 1s between those previously encounterd indices and the current index
        // so it means previuos enountered subarrays + current subarrays
        int s=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
            if(m.containsKey(s)){
                ans+=m.get(s);
            }
            m.put(s,m.getOrDefault(s,0)+1);
        }
        return ans;
    }
    // if you still dont understand it try watching this video https://www.youtube.com/watch?v=svMdY6wlQ6I
}
