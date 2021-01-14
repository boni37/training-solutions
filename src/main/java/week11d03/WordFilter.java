package week11d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordFilter {

    private List<String> words;

    public WordFilter(List<String> words) {
        this.words = words;
    }

    public List<String> getWords() {
        return words;
    }

    public static List<String> wordsWithChar(List<String> words,char c){
        List<String> foundWords = new ArrayList<>();
        for(String word: words){
            if(word.indexOf(c)>0){
                foundWords.add(word);
            }
        }return foundWords;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Alma","Barack","Szilva","Avokado");
        System.out.println(wordsWithChar(words,'l'));
    }
}
