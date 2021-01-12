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
        double R = 6378.137;
        double dLat = point.coordinate.getLatitude()*Math.PI/180-trackPoint.coordinate.getLatitude()*Math.PI/180;
        double dLon = point.coordinate.getLongitude()*Math.PI/180-trackPoint.coordinate.getLongitude()*Math.PI/180;
        double a = Math.sin(dLat/2)*Math.sin(dLat/2) + Math.cos(trackPoint.coordinate.getLatitude()*Math.PI/180)*Math.cos(point.coordinate.getLatitude()*Math.PI/180)* Math.sin(dLon/2)*Math.sin(dLon/2);
        double c = 2*Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double d = R*c;
        System.out.println(d);
        return d*1000;
    }
}
