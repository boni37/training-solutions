package interfacedefaultmethods;

public class ColoredPage {

    private String contentOfPage;
    private String colorOfPage;

    public ColoredPage(String contentOfPage, String colorOfPage) {
        this.contentOfPage = contentOfPage;
        this.colorOfPage = colorOfPage;
    }

    public ColoredPage(String contentOfPage) {
        this.contentOfPage = contentOfPage;
        this.colorOfPage = Printable.BLACK;
    }

    public String getContentOfPage() {
        return contentOfPage;
    }

    public String getColorOfPage() {
        return colorOfPage;
    }
}
