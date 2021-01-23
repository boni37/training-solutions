package exceptionclass.course;

public class SimpleTime {
    private int hour;
    private int minute;
    private String timeStr;

    public SimpleTime(int hour, int minute) {
        if(hour>23|hour<0)throw new InvalidTimeException("Hour is invalid (0-23)",hour,minute);
        if(minute>59|minute<0)throw new InvalidTimeException("Minute is invalid (0-59)",hour,minute);
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String timeStr) {
        if(timeStr==null) throw new InvalidTimeException("Time is null",timeStr);
        if(timeStr.length()!=5) throw new InvalidTimeException("Time is not hh:mm",timeStr);
        if(timeStr.charAt(2)!= ':') throw new InvalidTimeException("Time is not hh:mm",timeStr);
        String[] s=timeStr.split(":");
        int h=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        if((h>23)|(h)<0)throw new InvalidTimeException("Hour is invalid (0-23)",timeStr);
        if((m>59)|(m<0))throw new InvalidTimeException("Minute is invalid (0-59)",timeStr);
        this.hour=h;
        this.minute=m;
    }

    @Override
    public String toString() {
        return (String.format("%02d:%02d",hour,minute));
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getTimeStr() {
        return timeStr;
    }
}
