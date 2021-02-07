package clone.timesheet;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeSheetItem {

    private String employee;
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem item) {
        employee = item.employee;
        project = item.project;
        from = item.from;
        to = item.to;
    }

    public String getEmployee() {
        return employee;
    }


    public String getProject() {
        return project;
    }

     public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public static TimeSheetItem withDifferentDay(TimeSheetItem item, LocalDate anotherDay){
        TimeSheetItem differentDay = new TimeSheetItem(item);
        differentDay.from = LocalDateTime.of(anotherDay,differentDay.from.toLocalTime());
        differentDay.to = LocalDateTime.of(anotherDay,differentDay.to.toLocalTime());
        return differentDay;
    }
}
