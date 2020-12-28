package inheritancemethods;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PackedProduct extends Product{

    private int packingUnit;
    private BigDecimal weightOfBox;

    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }

    @Override
    public BigDecimal totalWeight(int pieces) {
        BigDecimal packageWeight = BigDecimal.valueOf(pieces/getPackingUnit()+1).multiply(getWeightOfBox());
        return packageWeight.add(super.totalWeight(pieces)).setScale(getNumberOfDecimals(), RoundingMode.HALF_UP);
    }
}
