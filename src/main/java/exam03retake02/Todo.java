package exam03retake02;

public class Todo implements Comparable<Todo>{

    private String text;
    private State state;
    private int priority;

    public Todo(String text, int priority) {
        if(priority<1||priority>5) throw new IllegalArgumentException("Priority is wrong");
        this.text = text;
        this.priority = priority;
        this.state = State.NON_COMPLETED;
    }

    public String getText() {
        return text;
    }

    public State getState() {
        return state;
    }

    public int getPriority() {
        return priority;
    }

    public void complete() {
        this.state = State.COMPLETED;
    }


    @Override
    public int compareTo(Todo o) {
        return Integer.compare(this.priority,o.priority);
    }
}
