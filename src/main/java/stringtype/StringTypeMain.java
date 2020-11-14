package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {

        String prefix = "Hello";
        String name = "John Doe";
        String message = prefix + name;
        System.out.println(message);
        message = message + 444;
        System.out.println(message);
        boolean b = message.equals("Hello John Doe");
        System.out.println(b);
        boolean c = message.equals("HelloJohn Doe444");
        System.out.println(c);

        String stringConcat = "" + "";
        System.out.println(stringConcat.length());

        String s = "Abcde";
        System.out.println(s);

        System.out.println(s.substring(0,1)+","+s.substring(2,3));

        System.out.println(s.substring(0,3));


    }
}
