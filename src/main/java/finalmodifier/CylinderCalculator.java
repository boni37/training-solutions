package finalmodifier;

import static finalmodifier.CircleCalculator.PI;

public class CylinderCalculator {

    public double calculateVolume(double r, double h){
        return PI*r*r*h;
    }

    public double calculateSurfaceArea(double r, double h){
        return 2*PI*r*r+2*r*PI*h;
    }


}
