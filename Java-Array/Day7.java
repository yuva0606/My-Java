import java.math.BigInteger;
import java.util.ArrayList;
//https://www.geeksforgeeks.org/problems/factorials-of-large-numbers2508/1#

public class Day7 {
    public static void main(String[] args) {

        System.out.println("list of integers denoting the digits that make up the factorial of N is "+factorial(15));

    }
    static ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> list= new ArrayList<>();
        //creating a BigInteger(java.math) as the factorial can be a very big number
        BigInteger n = BigInteger.ONE;
        //Calculating the Factorial of the number
        for(int i = N; i>=2; i--){
            n = n.multiply(BigInteger.valueOf(i));
        }
        //converting the factorial of N to a String and then looping through the String to add each digit to list
        String str = String.valueOf(n);
        for(int i =0; i<str.length();i++){
            //changing the '1'(char) to 1(int) using Character.getNumericValue()
            list.add(Character.getNumericValue(str.charAt(i)));
        }
        return list;
        
    }
}
