public class Book {
    private String author;
    private String title;
    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    public static Book of(String author, String title) {
        return new Book(author, title);
    }
    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println("Author: " + book.author);
        System.out.println("Title: " + book.title);
    }
}
