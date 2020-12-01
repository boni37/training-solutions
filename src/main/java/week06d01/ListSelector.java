package week06d01;

import java.util.ArrayList;
import java.util.List;

public class ListSelector {

    List<String> list = new ArrayList<>();

    public String selectedList(List<String> list){

        if(list != null && !list.isEmpty()){
            StringBuilder sb = new StringBuilder("[");
            for(int i= 0; i < list.size()-1; i=i+2){
                sb.append(list.get(i));
                sb.append(",");
            } sb.delete(sb.length()-1,sb.length());
            return sb.append("]").toString();
        }else {
            throw new IllegalArgumentException("String is empty!");
        }
    }
}
