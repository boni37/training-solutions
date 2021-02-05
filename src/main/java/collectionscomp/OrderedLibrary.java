package collectionscomp;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class OrderedLibrary {

    List<Book> libraryBooks = new ArrayList<>();

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> getLibraryBooks() {
        return libraryBooks;
    }

    public List<Book> orderedByTitle(){

    }

    public List<Book> orderedByAuthor(){

    }

    public List<String> orderedByTitleLocale(Locale locale){

    }
}
