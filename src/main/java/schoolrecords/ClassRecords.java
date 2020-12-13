package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random  rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(Student student) {
        for (Student i : students) {
            if (student.getName().equals(i.getName())) {
                return false;
            }
        }students.add(student);
        return true;
    }

    public double calculateClassAverage(){
        double sum = 0;
        double average = 0.0;
        if(students.isEmpty())throw new ArithmeticException("No student in the class, average calculation aborted!");
        else {
            for(Student i : students){
                if(i.getMarks().isEmpty()) throw new ArithmeticException("No marks present, average calculation aborted!");
                if(i.getName().isEmpty()) throw new ArithmeticException("No student in the class, average calculation aborted!");
                sum += i.calculateAverage();
            }average = Math.round(100.0*sum/students.size())/100.0;
            return average;
        }
    }

    public double calculateClassAverageBySubject(Subject subject){
        return 3.0;
    }


    public Student findStudentByName(String name){
        if(name=="") throw new IllegalArgumentException("Student name must not be empty!");
        if(students.isEmpty()) throw new IllegalStateException("No students to search!");
        for(Student i : students){
            if(i.getName().equals(name))
                return i;
        }throw new IllegalArgumentException("Student by this name cannot be found! "+ name);
    }

    public String listStudentNames(){
        String s="";
        for(Student i : students){
           s = s +  i.getName()+", ";
        }s = s.substring(0,s.length()-2);
        return s;
    }

    public List<StudyResultByName> listStudyResults(){
        return listStudyResults();
    }

    public boolean removeStudent(Student student){
        for (Student i : students) {
            if (student.getName().equals(i.getName())) {
                students.remove(student);
                return true;
            }
        }return false;
    }

    public Student repetition(){
        Random rnd = new Random();
        if(students.isEmpty())throw new IllegalStateException("No students to select for repetition!");
        Integer val = rnd.nextInt(students.size());
        return students.get(val);
    }


}
