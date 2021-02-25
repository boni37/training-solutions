package exam03retake01;

public class CdvCheck {

    public boolean check(String number){
        int sum = 0;
        if(number.length() != 10){
            throw new IllegalArgumentException("More or less than ten number");
        }
        else {
            for(int i=0; i < 9; i++){
                if(Character.getNumericValue(number.charAt(i))>=0 && Character.getNumericValue(number.charAt(i))<=9){
                    int partNumbers = Character.getNumericValue(number.charAt(i))*(i+1);
                    sum += partNumbers;
                }
                else {
                    throw new IllegalArgumentException("It is not a number");
                }
            }
        }
        int result = sum%11;
        if(Character.getNumericValue(number.charAt(9)) == result) return true;
        return false;
    }
}
