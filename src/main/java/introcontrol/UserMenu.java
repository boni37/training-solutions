package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: Kilépés");
        int i = scanner.nextInt();
        if (i==1){
            System.out.println("Felhasználók listázása");
        }else {
            System.out.println("Felhasználók felvétele");
        }
    }
}
