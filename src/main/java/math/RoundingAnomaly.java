package math;

import java.lang.reflect.Array;
import java.util.Random;

public class RoundingAnomaly {



   private double[] randomNumbers(int size, double max, int scale){
        double[] numbers = new double[size];
        Random rnd = new Random();
        for (int i=0; i<size; i++){
            Double randNumber = Math.round(rnd.nextDouble()*max*(double)scale)/(double)scale;
            numbers[i] = randNumber;
        }
        return numbers;
    }

    private double roundAfterSum(double[] numbers){
        double sum = 0;
        for (int i=0; i<numbers.length;i++){
            sum += numbers[i];
        } sum = Math.round(sum);
        return sum;
    }

    private double sumAfterRound(double[] numbers){
       double sum =0;
        for (int i=0; i<numbers.length;i++){
            sum += Math.round(numbers[i]);
        } sum = Math.round(sum);
        return sum;

    }





    public static void main(String[] args) {
        Double max = 1_000_000.0;
        int scale = 10_0000;
        int size= 100;
        RoundingAnomaly anomaly= new RoundingAnomaly();
        double[] numbers =anomaly.randomNumbers(size,max,scale);
        System.out.println("Különbség ="+ (anomaly.roundAfterSum(numbers)-anomaly.sumAfterRound(numbers)));

    }
}
