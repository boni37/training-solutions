package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    private List<String> list =new ArrayList<>();

    public static List<String> stringListsUnion(List<String> first, List<String> second){
        List<String> list = new ArrayList<>(first);
        for(int i = 0; i < second.size(); i++){
               if(!first.contains(second.get(i))) list.add(second.get(i));
            continue;
            } return list;
    }


}
