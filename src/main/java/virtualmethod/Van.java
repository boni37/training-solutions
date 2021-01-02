package virtualmethod;

public class Van extends Car{

    private int cargoWeight;

    public Van(int vehicleWeight, int numberPassenger, int cargoWeight) {
        super(vehicleWeight, numberPassenger);
        this.cargoWeight = cargoWeight;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public int getGrossLoad() {
        return super.getGrossLoad() + getCargoWeight();
    }

    @Override
    public String toString() {
        return "Van{" + "cargoWeight=" + cargoWeight + ", numberOfPassenger=" + getNumberPassenger() + ", vehicleWeight=" + getVehicleWeight() + '}';
    }
}
