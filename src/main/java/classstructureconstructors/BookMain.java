package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Stephen A. Ambrose","Band of brothers");
        book.register("1");
        System.out.println("Author:"+ book.getAuthor());
        System.out.println("Title:"+book.getTitle());
        System.out.println("Reg. num."+book.getRegNumber());
    }
}
