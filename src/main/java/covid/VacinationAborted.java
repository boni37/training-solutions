package covid;

import java.util.Scanner;

public class VacinationAborted {


    public void vaccinationAborted() {
        Scanner scanner = new Scanner(System.in);
        String taj;
        String citizen_id;
        String dateOfVaccination;
        String reason;
        System.out.println("*** Vaccination process ***");
        do {
            System.out.print("Add TAJ: ");
            taj = scanner.nextLine();
            citizen_id = new CovidDao().existTajCode(taj);
        } while (citizen_id == null);
        System.out.print("Add date /yyyy-mm-dd/ ");
        dateOfVaccination = scanner.nextLine();
        System.out.print("Add reason of cancellation :  ");
        reason = scanner.nextLine();
        new CovidDao().writeVaccinationToDatabase(citizen_id, dateOfVaccination, "Canceled", reason, "");
    }
}
