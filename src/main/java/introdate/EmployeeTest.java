package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of employee:");
        String name = scanner.nextLine();
        System.out.println("Year of birth:");
        int year = scanner.nextInt();
        System.out.println("Month of birth:");
        int month = scanner.nextInt();
        System.out.println("Day of birth:");
        int day= scanner.nextInt();
        LocalDate dateOFBirth = LocalDate.of(year,month,day);
        LocalDateTime beginEmployment = LocalDateTime.now();
        Employee employee = new Employee(name, dateOFBirth,beginEmployment);
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee date of birth: " + employee.getDateOfBirth());
        System.out.println("Begin deployment: " + employee.getBeginEmployment());


    }
}
