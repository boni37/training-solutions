package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberListTest {

    @Test
    public void isIncreasingListTestFalse(){
        List<Integer> numbers = Arrays.asList(1,4,3,5,5,6);
        assertFalse(NumberList.isIncreasing(numbers));
    }

    @Test
    public void isIncreasingListTestTrue(){
        List<Integer> numbers = Arrays.asList(1,2,3,5,5,6);
        assertTrue(NumberList.isIncreasing(numbers));
    }


}
