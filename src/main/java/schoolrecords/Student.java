package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void grading(Mark mark){
        marks.add(mark);
    }

    public double calculateAverage(){
        return 3.0;

    }

    public double calculateSubjectAverage(Subject subject){
        return 3.0;

    }

    public boolean isEmpty(String name){
        return true;
    }


    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}
