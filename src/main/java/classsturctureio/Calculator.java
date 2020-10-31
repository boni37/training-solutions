package classsturctureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please first number!");
        int numOne = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please second number!");
        int numTwo = scanner.nextInt();
        scanner.nextLine();
        System.out.println(numOne + "+" + numTwo);
        System.out.println("(" + (numOne + numTwo) + ")");

    }
}
