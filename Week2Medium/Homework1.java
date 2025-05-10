class Book {
    String author, title, ISBN;
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
        Book b2 = new Book("How to Win Friends and Influence People", "Dale Carnegie", "2222");
        Book b3 = new Book("How to Stop Worrying and Start Living", "Dale Carnegie", "3333");
        Book b4 = new Book("The Quick and Easy Way to Effective Speaking", "Dale Carnegie", "4444");
        Book b5 = new Book("The Leader in You", "Dale Carnegie", "5555");
        Book b6 = new Book("Public Speaking for Success", "Dale Carnegie", "6666");
        b1.showDetails(); b2.showDetails(); b3.showDetails(); b4.showDetails(); b5.showDetails(); b6.showDetails();
    }
}
