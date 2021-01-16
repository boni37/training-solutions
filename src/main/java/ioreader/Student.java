package ioreader;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<String> grades = new ArrayList<>();

    public Student() {
    }

    public Student(String name, List<String> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public List<String> getGrades() {
        return grades;
    }

    public double averegaCalculate(String name, List<String> grades){
        double average = 0d;
        for(String grade: grades){
            average += Integer.parseInt(grade);
        }return average/grades.size();
    }

    public boolean isRising(String name, List<String> grades){
        for(int i=1; i< grades.size();i++){
            if(Integer.parseInt(grades.get(i-1)) > Integer.parseInt(grades.get(i))) return false;
        }return true;
    }
}
