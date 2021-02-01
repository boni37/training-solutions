package week14d01;

import java.util.*;

public class Indexer{

    public Map<Character, List<String>> index(List<String> names){
        Map<Character,List<String>> map= new HashMap<>();
        Collections.sort(names);
        for(String actual:names){
            Character firstCharacter = actual.toUpperCase().charAt(0);
            if(!map.containsKey(firstCharacter)){
                map.put(firstCharacter,new ArrayList<>());
            }map.get(firstCharacter).add(actual);
        }return map;
    }

    public static void main(String[] args) {
        System.out.println(new Indexer().index(Arrays.asList("Odon","Lujza","Abraham","Magdolna","Arnold","Oszkar")));
    }

}
