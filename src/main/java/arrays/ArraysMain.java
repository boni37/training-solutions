package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public String numberOfDays(){
        int [] numberOfDays= {31,28,31,30,31,30,31,31,30,31,30,31};
        return Arrays.toString(numberOfDays);
    }

    public List<String> daysOfWeek(){
        return Arrays.asList("Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday");

    }

    public String multiplicationTableAsString(int size){
        int [] [] multTable = new int [size] [size];
        for (int i=1; i <= size;i++){
            for (int j=1; j<= size; j++){
                multTable [i-1] [j-1] = i*j;
            }
        }
        return  Arrays.deepToString(multTable);
    }

    public boolean sameTempValues(double[] day1, double [] day2){
        return Arrays.equals(day1,day2);
    }

    public boolean wonLottery(int [] took, int [] won){
        Arrays.sort(took);
        Arrays.sort(won);
        return Arrays.equals(took,won);

    }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        System.out.println(arraysMain.numberOfDays());

        System.out.println(arraysMain.daysOfWeek());

        System.out.println(arraysMain.multiplicationTableAsString(4));

        System.out.println(arraysMain.sameTempValues(new double[] {24.2,16.3},new double[] {24.2,16.3}));
        System.out.println(arraysMain.sameTempValues(new double[] {24.2,16.3},new double[] {24.3,16.3}));

        System.out.println(arraysMain.wonLottery(new int[] {12,2,9,4,90}, new int[] {4,2,3,90,14}));
        System.out.println(arraysMain.wonLottery(new int[] {12,2,9,4,90}, new int[] {4,12,2,90,9}));


    }
}
