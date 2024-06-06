//https://www.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Day9 {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1,1,2};
        System.out.println("the length of the longest subsequence of consecutive integers is "+findLongestConseqSubseq(arr, arr.length));
    }
    static int findLongestConseqSubseq(int arr[], int N)
	{
	    //Sorting array to compare elemets eachother
	   Arrays.sort(arr);
	   HashSet<Integer> set = new HashSet<>();
	   int count = 1;
	   for(int i = 0; i<N-1;i++){
	       //if they are consecutive numbers then we increase the count
	       if(arr[i+1]-arr[i] == 1){
	       count++;
	       if(i==N-2)
	       set.add(count);
	       }
	       //if they both are same nunbers then we dont do anything
	       else if(arr[i+1] == arr[i]){
	       continue;
	       }
	       //if they are not consecutive then we store the count in set and then we reset it to '1' to start new count
	       else{
	           set.add(count);
	           count =1;
	       }
	   }
	   //{0,1,1,1,1,2} here the set will be empty 
	   //if(set.size() == 0)
	   //set.add(count);
	   return Collections.max(set);
	}
}
