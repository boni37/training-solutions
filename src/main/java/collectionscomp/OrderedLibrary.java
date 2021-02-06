package collectionscomp;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(libraryBooks);
        return libraryBooks;
    }

    public List<Book> orderedByAuthor(){
        Collections.sort(libraryBooks,new AuthorComparator());
        return libraryBooks;
    }

    public List<String> orderedByTitleLocale(Locale locale){
        List<String> orderedList = new ArrayList<>();
        for(Book book:libraryBooks){
            orderedList.add(book.getTitle());
        }
        Collections.sort(orderedList, Collator.getInstance(locale));
        return orderedList;
    }
}
