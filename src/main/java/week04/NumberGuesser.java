package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {
        Random rnd = new Random();
        int randomNumber =rnd.nextInt(100);
        System.out.println(randomNumber);
        boolean guess = false;
        int guessNumber;
        Scanner scanner = new Scanner(System.in);
        while ( guess == false){
            System.out.println("Add your odd! ");
            guessNumber = scanner.nextInt();
            if (guessNumber != randomNumber){
                if (guessNumber < randomNumber){
                    System.out.println("Your number is less than MyNumber");
                    guess = false;
                }else{
                    System.out.println(("Your number is more than MyNumber "));
                    guess = false;
                }
            } else{
                System.out.println("Your guess is OK");
                guess = true;
            }
        }
    }
}
