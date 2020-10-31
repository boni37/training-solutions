package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.name = "Black Panther";
        client.yearOfBirth = 1927;
        client.address = "NY 5thAvn";
        System.out.println(client.name + "," + client.yearOfBirth + "," + client.address);

        Client newClient = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name!");
        newClient.name = scanner.nextLine();
        System.out.println("Year of birth!");
        newClient.yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Your address!");
        newClient.address = scanner.nextLine();
        System.out.println(newClient.name + "," + newClient.yearOfBirth + "," + newClient.address);
    }
}
