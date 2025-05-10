class Book {
    String title, author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    void showBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Homework7 {
    public static void main(String[] args) {
        Book b = new Book("1984", "George Orwell");
        b.showBook();
 
    }
}

