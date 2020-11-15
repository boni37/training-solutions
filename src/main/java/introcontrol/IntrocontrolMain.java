package introcontrol;


public class IntrocontrolMain {

    public static void main(String[] args) {
        Introcontrol introcontrol = new Introcontrol();

        System.out.println(introcontrol.subtractTenIfGreaterThanTen(introcontrol.addNumber()));

        System.out.println(introcontrol.describeNumber(introcontrol.addNumber()));

        System.out.println(introcontrol.greetingToJoe(introcontrol.addString()));

        System.out.println("Bonus= " + introcontrol.calculateBonus(introcontrol.addNumber()) + " Ft");

        System.out.println(introcontrol.calculateConsumption(1234,2345));
        System.out.println(introcontrol.calculateConsumption(9899,45));

        introcontrol.printNumbers(12);
        introcontrol.printNumbersBetween(15,22);

        introcontrol.printNumbersBetweenAnyDirection(12,15);
        introcontrol.printNumbersBetweenAnyDirection(15,12);

        introcontrol.printOddNumbers(13);

    }
}
