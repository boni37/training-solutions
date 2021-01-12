package ioreadstring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path myFile;
    private List<Human> humans = new ArrayList<>();

    public FileManager(String filePath) {
        this.myFile = Path.of(filePath);
    }

    public List<Human> getHumans() {
        return humans;
    }

    public Path getMyFile() {
        return myFile;
    }

    public void readFromFile(){
        try {
            List<String> fileInString = Files.readAllLines(myFile);
            for(String s : fileInString){
                String firstLast[] = s.split(" ");
                Human human = new Human(firstLast[0],firstLast[1]);
                humans.add(human);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
