package isahasa;

public class FerryBoat implements Ship, CanCarryGoods, CanCarryPassengers{

    private CanCarryPassengers canCarryPassengers;
    private CanCarryGoods canCarryGoods;

    public FerryBoat(CanCarryPassengers canCarryPassengers, CanCarryGoods canCarryGoods) {
        this.canCarryPassengers = canCarryPassengers;
        this.canCarryGoods = canCarryGoods;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        return canCarryGoods.loadCargo(cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return 0;
    }

    @Override
    public int loadPassenger(int passengers) {
        return canCarryPassengers.getPassengers();
    }

    @Override
    public int getPassengers() {
        return 0;
    }
}
