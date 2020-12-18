package week08d05;

public class MathAlgorithms {

    private int gcd;

    public int greatestCommonDivisor(int x, int y){
        gcd = 1;
        for(int i = 1; i <= x && i <= y; i++)
        {if(x%i==0 && y%i==0)
                gcd = i;
        }return gcd;
    }

    public static void main(String[] args) {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        System.out.println(mathAlgorithms.greatestCommonDivisor(128,432));
    }
}
