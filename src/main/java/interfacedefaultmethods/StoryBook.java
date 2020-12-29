package interfacedefaultmethods;

import java.util.ArrayList;
import java.util.List;

public class StoryBook implements Printable{

    private List<ColoredPage> pages = new ArrayList<>();


    public List<ColoredPage> getPages() {
        return pages;
    }

    @Override
    public int getLength() {
        return pages.size();
    }

    @Override
    public String getPage(int pageNumber) {
        return pages.get(pageNumber).getContentOfPage();
    }

    @Override
    public String getColor(int pageNumber) {
        return pages.get(pageNumber).getColorOfPage();
    }

    public void addPage(String page, String color){
        pages.add(new ColoredPage(page, color));
    }
}
