package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        for (int i=1; i<=5;i++){
            System.out.println(i + ".szám");
            int num = scanner.nextInt();
            sum = sum+num;
        }
        System.out.println("összeg=  "+sum);
    }
}
