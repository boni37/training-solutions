package iofilestest;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> booksInLibrary = new ArrayList<>();

    public Library(List<Book> booksInLibrary) {
        this.booksInLibrary = booksInLibrary;
    }

    public List<Book> getBooksInLibrary() {
        return booksInLibrary;
    }

    public void add(Book books){
        for (Book actual: booksInLibrary){
            if((books.getAuthor() != actual.getAuthor())||(books.getTitle()!= actual.getTitle())){
                booksInLibrary.add(books);
            }
        }
    }

    public void saveBooks(Path path){
        try (BufferedWriter writer = Files.newBufferedWriter(path)){
            for(Book actual: booksInLibrary){
                String s = actual.getAuthor()+","+actual.getTitle();
                writer.write(s+"\n");
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file",ioe);
        }

    }

    public void loadBooks(Path path){
        List<String> booksInFile = new ArrayList<>();
        try { booksInFile = Files.readAllLines(path);
            for(String book: booksInFile){
                String books[]= book.split(",");
                Book book1 = new Book(books[0],books[1]);
                booksInLibrary.add(book1);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
