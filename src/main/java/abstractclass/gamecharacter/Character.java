package abstractclass.gamecharacter;

import java.util.Random;

public abstract class Character {

    private Point position;
    private int hitPoint = 100;
    private Random random;

    public Character(Point position, Random random) {
        this.position = position;
        this.random = random;
    }

    public Point getPosition() {
        return position;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public Random getRandom() {
        return random;
    }

    public boolean isAlive(){
        if(hitPoint > 0) return true;
        return false;
    }

    protected int getActualPrimaryDamage(){
        Random random = new Random(10);
        return random.nextInt(11);
    }

    private int getActualDefence(){
        Random random = new Random(10);
        return random.nextInt(6);
    }

    protected void hit(Character enemy, int damage){
        if(enemy.getActualDefence()< damage) {
            enemy.decreaseHitPoint(damage);
        }
    }

    public void primaryAttack(Character enemy){
        enemy.hit(enemy,getActualPrimaryDamage());
    }

    private void decreaseHitPoint(int diff) {
        int actualHitPoint = hitPoint - diff;
    }

    abstract public void secondaryAttack(Character enemy);


}
