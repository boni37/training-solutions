package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();
    private double mockReturn = 5.2;
    private Coordinate mockCoordinate;



    public void addTrackPoint(TrackPoint trackPoint){
        trackPoints.add(trackPoint);
    }

    public Coordinate findMaximumCoordinate(){
        return mockCoordinate;
    }

    public Coordinate findMinimumCoordinate(){
        return mockCoordinate;
    }

    public double getDistance(){
        return mockReturn;
    }

    public double getFullDecrease(){
        return mockReturn;
    }

    public double getFullElevation(){
        return mockReturn;
    }

    public double getRectangleArea(){
        return mockReturn;
    }


    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }
}
