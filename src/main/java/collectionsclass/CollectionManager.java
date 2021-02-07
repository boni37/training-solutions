package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionManager {

    List<Book> library=new ArrayList<>();

    public CollectionManager(List<Book> library) {
        this.library = library;
    }

    public List<Book> getLibrary() {
        return library;
    }

    public List<Book> createUnmodifiableLibrary(){
        List<Book> unmodifiable = Collections.unmodifiableList(library);
        return unmodifiable;
    }


    public List<Book> reverseLibrary(){
        Collections.reverse(library);
        return library;
    }

    public Book getFirstBook(){
        return Collections.min(library);
    }

    public Book getLastBook(){
        return Collections.max(library);
    }
}
