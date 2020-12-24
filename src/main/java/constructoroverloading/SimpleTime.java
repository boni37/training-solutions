package constructoroverloading;

public class SimpleTime {

    private int hours,minutes;

    public SimpleTime(int hours) {
        this(hours,0);
    }

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(SimpleTime time) {
        this(time.hours,time.minutes);
    }

    public int difference(SimpleTime time){
        return timeInMinutes() - time.timeInMinutes();

    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    private int timeInMinutes(){
        return 60*hours + minutes;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }

}
