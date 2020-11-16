package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private List<String> capsulesIn = new ArrayList<>();

    public void addLast(String colors){
        capsulesIn.add(colors);
    }

    public void addFirst(String colors){
        capsulesIn.add(0,colors);
    }

    public void removeFirst(){
        capsulesIn.remove(0);
    }

    public void removeLast(){
        capsulesIn.remove(capsulesIn.size()-1);
    }

    public List<String> getColors(){
        return capsulesIn;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("red");
        capsules.addLast("white");
        capsules.addLast("green");
        capsules.addFirst("blue");
        capsules.addFirst("yellow");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }

}
