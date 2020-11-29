package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringScanner {

    public int readAndSumValues(String intString, String delimiter){
        Scanner s = new Scanner(intString).useDelimiter(delimiter);
        int sum =0;
        if (isEmptyOrNull(delimiter)){
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
        if(s.hasNextInt()){
            while(s.hasNext()){
                sum += s.nextInt();
        }return sum;
        } else {
            throw new IllegalArgumentException("Incorrect parameter string!");
        }
    }

    /*public int readAndSumValues(String intString){
        Scanner s = new Scanner(intString);
        int sum = 0;
        return sum;

    }

    public String filterLinesWithWordOccurrences(String text, String word){
        Scanner s = new Scanner(text);
        List<String> l = new ArrayList<>();
        if (s.findInLine(word))


    }*/

    public boolean isEmptyOrNull(String string){
       if(string != null && !string.trim().isEmpty()) return false;
       return true;
    }

}
