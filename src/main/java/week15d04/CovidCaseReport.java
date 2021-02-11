package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class CovidCaseReport {

    public static void main(String[] args) {
        Path file = Path.of("data.csv");
        Map<String,Integer> mapOfCases = new TreeMap<>();
        try (BufferedReader reader = Files.newBufferedReader(file)){
            String line;
            while((line= reader.readLine())!=null){
                if(line.contains("Hungary")){
                    String[] dataOfReport = line.split(",");
                    String keyMapOfCases = dataOfReport[1];
                    Integer valueMapOfCases = Integer.parseInt(dataOfReport[2]);
                    mapOfCases.put(keyMapOfCases,valueMapOfCases);
                }
            }
            System.out.println(mapOfCases);
            Integer maxValue = Collections.max(mapOfCases.values());
            for(Map.Entry entry: mapOfCases.entrySet()){
                if(entry.getValue()==maxValue) System.out.println(entry.getKey());
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}
