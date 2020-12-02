package week06d03;

public class WordEraser {

    public String words;
    public String s2;
    public String word;


    public String eraseWord(String words, String word){
        StringBuilder sb = new StringBuilder();
        String[] wordsToArray = words.split("\\s");
        for(int i=0; i< wordsToArray.length; i++){
            System.out.println(wordsToArray[i]);
            if(!wordsToArray[i].equalsIgnoreCase(word)){
                sb.append(wordsToArray[i]);
            }
        } s2 = sb.toString();
        return s2;
    }

}



