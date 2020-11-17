package finalmodifier;

public class Gentleman {
    public static final String MESSAGE_PREFIX = "Hello";

    public String sayHello(String name){
        String message = MESSAGE_PREFIX +" "+ name;
        return message;
    }

    public static void main(String[] args) {
        System.out.println(new Gentleman().sayHello("Mark"));
    }
}
