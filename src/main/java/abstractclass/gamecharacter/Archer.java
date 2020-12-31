package abstractclass.gamecharacter;

import java.util.Random;

public class Archer extends Character{

    private int numberOfArrow = 100;

    public Archer(Point position, Random random) {
        super(position, random);
    }

    public int getNumberOfArrow() {
        return numberOfArrow;
    }


    private int getActualSecondaryDamage() {
        Random random = new Random(123);
        return random.nextInt(6);
    }

    private void shootingAnArrow(Character enemy){
        numberOfArrow -= 1;
        hit(enemy,getActualSecondaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        shootingAnArrow(enemy);
    }
}
