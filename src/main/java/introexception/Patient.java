package introexception;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int year) {
        if(name.length()==0){
            throw new IllegalArgumentException("Name must not be empty!");
        }else if( year < 1900){
            throw new IllegalArgumentException("Year of birth must not be less than 1900!");
        }
        this.name = name;
        this.socialSecurityNumber = ssn;
        this.yearOfBirth = year;

    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
