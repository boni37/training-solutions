package week06d05;

public class Biscuit {

    private static BiscuitType type;
    private static int gramAmount;


    public BiscuitType getType() {
        return type;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    public static Biscuit of(BiscuitType type, int gramAmount){
        Biscuit biscuit = new Biscuit();
        biscuit.type = type;
        biscuit.gramAmount = gramAmount;
        return biscuit;
}

    public static void main(String[] args) {
        Biscuit us = of(BiscuitType.OREO,250);
        System.out.println("Type: "+us.getType().toString()+" Amount: "+us.getGramAmount());

    }

}
