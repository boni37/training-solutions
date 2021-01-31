package collectionsqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class JobDispatcher {

    private Queue<Job> jobsQueue = new PriorityQueue<>();

    public Queue<Job> addJob(Job... jobs){
        for(Job actual:jobs){
            jobsQueue.add(actual);
        }return jobsQueue;
    }

    public Job dispatchNextJob(Queue<Job> jobs) throws NoJobException{
        if(jobs.isEmpty())throw new NoJobException("No job available, get a rest!");
        return jobsQueue.poll();
    }
}
