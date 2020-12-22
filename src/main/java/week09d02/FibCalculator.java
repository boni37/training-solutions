package week09d02;

public class FibCalculator {

    private int bound;

    public long sumEvens(int bound){
        long sum = 0;
        long nMin1Num = 0;
        long nMin2Num = 1;
        long nNum = 1;
        while(nNum < bound){
            nNum = nMin1Num + nMin2Num;
            nMin1Num = nMin2Num;
            nMin2Num = nNum;
            System.out.println(nNum);
            if (nNum%2==0){
                sum = sum + nNum;
            }
        }return sum;
    }

    public static void main(String[] args) {
        FibCalculator fibCalculator = new FibCalculator();
        System.out.println(fibCalculator.sumEvens(8));
    }

}
