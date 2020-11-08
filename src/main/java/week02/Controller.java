package week02;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Controller {

    private Office office;


    public void readOffice() {
        Office office = new Office();
        Scanner scanner = new Scanner(System.in);
        MeetingRoom meetingRoom = new MeetingRoom();

        System.out.println("How many meeting rooms add?");
        int numMetRoom = scanner.nextInt();

        for (int i = 0; i< numMetRoom; i++){
            System.out.println("Name of meeting room?");
            meetingRoom.setName(scanner.next());
            System.out.println("Width of meeting room?/m");
            meetingRoom.setWidth(scanner.nextInt());
            System.out.println("Length of meeting room?/m");
            meetingRoom.setLength(scanner.nextInt());

        }


    }

    public void printMenu() {

    }

    public void runMenu() {

    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();

    }
}
