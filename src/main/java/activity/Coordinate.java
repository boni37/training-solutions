package activity;

public class Coordinate {

    private double latitude;
    private static final double LATMIN = -90;
    private static final double LATMAX = 90;
    private double longitude;
    private static final double LONGMIN = -180;
    private static final double LONGMAX = 180;

    public Coordinate(double latitude, double longitude) {
        if(latitude>LATMAX||latitude<LATMIN) throw new IllegalArgumentException();
        this.latitude = latitude;
        if(longitude>LONGMAX||longitude<LONGMIN) throw new IllegalArgumentException();
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
