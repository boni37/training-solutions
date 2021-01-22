package week12d04;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class SecretDatReader {

    public static void main(String[] args) {
        Path file = Path.of("secret.dat");
        try (InputStream reader = new BufferedInputStream(Files.newInputStream(file))){
            byte[] bytes = new byte[500];

            int size;
            while((size= reader.read(bytes))>0){
                char[] ch = new char[bytes.length];
                for(int i= 0;i<bytes.length;i++){
                    bytes[i] += 10;
                    ch[i] = (char)bytes[i];
                }
                System.out.print(ch);
            }
        } catch (IOException ioe) {
           throw new IllegalStateException("Can not read file",ioe);
        }
    }
}
