package week08d01;

public class Robot {

    private final int xOrigo=0;
    private final int yOrigo=0;
    private int xCoordinate;
    private int yCoordinate;

    public Robot() {

    }

    public Robot(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public Robot positionAfterMove(String movement){
        xCoordinate = xOrigo;
        yCoordinate = yOrigo;
        char[] goThere = movement.toUpperCase().toCharArray();
        for (int i=0; i<goThere.length; i++){
            switch (goThere[i]){
                case 'F': yCoordinate++; break;
                case 'L': yCoordinate--; break;
                case 'B': xCoordinate--; break;
                case 'J': xCoordinate++; break;
                default: throw new IllegalArgumentException("This movement is not right!");
            }
        }
        Robot robot = new Robot(xCoordinate,yCoordinate);
        return robot;
    }

    @Override
    public String toString() {
        return "xCoordinate= " + xCoordinate + ","+" yCoordinate= " + yCoordinate ;
    }
}
