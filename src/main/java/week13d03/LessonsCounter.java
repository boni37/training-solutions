package week13d03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LessonsCounter {

    public LessonsCounter() {
    }

    private List<LessonFile> lessonFiles = new ArrayList<>();

    public LessonsCounter(List<LessonFile> lessonFiles) {
        this.lessonFiles = lessonFiles;
    }

    public List<LessonFile> getLessonFiles() {
        return lessonFiles;
    }

    public int lessonsPerWeek(List<LessonFile> lessonFiles,String name){
        int numberOfClass = 0;
        for(LessonFile actual:lessonFiles){
            if(actual.getName().equals(name)) numberOfClass+=Integer.parseInt(actual.getCount());
        }
        return numberOfClass;

    }

    public List<LessonFile> readLessonsFromFile(Path file){
        try {
            lessonFiles = new ArrayList<>();
            List<String> lessonsFromFile = Files.readAllLines(file);
            for(int i=0; i< lessonsFromFile.size();i+=4){
                String name = lessonsFromFile.get(i);
                String subject = lessonsFromFile.get(i+1);
                String grade = lessonsFromFile.get(i+2);
                String count = lessonsFromFile.get(i+3);
                lessonFiles.add(new LessonFile(name,subject,grade,count));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.",ioe);
        }return lessonFiles;
    }

    public static void main(String[] args) {
        Path file = Path.of("beosztas.txt");
        LessonsCounter lessonsCounter = new LessonsCounter();
        System.out.println(lessonsCounter.lessonsPerWeek(lessonsCounter.readLessonsFromFile(file),"Impala Izabella"));
    }
}
