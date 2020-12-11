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

    public boolean addStudent(Student student){
    }

    public double calculateClassAverage(){

    }

    public double calculateClassAverageBySubject(Subject subject){

    }

    public Student findStudentByName(String name){

    }

    public boolean isEmpty(String name){

    }

    public String listStudentNames(){

    }



    public List<StudyResultByName> listStudyResults(){

    }

    public boolean removeStudent(Student student){

    }

    public Student repetition(){

    }
}
