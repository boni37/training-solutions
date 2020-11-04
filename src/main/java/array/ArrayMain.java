package array;

public class ArrayMain {
    public static void main(String[] args) {
        String [] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday", "Sunday" };
        System.out.println(dayOfWeek[1]);
        System.out.println(dayOfWeek.length);

        int[] twoPowers = new int[5];
        twoPowers[0]=1;
        for (int i=1; i < twoPowers.length; i++) {
            twoPowers[i] = twoPowers[i-1]*2;
            System.out.println(twoPowers[i]);
        }

        Boolean [] yesNo = {false, true, false, true, false, true};
        for (int i=0; i< yesNo.length; i++){
            System.out.println(yesNo[i]);
        }
    }
}
