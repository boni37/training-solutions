package activity;

public class TrackPoint {

    private Coorinate coorinate;
    private double elevation;

    public TrackPoint(Coorinate coorinate, double elevation) {
        this.coorinate = coorinate;
        this.elevation = elevation;
    }

    public Coorinate getCoorinate() {
        return coorinate;
    }

    public double getElevation() {
        return elevation;
    }

    public double getDistanceFrom(TrackPoint point){
        return 3.0;
    }
}
