package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Time firstTime = new Time();
        System.out.println("Add first time hour!");
        firstTime.setHour(scanner.nextInt());
        System.out.println("Add first time minutes!");
        firstTime.setMinute(scanner.nextInt());
        System.out.println(("Add first time seconds!"));
        firstTime.setSecond(scanner.nextInt());
        scanner.nextLine();

        Time secondTime = new Time();
        System.out.println("Add second time hour!");
        secondTime.setHour(scanner.nextInt());
        System.out.println("Add second time minutes!");
        secondTime.setMinute(scanner.nextInt());
        System.out.println(("Add second time seconds!"));
        secondTime.setSecond(scanner.nextInt());
        scanner.nextLine();

        System.out.println("First time in minutes:"+ firstTime.toString() + " = " + firstTime.getInMinutes() + " minute");
        System.out.println("Second time in seconds:" + secondTime.toString() + " = " + secondTime.getInSeconds() + " second");
        System.out.println("The first is earlier than second:" + firstTime.earlierThan(secondTime));



    }
}
