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
        double sumElevation = 0.00;
        for(int i = 1; i < trackPoints.size(); i++){
            if(trackPoints.get(i-1).getElevation() < trackPoints.get(i).getElevation()){
                sumElevation += trackPoints.get(i).getElevation() -trackPoints.get(i-1).getElevation();
            }
        }return sumElevation;
    }

    public double getRectangleArea(){
        return mockReturn;
    }


    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }
}
