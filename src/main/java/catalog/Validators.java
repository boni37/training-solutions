package catalog;

import java.util.List;

public class Validators {

    static boolean isBlank(String string){
        return ((string == null) || string.isEmpty() || string.isBlank());
    }

    static boolean isEmpty(List<String> list){

        return ( list == null || list.isEmpty());
    }
}
