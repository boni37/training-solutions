package week13d05;

public class LettersCounter {

    public int differentLetters(String word){
        if(word.isBlank() || word.isEmpty()) throw new IllegalArgumentException("Word is empty.");
        int summ =0;
        String s = word.toLowerCase();
        for(int i=0; i< word.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) summ++;
        }return summ;
    }

    public static void main(String[] args) {
        System.out.println(new LettersCounter().differentLetters("TornaTdofighTjterJet"));
    }
}
