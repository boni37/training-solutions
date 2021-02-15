package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class ThroneOfBattles {

    public void readFile(BufferedReader reader) throws IOException {
        Map<String,Integer> linesOfBattles = new HashMap<>();
        String line;
        reader.readLine();
        while((line = reader.readLine())!=null){
            if(line.endsWith(",")){
                line = line.substring(0,line.length()-1);
            }
            String[] parts = line.split(",");
            for(int i= 5; i < 13; i++){
                if(!(parts[i].isBlank())&linesOfBattles.containsKey(parts[i])){
                    linesOfBattles.put(parts[i],linesOfBattles.get(parts[i])+1);
                }else{
                    linesOfBattles.put(parts[i],1);
                }
            }
        }System.out.println(linesOfBattles);
    }

    public static void main(String[] args) {
        Path file = Path.of("battles.csv");
        try (BufferedReader reader = Files.newBufferedReader(file)){
            new ThroneOfBattles().readFile(reader);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Can not find the file");
        }
    }
}
