package week02;

import java.util.Scanner;

public class Controller {

    private Office office = new Office();


    public void readOffice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many meeting rooms add?");
        int numMetRoom = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i< numMetRoom; i++){

            System.out.println("Name of meeting room?");
            String name = scanner.nextLine();
            System.out.println("Width of meeting room?");
            int width = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Length of meeting room?");
            int length = scanner.nextInt();
            scanner.nextLine();
            MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
            office.addMeetingRoom(meetingRoom);
        }
        System.out.println(office.getMeetingRooms());

    }

    public void printMenu() {

        Office office = new Office();
        System.out.println("""
                1. Tárgyalók sorrendben
                2. Tárgyalók visszafele sorrendben
                3. Minden második tárgyaló
                4. Területek
                5. Keresés pontos név alapján
                6. Keresés névtöredék alapján
                7. Keresés terület alapján
                """);
    }




    public void runMenu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one!");
        int chosenNum = scanner.nextInt();
        System.out.println();
        if (chosenNum == 1){
            office.printNames();
        } else if (chosenNum == 2){
            office.printNamesReverse();
        } else if (chosenNum == 3){
            office.printEventNames();
        } else if (chosenNum == 4){
            office.printAreas();
        } else if (chosenNum == 5){
            office.printMeetingRoomsWithName();
        } else if (chosenNum == 6){
            office.printMeetingRoomsContains();
        } else if(chosenNum == 7){
            office.printAreas();
        }
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }
}
