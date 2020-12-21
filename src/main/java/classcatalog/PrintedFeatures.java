package classcatalog;

import java.util.List;

public class PrintedFeatures implements Feature{

    private List<String> authors;
    private int numberOfPages;
    private String title;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public List<String> getContributors() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }
}
