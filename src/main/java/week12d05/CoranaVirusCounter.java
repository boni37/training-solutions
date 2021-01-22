package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CoranaVirusCounter {

    public static void main(String[] args) {
        Path file = Path.of("index.html");
        try (BufferedReader reader = Files.newBufferedReader(file)){
            String line;
            int counter= 0;
            while((line = reader.readLine())!=null){
                if(line.contains("koronavírus")){
                    counter+=1;
                }
            }
            System.out.println("Found 'koronavírus': "+counter);

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file",ioe);
        }
    }
}
