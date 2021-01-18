package ioreadbytes;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteCounter {

    public int readBytesAndFindAs(){
        Path path = Path.of("src","main","resources", "data.dat");
        int sumAs = 0;
        try(InputStream inputStream = new BufferedInputStream(Files.newInputStream(path))){
            byte[] bytes = new byte[1000];
            int size;
            while((size = inputStream.read(bytes))>0){
                for(int i= 0; i< size; i++){
                    if(bytes[i]== 'a' ) sumAs+=1;
                }
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file",ioe);
        }return sumAs;
    }

    public static void main(String[] args) {
        System.out.println(new ByteCounter().readBytesAndFindAs());
    }
}
