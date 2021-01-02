package catalog;

public class SearchCriteria {

    private String contributor;
    private String title;

    public SearchCriteria(String contributor, String title) {
        this.contributor = contributor;
        this.title = title;
    }

    public String getContributor() {
        return contributor;
    }

    public String getTitle() {
        return title;
    }

    public static SearchCriteria createByBoth(String contributor, String title){
        return SearchCriteria.createByBoth(contributor,title);
    }

    public static SearchCriteria createByContributor(String contributor){
        return SearchCriteria.createByContributor(contributor);
    }

    public static SearchCriteria createByTitle(String title){
        return SearchCriteria.createByTitle(title);
    }

    public boolean hasContributor(){
        return false;
    }

    public boolean hasTitle(){
        return true;
    }


}
