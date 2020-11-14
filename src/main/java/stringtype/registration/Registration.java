package stringtype.registration;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Registration {

   private String username;
   private String password1;
   private String password2;
   private String email;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword1() {
        return password1;
    }

    public String getPassword2() {
        return password2;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {

        Registration registration = new Registration();
        Scanner scanner = new Scanner(System.in);
        UserValidator userValidator = new UserValidator();
        System.out.println("Add username!");
        registration.setUsername(scanner.nextLine());
        System.out.println(userValidator.isValidUsername(registration.getUsername()) ? "Username OK!" : "Username Not OK!" );
        System.out.println("Add password1!");
        registration.setPassword1(scanner.nextLine());
        System.out.println("Add password2!");
        registration.setPassword2(scanner.nextLine());
        System.out.println(userValidator.isValidPassword(registration.getPassword1(), registration.getPassword2()) ? "Password Ok!" : "Password Not Ok!");
        System.out.println("Add e-mail!");
        registration.setEmail(scanner.nextLine());
        System.out.println(userValidator.isValidEmail(registration.getEmail()) ? "E-mail ok!": "Email Not OK!");

    }
}
