package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

    private String name;
    private LocalDate dateOfBirth;
    private LocalDateTime beginEmployment;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDateTime getBeginEmployment() {
        beginEmployment = LocalDateTime.now();
        return beginEmployment;
    }

    public Employee(String name, LocalDate dateOfBirth, LocalDateTime beginEmployment) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.beginEmployment = beginEmployment;
    }
}
