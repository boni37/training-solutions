package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FlightStatistics {

    private List<Flight> flights = new ArrayList<>();

    public List<Flight> readFlightFromFile(Path file){
        List<Flight> flights = new ArrayList<>();
        try {
            BufferedReader reader = Files.newBufferedReader(file);
            String line;
            while ((line = reader.readLine())!=null){
                String[] flight = line.split(" ");
                String flightNum = flight[0];
                String flightType = flight[1];
                String flightTown = flight[2];
                String flightTime = flight[3];
                flights.add(new Flight(flightNum,flightType,flightTown,flightTime));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.",ioe);
        }return flights;
    }

    public boolean arrivalMoreThanDepature(List<Flight> flights){
        int arrivalCount = 0;
        int departureCount = 0;
        for(Flight actual:flights){
            if(actual.getFlightType().equals("Arrival"))arrivalCount+=1;
            else departureCount+=1;
        }return arrivalCount>departureCount;
    }

    public Flight searchByFlightNum(List<Flight> flights,String flightNum){
        Flight flight = null;
        for(Flight actual: flights){
            if(actual.getFlightNumber().equals(flightNum)){
                flight = actual;
            }
        }return flight;
    }

    public List<String> flightsToCity(List<Flight> flights, String city, String flightType){
        List<String> flightsToCity = new ArrayList<>();
        for(Flight actual:flights){
            if((actual.getDestinationCity().equals(city))&&(actual.getFlightType().equals(flightType))) flightsToCity.add(actual.getFlightNumber());
        }return flightsToCity;
    }

    public Flight earliestFlight(List<Flight> flights){
        Flight flight = null;
        for(Flight actual:flights){

        }return flight;
    }

    public static void main(String[] args) {
        Path file = Path.of("cities.txt");
        FlightStatistics fs = new FlightStatistics();
        System.out.println("Arrival was more than departure? "+ fs.arrivalMoreThanDepature(fs.readFlightFromFile(file)));
        System.out.println("Search KH2442 flight :" + fs.searchByFlightNum(fs.readFlightFromFile(file),"KH2442").toString());
        System.out.println("Search flights arrive from Moscow :"+fs.flightsToCity(fs.readFlightFromFile(file),"Moscow","Arrival").toString());
    }
}
