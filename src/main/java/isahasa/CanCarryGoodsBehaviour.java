package isahasa;

public class CanCarryGoodsBehaviour implements CanCarryGoods{

    private int cargoWeight;
    private int maxCargoWeight;

    public CanCarryGoodsBehaviour(int maxCargoWeight) {
        this.maxCargoWeight = maxCargoWeight;
    }

    public int getMaxCargoWeight() {
        return maxCargoWeight;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
        int remainder = 0;

        if (cargoWeight <= maxCargoWeight) {
            this.cargoWeight = cargoWeight;
        } else
        {
            remainder = cargoWeight - maxCargoWeight;
            this.cargoWeight = maxCargoWeight;
        }
       return remainder;
    }


}
