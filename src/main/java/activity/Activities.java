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
        return mockInt;
    }

    public int numberOfWithoutTrackActivities(){
        return mockInt;
    }
}
