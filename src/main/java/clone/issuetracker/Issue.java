package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {

    private String name;
    private LocalDateTime time;
    private Status status;
    private List<Comment> comments = new ArrayList<>();

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public Issue(Issue otherIssue, CopyMode copyMode) {
        name = otherIssue.name;
        time = otherIssue.time;
        status = otherIssue.status;
        if(copyMode.equals(CopyMode.WITH_COMMENTS)){
            List<Comment> tmp = new ArrayList<>();
            for(Comment comment: otherIssue.comments){
                tmp.add(new Comment(comment));
            }
            comments = tmp;
        }
    }
}
