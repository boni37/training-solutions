package ioreaderclasspath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countries = new ArrayList<>();

    public CountryStatistics() {
    }

    public CountryStatistics(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public String countryWithMostNeighbours(){
        int max = 0;
        for(int i = 1; i< countries.size();i++){
           if(countries.get(i).getNeighbourNumber()>countries.get(max).getNeighbourNumber()){
               max = i;
           }
        }
        return countries.get(max).getCountryName();

    }

    public void readCountries(){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(CountryStatistics.class.getResourceAsStream("/country.txt")))){
            String line;
            while( (line = reader.readLine()) !=null){
                String countryFromFile[] = line.split(" ");
                Country country = new Country(countryFromFile[0],Integer.parseInt(countryFromFile[1]));
                countries.add(country);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file",ioe);
        }
    }

    public int numOfCountries(){
        return countries.size();
    }



    public static void main(String[] args) {
        CountryStatistics countryStatistics = new CountryStatistics();
        countryStatistics.readCountries();
       for(Country actual: countryStatistics.getCountries()){
           System.out.println(actual.getCountryName()+":"+actual.getNeighbourNumber());
       }
        System.out.println("Number of countries: "+countryStatistics.numOfCountries());
        System.out.println("Country with most neighbours :"+countryStatistics.countryWithMostNeighbours());
    }
}
