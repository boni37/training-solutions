package covid;

import java.util.Scanner;

public class Vacination {


    public void vaccinationFulfilled() {
        Scanner scanner = new Scanner(System.in);
        String taj;
        String citizen_id;
        String dateOfVaccination;
        String vaccineType;
        System.out.println("*** Vaccination process ***");
        do {
            System.out.print("Add TAJ: ");
            taj = scanner.nextLine();
            citizen_id = new CovidDao().existTajCode(taj);
        } while (citizen_id == null);
        System.out.print("Add date /yyyy-mm-dd/ ");
        dateOfVaccination = scanner.nextLine();
        System.out.print("Add type of the vaccine : /Pfizer,Moderna,Szputnyik,Sinofarm/ ");
        vaccineType = scanner.nextLine();
        new CovidDao().writeVaccinationToDatabase(citizen_id, dateOfVaccination, "Vaccinated", "", vaccineType);
    }

}
