package week11d01;

import java.util.Arrays;

public class DivisorFinder {

    public static int findDivisor(int n){
        int numDiv = 0;
        String s= String.valueOf(n);
        int[] numbers = new int[s.length()];
        for(int i = 0; i< s.length(); i++){
            numbers[i] = Character.getNumericValue(s.charAt(i));
            if(n % numbers[i] == 0){
                numDiv += 1;
            }
        }
        return numDiv;
    }

    public static void main(String[] args) {
        System.out.println(findDivisor(345345));
    }
}
