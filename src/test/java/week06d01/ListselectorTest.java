package week06d01;

import org.junit.jupiter.api.Test;
import stringscanner.StringScanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListselectorTest {

    @Test
    public void selectedListTest() {
        List<String> list = new ArrayList<>();
        list.add("alma");
        list.add("barack");
        list.add("citrom");
        list.add("dió");
        list.add("eper");
        list.add("füge");
        list.add("gránátalma");
        list.add("banán");
        list.add("szőlő");
        assertEquals("[alma,citrom,eper,gránátalma]",new ListSelector().selectedList(list));
    }

    @Test
    public void selectedListTestWithNullList() throws IllegalArgumentException{
        List<String> list = new ArrayList<>();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new ListSelector().selectedList(list));
        assertEquals("Incorrect parameter string!", ex.getMessage());
    }

}
