package week07d05;

public class Vehicle {


    private TransmissionType transmissionType;
    private int numberOfGears;

    public Vehicle() {
        this.setNumberOfGears(5);
    }

    public Vehicle(TransmissionType transmissionType, int numberOfGears) {
        this.transmissionType = TransmissionType.MANUAL;
        this.numberOfGears = 5;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }
}
