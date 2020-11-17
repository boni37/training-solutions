package finalmodifier;

public class CircleCalculator {
    public static final double PI = 3.1415;

    public double calculatePerimeter(double r){
        return PI*2*r;
    }

    public double calculateArea(double r){
        return PI*r*r;
    }

    public static void main(String[] args) {
        System.out.println(new CircleCalculator().calculatePerimeter(5.6)+" mm");
        System.out.println(new CircleCalculator().calculateArea(2.3)+" mm2");
    }
}
