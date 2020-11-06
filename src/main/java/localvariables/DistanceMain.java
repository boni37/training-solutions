package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(3.2238, true);
        System.out.println(distance.getDistanceInKm() + "km :" + distance.isExact());

        int distancePart = (int) distance.getDistanceInKm();
        System.out.println(distancePart);



    }
}
