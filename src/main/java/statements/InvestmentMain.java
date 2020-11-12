package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Amount of investment:");
        int amount = scanner.nextInt();
        System.out.println("Interest rate:");
        int interestRate = scanner.nextInt();
        Investment investment = new Investment(amount, interestRate);
        System.out.println("Fund:"+ investment.getFund());
        System.out.println("Yield for 30 days :" + investment.getYield(30));
        System.out.println("Amount after 100 days :" + investment.close(100));
        System.out.println("Amount after 150 days :"+ investment.close(150));

    }
}
