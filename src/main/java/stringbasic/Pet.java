package stringbasic;

import java.time.LocalDate;

public class Pet {
    private String name;
    private LocalDate date;
    private Gender gender;
    private String registrationNumber;

    public Pet(String name, LocalDate date, Gender gender, String registrationNumber) {
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public Gender getGender() {
        return gender;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
