package covid;

public class PersonForVacination {

    private String name;
    private String zipCode;
    private int age;
    private String emailAddress;
    private String tajCode;

    public PersonForVacination(String name, String zipCode, int age, String emailAddress, String tajCode) {
        this.name = name;
        this.zipCode = zipCode;
        this.age = age;
        this.emailAddress = emailAddress;
        this.tajCode = tajCode;
    }

    public String getName() {
        return name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public int getAge() {
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTajCode() {
        return tajCode;
    }

    @Override
    public String toString() {
        return "{" +"name= " + name + ", zipCode= " + zipCode + ", age= " + age +", emailAddress= " + emailAddress + ", tajCode= " + tajCode+'}';
    }
}
