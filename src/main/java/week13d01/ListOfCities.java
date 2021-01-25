package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ListOfCities {

    private List<City> cities = new ArrayList<>();

    public static void main(String[] args) {

        Path file = Path.of("src","main","resources","iranyitoszamok-varosok-2021.csv");
        try {
            List<City> cities = new ArrayList<>();
            BufferedReader reader = Files.newBufferedReader(file);
            String line;
            while((line=reader.readLine())!=null){
                if(line.lastIndexOf(";")!=line.length()-1){
                    String[] s=line.split(";");
                    String zipcode = s[0];
                    String cityName = s[1];
                    String cityPart = s[2];
                    cities.add(new City(zipcode,cityName,cityPart));
                }
                else{
                    String[] s=line.split(";");
                    String zipcode = s[0];
                    String cityName = s[1];
                    String cityPart = "";
                    cities.add(new City(zipcode,cityName,cityPart));
                }

            }
            int indexOfLongestName = 0;
            for(int i=1; i<cities.size();i++){
                if(cities.get(i).getTelepules().length()>cities.get(indexOfLongestName).getTelepules().length())
                    indexOfLongestName = i;
            }System.out.println(cities.get(indexOfLongestName).getIRSZ()+";"+cities.get(indexOfLongestName).getTelepules()+";"+cities.get(indexOfLongestName).getTelepulesresz());
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.",ioe);
        }
    }
}
