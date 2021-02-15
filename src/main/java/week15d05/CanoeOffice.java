package week15d05;

import java.time.LocalDateTime;
import java.util.*;

public class CanoeOffice {

    List<CanoeRental> canoeRentals = new ArrayList<>();

    public void createRental(CanoeRental canoeRental){

    }

    public void findRentalByName(String name){
        for(CanoeRental actual : canoeRentals){
            if((actual.getName().equals(name))&&(!actual.getEndTime().isEqual(null))) {
                System.out.println(actual.toString());;
            }
        }
    }

    public void closeRentalByName(String name, LocalDateTime endTime){
        for(CanoeRental actual : canoeRentals){
            if((actual.getName().equals(name))) {
                actual.setEndTime(endTime);
            }
        }
    }

    public double getRentalPriceByName(String name, LocalDateTime endTime){
        return 1.0;

    }

    public List<CanoeRental> listClosedRentals(){
        List<CanoeRental> closedRentals = new ArrayList<>();
        for(CanoeRental actual: canoeRentals){
            if(actual.getEndTime()!= null){
                closedRentals.add(actual);
            }
        }
        Collections.sort(closedRentals);
        return closedRentals;
    }

    public Map<CanoeType,Integer> countRentals(){
        Map<CanoeType,Integer> canoeRentalsByType = new HashMap<>();
        for(CanoeRental actual: canoeRentals){
            CanoeType type = actual.getCanoeType();
            if(!canoeRentalsByType.containsKey(type)){
                canoeRentalsByType.put(type,1);
            }else{
                canoeRentalsByType.put(type,canoeRentalsByType.get(type)+1);
            }
        }return canoeRentalsByType;
    }
}
