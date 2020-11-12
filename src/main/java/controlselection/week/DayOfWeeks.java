package controlselection.week;

import java.util.Scanner;

public class DayOfWeeks {


    public void addDay(String dayOfWeek) {

        switch (dayOfWeek.toUpperCase()) {
            case "HÉTFŐ":
                System.out.println("Hét eleje");
                return;

            case "KEDD":
            case "SZERDA":
            case "CSÜTÖRTÖK":
                System.out.println("Hét közepe");
                return;

            case "PÉNTEK":
                System.out.println("Majdnem hétvége");
                return;

            case "SZOMBAT":
            case "VASÁRNAP":
                System.out.println("Hétvége");
                return;

            default:
                throw new IllegalArgumentException("Invalid day" + dayOfWeek);
        }
    }

    public static void main(String[] args) {

        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a hét napját!");
        String dayOfWeek = scanner.nextLine();
        dayOfWeeks.addDay(dayOfWeek);
        }

}

