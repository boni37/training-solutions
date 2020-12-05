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

    public static void of(BiscuitType type, int gramAmount){
        Biscuit biscuit = new Biscuit();
        biscuit.type = type;
        biscuit.gramAmount = gramAmount;
        System.out.println("Type: "+biscuit.getType().toString()+" Amount: "+biscuit.getGramAmount());
}

    public static void main(String[] args) {
        of(BiscuitType.OREO,250);

    }

}
