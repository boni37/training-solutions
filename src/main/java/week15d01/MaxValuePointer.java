package week15d01;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class MaxValuePointer {

    public static void main(String[] args) {
        Map<Integer, Double> functionMax = new TreeMap<>();
        for (int x = -20; x < 21; x++) {
            Double y = (double) x * x + 2 * x + 3;
            functionMax.put(x, y);
        }
        Double maxY = Collections.max(functionMax.values());
        for(Map.Entry entry:functionMax.entrySet()){
            if(entry.getValue()==maxY){
                System.out.println((Integer) entry.getKey());
            }
        }
    }
}
