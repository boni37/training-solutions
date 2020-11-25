package stringbasic;

public class StringCreator {

    public String createStringForHeap(){
        return new String("dog");
    }

    public String createStringForPool(){
        return "dog";
    }
}
