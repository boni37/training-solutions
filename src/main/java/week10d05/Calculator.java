package week10d05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    private int[] numbers = new int[100];



    public void findMinSum(int[] arr){
        int summ = 0;
        if(arr.length>=4){
            Arrays.sort(arr);
            /*int temp = 0;
            for(int i= 0; i< arr.length;i++){
                for(int j = i + 1; j< arr.length; j++){
                    if(arr[i] > arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }*/
            for(int i= 0; i< 4; i++){
                summ += arr[i];
            }
            System.out.println(summ);
        }else throw new IllegalArgumentException("The array lenght less than four!");
    }
}
