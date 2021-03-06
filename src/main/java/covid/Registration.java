package covid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {

    private List<PersonForVacination> persons = new ArrayList<>();

    public Registration() {
    }

    public Registration(List<PersonForVacination> persons) {
        this.persons = persons;
    }

    public List<PersonForVacination> getPersons() {
        return persons;
    }

    public boolean isValidName(String name){
        return name.isBlank();
    }

    public boolean isValidZipCode(String zipCode){
        if(zipCode.isBlank()) return true;
        String result = new CovidDao().existZipCode(zipCode);
        System.out.println(result);
        return (result.equals("ZIP does not exist."));
    }

    public boolean isValidAge(int age){
        return (age<10) | (age>150);
    }

    public boolean isValidEmail(String emailAddress){
        return (emailAddress.length()<3) & !(emailAddress.contains("@"));
    }

    public boolean isValidTajCode(String tajCode){
        int sum = Character.getNumericValue(tajCode.charAt(0))*3;
        for(int i=1; i<8; i++){
            if(i%2 != 0){
                sum += Character.getNumericValue(tajCode.charAt(i))*7;
            }else sum += Character.getNumericValue(tajCode.charAt(i))*3;
        }return (sum%10) != Character.getNumericValue(tajCode.charAt(8));
    }

    public void registratePerson(){
        String name;
        String zipCode;
        int age;
        String emailAddress;
        String emailAddress2;
        String tajCode;
        Registration registration = new Registration();
        List<PersonForVacination> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Add name: ");
            name = scanner.nextLine();
        }
        while(registration.isValidName(name));

        do{
            System.out.print("ZIP code: ");
            zipCode = scanner.nextLine();
        }
        while(registration.isValidZipCode(zipCode));

        do{
        System.out.print("Add age: ");
        age = scanner.nextInt();
        scanner.nextLine();
        }
        while(registration.isValidAge(age));

        do {
            System.out.print("Add e-mail: ");
            emailAddress = scanner.nextLine();
        }
        while(registration.isValidEmail(emailAddress));

        do {
            System.out.print("Repeat e-mail: ");
            emailAddress2 = scanner.nextLine();
        }
        while(!emailAddress.equals(emailAddress2));

        do{
            System.out.print("Add TAJ code: ");
            tajCode = scanner.nextLine();
        }
        while(registration.isValidTajCode(tajCode));

        persons.add(new PersonForVacination(name,zipCode,age,emailAddress,tajCode));
        new CovidDao().writeListToDatabase(persons);
    }



}
