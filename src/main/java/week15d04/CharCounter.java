package week15d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CharCounter {


    public static void main(String[] args) {
        Path file = Path.of("shoppingList.txt");
        int numOfVowels = 0;
        int numOfConsonant = 0;
        int numOfOther = 0;
        try {
            String text = Files.readString(file).toLowerCase();
            for(int i=0; i< text.length();i++){
                if(!Character.isWhitespace(text.charAt(i))){
                    if(Character.isLetter(text.charAt(i))){
                        switch (text.charAt(i)){
                            case 'a': case 'e': case 'i' :case 'o': case 'u':
                                numOfVowels ++;
                                break;
                            default :
                                numOfConsonant++;
                                break;
                        }
                    }numOfOther++;
                }
            }
            System.out.println("Vowel = " + numOfVowels  + " Consonant = " + numOfConsonant + " Other = " + numOfOther);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not read file",ioe);
        }

    }
}
