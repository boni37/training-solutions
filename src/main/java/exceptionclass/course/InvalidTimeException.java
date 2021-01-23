package exceptionclass.course;

public class InvalidTimeException extends RuntimeException{

    private int hour;
    private int minute;
    private String time;

    public InvalidTimeException(int hour, int minute, String time) {
        this.hour = hour;
        this.minute = minute;
        this.time = time;
    }

    public InvalidTimeException(String message, int hour, int minute) {
        super(message);
        this.hour = hour;
        this.minute = minute;
    }

    public InvalidTimeException(String message,String time) {
        super(message);
        this.time = time;
    }


    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getTime() {
        return time;
    }
}
