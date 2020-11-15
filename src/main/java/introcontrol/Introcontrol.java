package introcontrol;

import java.util.Scanner;

public class Introcontrol {

    Scanner scanner= new Scanner(System.in);

    public int addNumber(){
        System.out.println("Add number!");
        int number = scanner.nextInt();
        return number;
    }

    public String addString(){
        System.out.println("Add string!");
        String name = scanner.next();
        return name;
    }

    public int subtractTenIfGreaterThanTen(int number){
        if (number <= 10){
            return number;
        }else {
            number -= 10;
            return number;
        }
    }

    public String describeNumber(int number){
        if (number != 0){
            return "not zero";
        }else {
            return "zero";
        }
    }

    public String greetingToJoe(String name){
        if ("Joe".equals(name)){
            return "Hello Joe!";
        }else{
            return "";
        }
    }

    public int calculateBonus(int sale){
        if (sale >= 1_000_000){
            sale = sale/10;
            return sale;
        }else{
            return 0;
        }
    }

    public int calculateConsumption(int prev, int next){
        if (prev <= next){
            return next - prev;
        }else{
            return 10_000 - prev +next;
        }
    }

    public void printNumbers(int max){
        for (int i = 0; i<=max; i++){
            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max){
        for (int i= min; i<max; i++){
            System.out.println(i);
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b){
        if(a<b){
            for (int i=a; i<=b; i++){
                System.out.println(i);
            }
        }
        else{
            for (int i=a; i>=b; i--){
            System.out.println(i);
            }
        }
    }

    public void printOddNumbers(int max){
        for (int i=1; i<=max; i+=2){
            System.out.println(i);
        }
    }
}
