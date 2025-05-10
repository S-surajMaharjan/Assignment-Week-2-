class Book {
    String title, author, ISBN;
    Book(String t, String a, String i) {
        title = t; author = a; ISBN = i;
    }
    void showDetails() {
        System.out.println("Book: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}

public class Homework1 {
    public static void main(String[] args) {
        Book b1 = new Book("Atomic Habits", "James Clear", "1111");
        Book b2 = new Book("1984", "George Orwell", "2222");
        Book b3 = new Book("Clean Code", "Robert C. Martin", "3333");
        Book b4 = new Book("Sapiens", "Yuval Noah Harari", "4444");
        Book b5 = new Book("The Alchemist", "Paulo Coelho", "5555");
        b1.showDetails(); b2.showDetails(); b3.showDetails(); b4.showDetails(); b5.showDetails();
    }
}
