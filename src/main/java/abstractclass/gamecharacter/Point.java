package abstractclass.gamecharacter;

public class Point {

    private long x,y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long distance(Point position){
        long distance = (long) Math.sqrt(Math.pow((this.x-position.getX()),2)+Math.pow((this.y-position.getY()),2));
        return distance;
    }
}
