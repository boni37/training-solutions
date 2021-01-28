package week13d02;

public class Flight {

    private String flightNumber;
    private String flightType;
    private String destinationCity;
    private String arrDepTime;

    public Flight(String flightNumber, String flightType, String destinationCity, String arrDepTime) {
        this.flightNumber = flightNumber;
        this.flightType = flightType;
        this.destinationCity = destinationCity;
        this.arrDepTime = arrDepTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getFlightType() {
        return flightType;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public String getArrDepTime() {
        return arrDepTime;
    }

    @Override
    public String toString() {
        return "FlightNumber='" + flightNumber + '\'' +
                ", FlightType='" + flightType + '\'' +
                ", DestinationCity='" + destinationCity + '\'' +
                ", ArrDepTime='" + arrDepTime + '\'';
    }
}
