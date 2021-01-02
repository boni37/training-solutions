package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AudioFeatures implements Feature{

    private List<String> composer;
    private int length;
    private List<String> performers;
    private String title;



    public AudioFeatures(String title, int length, List<String> composer,  List<String> performers) {
        this.title = title;
        this.length = length;
        this.composer = composer;
        this.performers = performers;

    }
    public AudioFeatures(String title, int length, List<String> performers) {
        this.title = title;
        this.length = length;
        this.performers = performers;
    }

    public int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getContributors() {
        return null;
    }

    public static void main(String[] args) {
        AudioFeatures audioFeatures = new AudioFeatures("Night Visions", 185, Arrays.asList("Dan Raynolds"), Arrays.asList("Imagine Dragons"));
        System.out.println(audioFeatures.title+audioFeatures.length+audioFeatures.composer+audioFeatures.performers);
    }

}
