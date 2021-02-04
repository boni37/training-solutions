package week14d03;

import java.util.*;

public class ClassNoteBook {

    private List<Student> students = new ArrayList<>();


    public void sortNotebook(List<Student> students){
        Collections.sort(students);
        System.out.println(students);
    }

    public static void main(String[] args) {
        ClassNoteBook classNoteBook = new ClassNoteBook();
        List<Student> students = new ArrayList<>();
        Map<String, List<Integer>> subjects = new TreeMap<>();
        Student student = new Student();
        students.add(new Student("John Doe"));
        students.get(0).addGradesToList("History",5);
        students.get(0).addGradesToList("History",3);
        students.get(0).addGradesToList("Biology",5);
        students.get(0).addGradesToList("English",5);
        classNoteBook.sortNotebook(students);
    }

}
