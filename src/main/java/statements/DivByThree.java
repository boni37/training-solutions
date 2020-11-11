package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add an Integer!");
        int countOne = scanner.nextInt();
        System.out.println(countOne % 3 == 0 ? "Can div by 3!" : "Can not div by 3!");
    }
}
