package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println(b);

        int a = 2;
        int i = 3, j = 4;
        //System.out.println(k); nem sikerul//
        int k = i;
        String s = "Hello World";
        System.out.println(s);
        String t = s;
        System.out.println(t);

        {
            int x = 0;
            System.out.println(k);
        }
        //System.out.println(x); nem sikerul//
    }
}