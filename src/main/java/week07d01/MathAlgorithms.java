package week07d01;

public class MathAlgorithms {

    int n;

    public static boolean isPrime(int n){
        int m=0;
        m=n/2;
        if(n<0||n==1||n==0){
            throw new IllegalArgumentException("It is negative or not prime");
        }else{
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    return false;
                }
        }
        } return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));
    }
}
