package week05d03;

import java.util.ArrayList;
import java.util.List;

public class ListCounter {

    public void countALetters(List<String> list){
      int sum = 0;
      if(list.size()==0){
          sum = 0;}
      else {
          for(int i=0; i<list.size();i++){
              if(list.get(i).startsWith("a") || list.get(i).startsWith("A")){
                  sum +=1;
              }else sum = sum;
          }
      }System.out.println(sum);
    }

    public static void main(String[] args) {
      ListCounter listCounter = new ListCounter();
      List<String> list = new ArrayList<>();
      list.add("alma");
      list.add("banán");
      list.add("Avokado");
      list.add("Aranyalma");
      list.add("gránátalma");
      list.add("körte");
      list.add("szilva");

      listCounter.countALetters(list);
  }
}
