package week14d05;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public Map<String,Integer> countWords(BufferedReader reader, String... words){
        Map<String,Integer> map = new HashMap<>();
        String line;
        try{
            while( (line = reader.readLine()) !=null) {
                for(String word:words){
                    if(line.contains(word)){
                        Integer prev = map.get(word);
                        if(prev== null){
                           map.put(word,1);
                        }else{
                            map.put(word,prev+1);
                        }
                    }
                }
            }

        }catch (IOException ioe){
            throw new IllegalStateException("Can not read file",ioe);
        }return map;
    }

    public static void main(String[] args) {
        try (BufferedReader reader =Files.newBufferedReader(Path.of("hachiko.srt"),Charset.forName("UTF-8"))){
            System.out.println(new WordCounter().countWords(reader,"Hachi","haza","jó","Remek"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Error to read file",ioe);
        }

    }
}
