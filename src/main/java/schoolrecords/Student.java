package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(List<Mark> marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public Student(String name) {
        if(name == "") throw new IllegalArgumentException("Student name must not be empty!");
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void grading(Mark mark){
        if(mark == null) throw new NullPointerException("Mark must not be null!");
        marks.add(mark);
    }

    public double calculateAverage(){
        int sum = 0;
        double average = 0.0;
        if(marks.isEmpty()){
            return average;
        }
        else {
            for(Mark i : marks){
                sum += i.getMarkType().getValue();
            }average = Math.round(100.0*sum/marks.size())/100.0;
            return average;
        }
    }

    public double calculateSubjectAverage(Subject subject){
        int sum = 0;
        int count = 0;
        double average = 0.0;
        if(marks.isEmpty()){
            return average;
        }
        else {
            for(Mark i : marks){
                if(subject.equals(i.getSubject())){
                    sum += i.getMarkType().getValue();
                    count++;
                }
            }average = Math.round(100.0*sum/count)/100.0;
            return average;
        }

    }

    public boolean isEmpty(String name){
        return true;
    }


    @Override
    public String toString() {
        return name + " marks:" + MarkType.valueOf();
    }
}
