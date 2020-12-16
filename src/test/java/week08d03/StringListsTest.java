package week08d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {

    private List<String> list = new ArrayList<>();

    @Test
    public void unionStringListsTest(){
        List<String> first = Arrays.asList("one","two","three","four");
        List<String> second = Arrays.asList("five","six","seven","eight");
        assertEquals("one, two, three, four, five, six, seven, eight",StringLists.stringListsUnion(first,second).toString().replace("[","").replace("]",""));
    }

    @Test
    public void unionStringListsTestOther(){
        List<String> first = Arrays.asList("one","two","three","four");
        List<String> second = Arrays.asList("one","six","two","eight");
        assertEquals("one, two, three, four, six, eight",StringLists.stringListsUnion(first,second).toString().replace("[","").replace("]",""));
    }

}
