package week02;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        MeetingRoom meetingRoom = new MeetingRoom();

        System.out.println("Hany darab targyalot szeretne rogziteni?");
        Scanner scanner = new Scanner(System.in);
        int numMeetingRooms = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kerem a targyalo nevet!");
        meetingRoom.setName(scanner.nextLine());
        System.out.println("Kerem a targyalo szelesseget!/m");
        meetingRoom.setWidth(scanner.nextInt());
        System.out.println("Kerem a targyalo hosszat!/m");
        meetingRoom.setLength(scanner.nextInt());
        System.out.println(meetingRoom.getName()+meetingRoom.getWidth()+meetingRoom.getLength()+meetingRoom.getArea(meetingRoom.getLength(),meetingRoom.getWidth()));


    }
}
