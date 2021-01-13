package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private static List<Ride> rides = new ArrayList<>();

    public List<Ride> getRides() {
        return rides;
    }

    public void addRide(Ride ride){
        Courier courier = new Courier();
        if(courier.isValidDay(ride)) {
            rides.add(ride);
        }
    }

    public boolean isValidDay(Ride ride){
        for(int i=0; i< rides.size();i++){
            if((ride.getDayOfWeek()>7||ride.getDayOfWeek()<1)){
                throw new IllegalArgumentException("The day is not valid.");
            }
            else if(rides.get(i).getDayOfWeek() > ride.getDayOfWeek()){
                throw new IllegalArgumentException("This Day has gone.");
            }
            else if(rides.get(i).getDayOfWeek() == ride.getDayOfWeek() & (rides.get(i).getTransportOrderNumber() > ride.getTransportOrderNumber())){
                throw new IllegalArgumentException("The Transport number is not valid.");
            }
        }return true;
    }

}
