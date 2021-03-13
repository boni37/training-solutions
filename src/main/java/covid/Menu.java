package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

    public void writeMenu() {
//        MariaDbDataSource dataSource= new MariaDbDataSource();
//        try {
//            dataSource.setUrl("jdbc:mariadb://localhost:3306/covid?useUnicode=true");
//            dataSource.setUser("covid");
//            dataSource.setPassword("covid");
//        } catch (SQLException sqlException) {
//            throw new IllegalStateException("Can not find database");
//        }

        System.out.println("*** Vacination process ***");
        System.out.println("***  Choose one number ***");
        System.out.println(" 1. Registration");
        System.out.println(" 2. Mass registration");
        System.out.println(" 3. Generate vacination list");
        System.out.println(" 4. Vacination");
        System.out.println(" 5. Abort vacination");
        System.out.println(" 6. Generate report");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int item = scanner.nextInt();
        scanner.nextLine();
        switch (item) {
            case 1: {
               new Registration().registratePerson();
               break;
            }
            case 2: {
                new MassRegistration().readFileName();
                break;
            }
            case 3: {
                System.out.println("Add zip code");
                String zip = scanner.nextLine();
                new GenerateFileByZipCode().generatedListForVaccination(zip);
                break;
            }
            case 4: {
                new Vacination().vaccinationFulfilled();
                break;
            }
            case 5: {
                new VacinationAborted().vaccinationAborted();
                break;
            }
            case 6: {
            }
            default: {

            }
        }

    }


}
