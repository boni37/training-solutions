package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Diary {

    public void newMark(String name, int grade){
        String fileName = name + ".txt";
        Path file = Path.of("src","main","resources",fileName);
        if(Files.exists(file)){
            try {
                Files.writeString(file, "\n"+grade, StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                Files.writeString(file, String.valueOf(grade));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void average(String name){
        String fileName = name + ".txt";
        Path file = Path.of("src","main","resources",fileName);
        double sum = 0;
        double average = 0;
        List<String> list;
        try {
            list = Files.readAllLines(file);
            for(String actual:list){
                sum += Integer.parseInt(actual);
            }
            average = sum/list.size();
            Files.writeString(file,"\n"+"Average:"+ average,StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Diary diary = new Diary();
        diary.newMark("Jane_Doe",5);
        diary.average("Jane_Doe");
    }

}
