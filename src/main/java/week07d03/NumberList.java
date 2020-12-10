package week07d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberList {

    private List<Integer> numbers = new ArrayList<>();

    public static boolean isIncreasing(List<Integer> numbers){
        for(int i=1; i < numbers.size();i++){
            if(numbers.get(i-1)>numbers.get(i)){
                return false;
            }
        }return true;
    }
}
