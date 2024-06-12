import java.util.Arrays;
import java.util.Stack;

public class Day15 { //https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
    public static void main(String[] args) {
        int price[] = {100,80,60,70,60,75,85};
        System.out.println("The span for the i-th day is "+Arrays.toString(calculateSpan(price, price.length)));
    }

    public static int[] calculateSpan(int arr[], int n) {
        Stack<Integer> stack = new Stack<>();
        int[] spans = new int[n];
        spans[0] = 1;
        stack.push(0);
        for(int i = 1; i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty())
            spans[i] = i+1;
            else
            spans[i] = i-stack.peek();
            
            stack.push(i);
        }
        
        return spans;
        
    } //https://youtu.be/-IFmgue8sF0

}

