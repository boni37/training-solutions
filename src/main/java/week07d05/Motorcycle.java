package week07d05;

public class Motorcycle extends Vehicle{

    public Motorcycle() {
        super();
        this.setTransmissionType(TransmissionType.SEQUENTIAL);
    }

    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();
        System.out.println(motorcycle.getTransmissionType());
        System.out.println(motorcycle.getNumberOfGears());
    }
}
