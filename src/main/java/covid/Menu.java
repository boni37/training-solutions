package covid;

import java.util.Scanner;

public class Menu {

    public void writeMenu(){
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
//        scanner.nextLine();
        switch (item) {
            case 1: {
               new Registration().registratePerson();
            }
            case 2: {
            }
            case 3: {
            }
            case 4: {
            }
            case 5: {
            }
            case 6: {
            }
            default: {

            }
        }

    }


}
