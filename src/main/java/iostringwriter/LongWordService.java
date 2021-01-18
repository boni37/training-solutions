package iostringwriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class LongWordService {

    public LongWordService() {
    }

    public void manageWords(List<String> words, Writer writer){
        PrintWriter printWriter = new PrintWriter(writer);
        for(String word: words){
                printWriter.print(word);
                printWriter.print(",");
                printWriter.print(word.length());
                printWriter.print("\n");
        }
    }

    public String  writeWithStringWriter(List<String> words){
        StringWriter stringWriter = new StringWriter();
        try (stringWriter) {
            manageWords(words,stringWriter);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read",ioe);
        }return stringWriter.toString();
    }
}
