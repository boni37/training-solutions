package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AudioFeatures implements Feature{

    private List<String> composer = new ArrayList<>();
    private static int length;
    private List<String> performers = new ArrayList<>();
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

    public List<String> getComposer() {
        return composer;
    }

    public List<String> getPerformers() {
        return performers;
    }

    public static int getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for(int i=0; i < composer.size();i++){
            contributors.add(composer.get(i));
            for(int j=0; j < performers.size();j++){
                contributors.add(performers.get(j));
            }
        }
        return contributors;
    }



}
