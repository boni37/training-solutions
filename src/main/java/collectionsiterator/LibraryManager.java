package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {

    private Set<Book> libraryBooks;

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public Set<Book> getLibraryBooks() {
        return libraryBooks;
    }

    public Book findBookByRegNumber(int regNumber){
        Iterator<Book> i = libraryBooks.iterator();
        while(i.hasNext()){
            Book value = i.next();
            if(value.getRegNumber()==regNumber){
                return value;
            }
        }throw new MissingBookException("No books found with regnumber: " + regNumber);
    }

    public int removeBookByRegNumber(int regNumber){
        Iterator<Book> i = libraryBooks.iterator();
        while(i.hasNext()){
            Book value = i.next();
            if(value.getRegNumber()==regNumber){
                i.remove();
                return regNumber;
            }
        }throw new MissingBookException("No books found with regnumber: " + regNumber);

    }

    public Set<Book> selectBooksByAuthor(String author){
        Set<Book> authorBookList = new HashSet<>();
        Iterator<Book> i = libraryBooks.iterator();
        while(i.hasNext()){
            Book value = i.next();
            if(value.getAuthor().equals(author)){
                authorBookList.add(value);
            }
        }if(authorBookList.isEmpty()){
            throw new MissingBookException("No books found by " + author);
        }
        return authorBookList;
    }

    public int libraryBooksCount(){
        return libraryBooks.size();
    }
}
