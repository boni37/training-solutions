package week12d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberStat {


    public int countNumAppearOnce(List<Integer> numbers){
        if(numbers.size() < 1) throw new IllegalArgumentException("The list is too short");
        List<Integer> results = new ArrayList<>();
        for(Integer actual: numbers){
            if((numbers.indexOf(actual)== (numbers.lastIndexOf(actual)))){
                results.add(actual);
            }
        }
        int min=0;
        for(int i = 1; i< results.size();i++){
            if(results.get(i) < results.get(min)) min = i;
        }return results.get(min);
    }

    public static void main(String[] args) {
        NumberStat numberStat =new NumberStat();
        System.out.println(numberStat.countNumAppearOnce(new ArrayList<>(Arrays.asList(1,1,5,3,4,5,6,5,6,4,1,6,5,4,2,7,9))));
    }
}
