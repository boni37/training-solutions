package abstractclass.gamecharacter;

import java.util.Random;

public class AxeWarrior extends Character{

    public AxeWarrior(Point position, Random random) {
        super(position, random);
    }

    private int getActualSecondaryDamage(){
        Random random = new Random(123);
        return 2*random.nextInt(getActualPrimaryDamage());
    }

    @Override
    public void secondaryAttack(Character enemy) {
        if(getPosition().distance(enemy.getPosition()) < 2);
        hit(enemy,getActualSecondaryDamage());
    }
}
