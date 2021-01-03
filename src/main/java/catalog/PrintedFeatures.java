package catalog;

import java.util.ArrayList;
import java.util.List;

public class PrintedFeatures implements Feature{

    private List<String> authors = new ArrayList<>();
    private static int numberOfPages;
    private String title;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        this.authors = authors;
        this.numberOfPages = numberOfPages;
        this.title = title;
    }

    public static  int getNumberOfPages() {
        return numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for(int i=0; i < authors.size();i++){
           contributors.add(authors.get(i));
        }
        return contributors;
    }

}
