package week15d02;

public class Answer implements Comparable<Answer>{


    private String question;
    private String answer;
    private int point;
    private String theme;

    public Answer(String question,String answer, int point, String theme) {
        this.question = question;
        this.answer = answer;
        this.point = point;
        this.theme = theme;
    }

    public String getAnswer() {
        return answer;
    }

    public int getPoint() {
        return point;
    }

    public String getTheme() {
        return theme;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public int compareTo(Answer o) {
        return this.theme.compareTo(o.theme);
    }

    @Override
    public String toString() {
        return "Question =" + question + ", Answer = " + answer + ", Point=" + point + ", Theme='" + theme;
    }
}
