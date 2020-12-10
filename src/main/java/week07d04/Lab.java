package week07d04;

import java.time.LocalDate;


public class Lab {

    private static String title;
    private static boolean completed;
    private static LocalDate completeAt = null;

    public Lab(String title) {
        this.title = title;
        this.completed = false;
    }

    public Lab(String title, LocalDate completeAt) {
        this.title = title;
        this.completed = true;
        this.completeAt = completeAt;
    }

    public void complete(LocalDate completeAt){
        Lab.completed = true;
        Lab.completeAt = completeAt;
    }

    public void complete(){
        Lab.completed = true;
        Lab.completeAt = LocalDate.now();
    }

    public String toString(){
        return title + ":" + completed +":" + completeAt;
    }
}
