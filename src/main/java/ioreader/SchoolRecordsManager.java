package ioreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SchoolRecordsManager {

    private List<Student> students = new ArrayList<>();

    public SchoolRecordsManager(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Path file = Path.of("src","main","resources","grades.txt");
        try(BufferedReader reader = Files.newBufferedReader(file)){
            String line;
            while((line = reader.readLine())!= null){
                int endOfName = line.indexOf(" ");
                String name = line.substring(0,endOfName);
                String[] grade = line.substring(endOfName+1).split(" ");
                List<String> grades = Arrays.asList(grade);
                students.add(new Student(name,grades));
            }
        }catch(
                IOException ioe){
            throw new IllegalStateException("Can not read file",ioe);
        }for(Student actual:students){
            String average = String.format(" average = %2.2f",actual.averegaCalculate(actual.getName(),actual.getGrades()));
            System.out.println(actual.getName()+actual.getGrades()+average+", Is rising ="+ actual.isRising(actual.getName(),actual.getGrades()));
        }

    }

}
