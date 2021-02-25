package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    private Map<String, Integer> owlsByCounty = new HashMap<>();

    public void readFromFile(BufferedReader reader)throws IOException {
        String line;
        while((line=reader.readLine())!=null){
            String[] counties = line.split("=");
            String countyName = counties[0];
            int numberOfOwls = Integer.parseInt(counties[1]);
            owlsByCounty.put(countyName,numberOfOwls);
        }
    }

    public int getNumberOfOwls(String county){
        return owlsByCounty.get(county);
    }
}
