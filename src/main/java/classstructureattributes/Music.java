package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Author name!");
        song.band = scanner.nextLine();
        System.out.println("Title!");
        song.title = scanner.nextLine();
        System.out.println("Lenght of the music!");
        song.lengthSong = scanner.nextInt();
        scanner.nextLine();

        System.out.println(song.band + "," + song.title + "," + song.lengthSong +"perc");
    }

}
