package week06d03;

public class WordEraser {

    public String words;
    public String word;


    public void eraseWord(String words, String word){
        StringBuilder sb = new StringBuilder();
        String[] wordsToArray = words.split("\\s");
        for(int i=0; i< wordsToArray.length; i++){
            System.out.println(wordsToArray[i]);
            if(!wordsToArray[i].equalsIgnoreCase(word)){
                sb.append(wordsToArray[i]);
            }
        } System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        WordEraser wordEraser = new WordEraser();
        String words = "So I say Thank you for the music the songs For giving it to me";
        wordEraser.eraseWord(words,"for");
    }
}


