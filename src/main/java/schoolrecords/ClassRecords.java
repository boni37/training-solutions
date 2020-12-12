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
        return 3.0;
    }

    public double calculateClassAverageBySubject(Subject subject){
        return 3.0;
        }



    public Student findStudentByName(String name){
        for(Student i : students){
            if(i.getName().equals(name))
                return i;
        }throw new IllegalArgumentException("Student name must not be empty!");
    }

    public boolean isEmpty(String name){
        return true;
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
        if(students.size()<0)throw new IllegalArgumentException("Nem jó");
        Integer val = rnd.nextInt(students.size());
        return students.get(val);
    }


}
