package week08d02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    private static List<Integer> numbers = new ArrayList<>();

    public static List<Integer> getNumbers(){
        Random random = new Random();
        numbers = new ArrayList<>();
        for(int i= 0; i<5; i++){
            int rndNumber = random.nextInt(90);
            if(numbers.contains(rndNumber)){
                i--;
                break;
            }numbers.add(rndNumber);
        }return numbers;
    }

    public static void main(String[] args) {
        System.out.println(getNumbers());
    }
}
