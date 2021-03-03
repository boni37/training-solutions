package activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class ActivityTrackerMain {

    private Activity activity;

    public static void main(String[] args) {
        Activity activity1 = new Activity(LocalDateTime.of(2021,01,12,13,20),"Runing on track",ActivityType.RUNNING);
        Activity activity2 = new Activity(LocalDateTime.of(2021,02,22,14,20),"Biking to Visegrad",ActivityType.BIKING);
        Activity activity3 = new Activity(LocalDateTime.of(2021,01,28,11,20),"Hiking Csilleberc",ActivityType.HIKING);
        Activity activity4 = new Activity(LocalDateTime.of(2021,03,1,13,20),"Basketball on track",ActivityType.BASKETBALL);

        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
            Connection con = dataSource.getConnection();
            PreparedStatement stmt = con.prepareStatement("insert into activites (startTime,activity_desc,activity_type) values(?,?,?)");
            stmt.
        } catch (SQLException sqlException) {
            throw new IllegalArgumentException("Can not read",sqlException);
        }


    }
}
