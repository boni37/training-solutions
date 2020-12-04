package dafaultconstructor;

public class SimpleDate {
    private int year;
    private int month;
    private int day;
    private int maxday;


    public void setDate(int year, int month, int day) {
        if(isCorrect(year,month,day)){
            this.year = year;
            this.month = month;
            if((day>0)&&(day<=calculateMontLength(year,month))){
                this.day = day;
            }else throw new IllegalArgumentException("Day is not valid!");
        } else throw new IllegalArgumentException("Year or month is not valid!");
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private boolean isCorrect(int year, int month, int day) {
        if ((year >= 1900) && ((month > 0) && (month < 13))) {
            return true;
        } return false;
    }

    private boolean isLeapYear(int year) {
        if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
            return true;
        } return false;
    }

    private int calculateMontLength(int year, int month) {
        if (isLeapYear(year)) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    maxday = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    maxday = 30;
                    break;
                case 2:
                    maxday = 29;
                    break;
            }
            return maxday;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    maxday = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    maxday = 30;
                    break;
                case 2:
                    maxday = 28;
                    break;
            }
        }
        return maxday;
    }
}
