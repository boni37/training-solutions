package statements;

public class Time {
    private int hour;
    private int minute;
    private int second;

    /*public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }*/

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int getInMinutes(){
        int timeShowMinutes = hour*60+minute;
        return timeShowMinutes;
    }

    public int getInSeconds(){
        int timeShowSeconds = (hour*60+minute)*60+second;
        return timeShowSeconds;
    }

    public boolean earlierThan(Time other){
        int firstTime = this.getInSeconds();
        int secondTime = other.getInSeconds();
        return firstTime < secondTime;
    }

    public String toString(){
        return hour + " : " + minute + " : " + second;
    }
}
