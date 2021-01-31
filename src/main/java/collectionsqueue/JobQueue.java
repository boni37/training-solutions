package collectionsqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class JobQueue {

    private Deque<Job> jobDeque= new ArrayDeque<>();

    public Deque<Job> addJobByUrgency(Job... jobs){
        for (Job actual: jobs){
            if(actual.getPriority()<5){
                jobDeque.addFirst(actual);
            } jobDeque.addLast(actual);
        }return jobDeque;
    }

    public Job dispatchUrgentJob(Deque<Job> jobs) throws NoJobException{
        if(jobs.isEmpty()) throw new NoJobException("No job available, get a rest!");
        return jobDeque.pop();

    }

    public Job dispatchNotUrgentJob(Deque<Job> jobs) throws NoJobException{
        return jobDeque.peekLast();
    }
}
