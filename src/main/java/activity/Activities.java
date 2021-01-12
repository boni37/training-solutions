package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> activities = new ArrayList<>();
    private List<Report> reports = new ArrayList<>();
    private int mockInt;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public List<Report> distancesByTypes(){
        return reports;
    }

    public int numberOfTrackActivities(){
        int numberTracks = 0;
        for(Activity activity: activities){
            if(activity.getType() == (ActivityType.BIKING)||(activity.getType() == (ActivityType.RUNNING)||(activity.getType() == (ActivityType.HIKING)))){
                numberTracks +=1;
            }
        }

        return numberTracks;
    }

    public int numberOfWithoutTrackActivities(){
        int numberTracks = 0;
        for(Activity activity: activities){
            if(activity.getType() == (ActivityType.BASKETBALL)){
                numberTracks +=1;
            }
        }

        return numberTracks;
    }
}
