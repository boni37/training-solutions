package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitSumTest {

    @Test()
        public void sumDigitTest(){
           assertEquals(21,DigitSum.sumOfDigits(123456));
        }
}
