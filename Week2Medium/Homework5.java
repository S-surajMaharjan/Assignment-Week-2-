class Movie {
    String name, language;
    double rating;
    Movie(String n, String l, double r) {
        name = n; language = l; rating = r;
    }
    void displayMovieDetails() {
        System.out.println("Movie: " + name + ", Language: " + language + ", Rating: " + rating);
    }
}

public class Homework5 {
    public static void main(String[] args) {
        Movie m1 = new Movie("Iron Man", "English", 4.5);
        Movie m2 = new Movie("Iron Man 2", "English", 4.3);
        Movie m3 = new Movie("Iron Man 3", "English", 4.2);
        Movie m4 = new Movie("Thor", "English", 4.4);
        Movie m5 = new Movie("Thor: The Dark World", "English", 4.1);
        m1.displayMovieDetails(); m2.displayMovieDetails(); m3.displayMovieDetails(); m4.displayMovieDetails(); m5.displayMovieDetails();
    }
}
