package week10d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void calculatorTest(){
        Calculator calculator = new Calculator();
        int[] arr = {1,3,23,8,55,14,125};
        calculator.findMinSum(arr);
    }

}