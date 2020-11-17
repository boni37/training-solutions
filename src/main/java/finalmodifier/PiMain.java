package finalmodifier;

public class PiMain {

    public static void main(String[] args) {
        System.out.println("PI="+ CircleCalculator.PI);
        System.out.println(new CylinderCalculator().calculateVolume(1,1));
        System.out.println(new CylinderCalculator().calculateSurfaceArea(1,1));
    }


}
