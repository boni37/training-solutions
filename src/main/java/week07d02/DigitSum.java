package week07d02;

public class DigitSum {

    public static int sumOfDigits(int x){
        String number = String.valueOf(x);
        int sum = 0;
        for(int i=0; i< number.length();i++){
            sum += Character.getNumericValue(number.charAt(i));
        }return sum;
        }
}
