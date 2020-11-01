package classstructuremethods;

import java.util.Scanner;

public class NoteMain {
    public static void masin(String[] args) {
      Note note = new Note();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String nameIn = scanner.nextLine();
        note.setName(nameIn);
        System.out.println("Topic:");
        String topicIn = scanner.nextLine();
        note.setTopic(topicIn);
        System.out.println("Text:");
        String textIn = scanner.nextLine();
        note.setText(textIn);
        System.out.println(note.getNoteText());



    }
}
