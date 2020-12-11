package week07d05;

public class Vehicle {


    private TransmissionType transmissionType;
    private int numberOfGears;

    public Vehicle(TransmissionType transmissionType, int numberOfGears) {
        this.transmissionType = TransmissionType.MANUAL;
        this.numberOfGears = 5;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }
}
