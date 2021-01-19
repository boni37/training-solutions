package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StringToBytes {

    public void writeAsBytes(List<String> text, Path file){
        try (OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(file)) ) {
            for(String actual:text){
                if(!actual.startsWith("_")){
                    outputStream.write(actual.getBytes());
                }
            }
        }

        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file",ioe);
        }
    }
}
