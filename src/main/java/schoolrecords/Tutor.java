package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;
    private List<Subject> taughtSubjets = new ArrayList<>();

    public Tutor(String name, List<Subject> taughtSubjets) {
        this.name = name;
        this.taughtSubjets = taughtSubjets;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject){
        return true;
    }


}
