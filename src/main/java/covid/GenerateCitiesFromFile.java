package covid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GenerateCitiesFromFile {

    static class  City{
        private int zip;
        private String cityName;
        public City() {
        }
        public City(int zip, String cityName) {
            this.zip = zip;
            this.cityName = cityName;
        }
        public int getZip() {
            return zip;
        }

        public String getCityName() {
            return cityName;
        }

        @Override
        public String toString() {
            return "City{" +
                    "zip=" + zip +
                    ", cityName='" + cityName + '\'' +
                    '}';
        }
    }

    private List<City> cities = new ArrayList<>();


    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        try (BufferedReader reader = new  BufferedReader(new InputStreamReader(GenerateCitiesFromFile.class.getResourceAsStream("iranyitoszamok.csv")))) {
            String line;
            reader.readLine();
            while((line= reader.readLine())!=null){
                String[] partsCity = line.split(";");
                int zipCode = Integer.parseInt(partsCity[0]);
                String cityCode = partsCity[1];
                cities.add(new City(zipCode,cityCode));
            }
           new CovidDao().zipListToDatabase(cities);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
