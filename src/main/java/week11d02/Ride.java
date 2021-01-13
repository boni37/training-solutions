package week11d02;

public class Ride {
    private int dayOfWeek; //a het melyik napjan szallitott 1-7
    private int transportOrderNumber; //hanyadik fuvar volt
    private int distance; //hany kilometer volt

    public Ride(int dayOfWeek, int transportOrderNumber, int distance) {
        this.dayOfWeek = dayOfWeek;
        this.transportOrderNumber = transportOrderNumber;
        this.distance = distance;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public int getTransportOrderNumber() {
        return transportOrderNumber;
    }

    public int getDistance() {
        return distance;
    }
}
