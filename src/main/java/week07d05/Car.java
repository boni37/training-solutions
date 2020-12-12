package week07d05;

public class Car extends Vehicle{

    public Car() {
        super();
        this.setTransmissionType(TransmissionType.AUTOMATIC);
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getTransmissionType());
        System.out.println(car.getNumberOfGears());
    }
}
