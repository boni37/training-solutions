package week14d03;

import java.util.*;

public class Student implements Comparable<Student>{

    private String name;
    private Map<String, List<Integer>> subjects = new TreeMap<>();

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(Map<String, List<Integer>> subjects) {
        this.subjects = subjects;
    }

    public Student(String name, Map<String, List<Integer>> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Integer>> addGradesToList(String subject, int grade){
        if(!subjects.containsKey(subject)){
            subjects.put(subject,new ArrayList<>());
            }subjects.get(subject).add(grade);
        return subjects;
    }

    public int compareTo(Student stud) {
        return this.name.compareTo(stud.name);
    }

    @Override
    public String toString() {
        return "Student name= " + name + ", subjects=" + subjects +'\n';
    }
}
