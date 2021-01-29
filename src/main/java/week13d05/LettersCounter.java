package week13d05;

public class LettersCounter {

    public int differentLetters(String word){
        if(word.isBlank() || word.isEmpty()) throw new IllegalArgumentException("Word is empty.");
        int summ =0;
        for(int i=0; i< word.length();i++){
            if(word.indexOf(word.charAt(i))==word.lastIndexOf(word.charAt(i))) summ++;
        }return summ;
    }

    public static void main(String[] args) {
        System.out.println(new LettersCounter().differentLetters("TornadofighterJet"));
    }
}
