package statements;

import java.util.Scanner;

public class TestFor {



    public static void main(String[] args) {
        String   room;
        int  length;
        int  width;


        Scanner scanner = new Scanner(System.in);


        for(int i=0;i<3;i++){
            System.out.println("Kerem az elsot!");
            room = scanner.nextLine();
            System.out.println("Hossz");
            length = scanner.nextInt();
            System.out.println("Szelesseg");
            width = scanner.nextInt();
        }
    }
}
