package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.Files.readAllBytes;

public class TemperaturesReader {

    public Temperatures readTemperatures(Path pathString){
        Path file = pathString;
        try {
            byte[] bytes = readAllBytes(file);
            return new Temperatures(bytes);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file",e);
        }

    }
}
