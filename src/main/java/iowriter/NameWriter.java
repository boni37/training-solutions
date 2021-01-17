package iowriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class NameWriter {

    private Path file;

    public NameWriter(Path file) {
        this.file = file;
    }

    public Path getFile() {
        return file;
    }

    public void addAndWrite(String name){
        List<String> actual = new ArrayList<>();
        try (BufferedWriter writer = Files.newBufferedWriter(file, StandardOpenOption.APPEND)){
            writer.write(name+"\n");

        }
        catch (IOException e) {
            throw new IllegalStateException("File not found",e);
        }


    }
}