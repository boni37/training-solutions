package week06d01;

import org.junit.jupiter.api.Test;
import stringscanner.StringScanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListselectorTest {

    ListSelector listSelector = new ListSelector();

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
        assertEquals("[alma,citrom,eper,gránátalma]",listSelector.selectedList(list));
    }

    @Test
    public void selectedListTestWithNullList() {
        assertThrows(IllegalArgumentException.class, () -> listSelector.selectedList(null));
    }

    @Test
    public void selectedListTestWithEmptyList(){
        assertThrows(IllegalArgumentException.class, () ->listSelector.selectedList(new ArrayList<>()));

    }

}
