package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void bookPassenger(Passenger passenger){
        if(passengers.size()< getBoat().getMaxPassengers()){
            if(!passengers.contains(passenger)){
                passengers.add(passenger);
            }
        }else throw new IllegalArgumentException();

    }

    public double getPriceForPassenger(Passenger passenger){
        double price = getBasicPrice();
        switch (passenger.getCruiseClass()){
            case LUXURY -> price*=3.0;
            case FIRST -> price*=1.8;
            case SECOND -> price*=1.0;
        }
        return price;
    }

    public Passenger findPassengerByName(String name){
        for(Passenger actual: passengers){
            if(actual.getName().equals(name)) return actual;
        }return null;
    }

    public List<String> getPassengerNamesOrdered(){
        List<String> sortedList = new ArrayList<>();
        for(Passenger actual:passengers){
            sortedList.add(actual.getName());
        }
        Collections.sort(sortedList);
        return sortedList;
    }

    public double sumAllBookingsCharged(){
        double sum = 0.0;
        for(Passenger actual : passengers){
            sum += getPriceForPassenger(actual);
        }
        return sum;

    }

    public Map<CruiseClass,Integer> countPassengerByClass(){
        Map<CruiseClass,Integer> countPassByClass = new HashMap<>();
        for(Passenger actual: passengers){
            CruiseClass type = actual.getCruiseClass();
            if(!countPassByClass.containsKey(type)){
                countPassByClass.put(type,1);
            }else{
                countPassByClass.put(type,countPassByClass.get(type)+1);
            }
        }return countPassByClass;
    }
}
