package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class OrderedArrayLibrary {

    private Book[] bookArray;

    public OrderedArrayLibrary(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book[] getBookArray() {
        return bookArray;
    }

    public Book[] sortingById(){
        Book[] bookCopy = bookArray.clone();
        Arrays.sort(bookCopy);
        return bookCopy;
    }

    public Book[] sortingByTitle(){
        Comparator<Book> titleComparator = new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };
        Book[] bookCopy = bookArray.clone();
        Arrays.sort(bookCopy, titleComparator);
        return bookCopy;
    }
}
