package classstuctureintegrate;

import java.util.Scanner;

    public class Bank {

        public static void ma1in(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("New account number?");
            String accountNumber = scanner.nextLine();

            System.out.println("Owner?");
            String owner = scanner.nextLine();

            System.out.println("Start amount?");
            int amount = scanner.nextInt();
            scanner.nextLine();

            BankAccount account1 = new BankAccount(accountNumber, owner, amount);

            System.out.println("New account number?");
            String accountNumber2 = scanner.nextLine();

            System.out.println("Owner?");
            String owner2 = scanner.nextLine();

            System.out.println("Start amount?");
            int amount2 = scanner.nextInt();

            BankAccount account2 = new BankAccount(accountNumber2, owner2, amount2);

            System.out.println(account1.getInfo());
            System.out.println(account2.getInfo());

            System.out.println("Deposit in first account?");
            int depositAmount = scanner.nextInt();
            account1.deposit(depositAmount);

            System.out.println(account1.getInfo());

            System.out.println("Withdraw from second account?");
            int withdrawAmount = scanner.nextInt();
            account2.withdraw(withdrawAmount);

            System.out.println(account2.getInfo());

            System.out.println("Transfer from first to second?");
            int transferAmount = scanner.nextInt();
            account1.transfer(account2, transferAmount);

            System.out.println(account1.getInfo());
            System.out.println(account2.getInfo());
        }
    }

