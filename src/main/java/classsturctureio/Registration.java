package classsturctureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name!");
        String name = scanner.nextLine();
        System.out.println("Your e-mail!");
        String email = scanner.nextLine();
        System.out.println("Name:" + name +" email:" + email);
    }
}
