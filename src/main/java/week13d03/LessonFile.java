package week13d03;

public class LessonFile {

    private String name;
    private String subject;
    private String grade;
    private String count;

    public LessonFile(String name, String subject, String grade, String count) {
        this.name = name;
        this.subject = subject;
        this.grade = grade;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getGrade() {
        return grade;
    }

    public String getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "LessonFile{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", grade='" + grade + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}
