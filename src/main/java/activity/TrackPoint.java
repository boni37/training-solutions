package activity;

public class TrackPoint {

    private Coordinate coordinate;
    private double elevation;


    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }

    public double getDistanceFrom(TrackPoint point){
        TrackPoint trackPoint = new TrackPoint(new Coordinate(12.5, 34.89), 123);
        double distance = Math.sqrt(Math.pow(point.coordinate.getLatitude()-trackPoint.coordinate.getLatitude(),2)+Math.pow(point.coordinate.getLongitude()-trackPoint.coordinate.getLongitude(),2));
        System.out.println(distance);
        return distance;
    }
}
