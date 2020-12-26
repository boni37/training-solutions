package inheritanceconstructor;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    @Override
    public void modifyFuelAmount(double fuel) {
        super.modifyFuelAmount(fuel);
    }

    @Override
    public void drive(int km) {
        double fuelCanDrive = super.getFuel();
        fuelCanDrive -= super.getFuelRate()/100*km + this.getExtraFuel();
        if(fuelCanDrive < 0) throw new IllegalArgumentException("Not enough fuel available!");
    }

    @Override
    public double calculateRefillAmount() {
        return super.getTankCapacity()+ (this.extraCapacity-(super.getFuel()+this.extraFuel));
    }
}
