package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {

    private List<String> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(title);
    }

    public List<String> findAllByPrefix(String prefix) {
        List<String> getBook = new ArrayList<>();
        for (String title : books) {
            if (title.contains(prefix)) {
                getBook.add(title);
            }
        }return getBook;
    }
     public List<String> getTitles() {
            return books;
    }

    public static void main(String[] args) {
        Books books = new Books();
        books.addBook("Anyegin");
        books.addBook("A rab ember fiai");
        books.addBook("A sakál");
        books.addBook("A rab oroszlán");
        System.out.println(books.getTitles());
        System.out.println(books.findAllByPrefix("rab"));


    }
}