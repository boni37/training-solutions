package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class VowelFilter {

    private final String vowels = "aáeéiíoóöőuúüű";

    public void filterVowels(BufferedReader reader) throws IOException {
        List<String> withoutVowels = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                if (!Character.isWhitespace(line.charAt(i))) {
                    if (vowels.contains(String.valueOf(line.charAt(i)).toLowerCase())) { }
                    else {
                        sb.append(line.charAt(i));
                    }
                }
            } withoutVowels.add(sb.toString());
        }for(String actual:withoutVowels){
            System.out.println(actual);
        }
    }


    public static void main(String[] args) {
        Path file = Path.of("text.txt");
        try (BufferedReader reader = Files.newBufferedReader(file)){
            new VowelFilter().filterVowels(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not find file.",ioe);
        }
    }
}
