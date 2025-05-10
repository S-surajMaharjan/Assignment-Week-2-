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
        Movie m1 = new Movie("Inception", "English", 4.8);
        Movie m2 = new Movie("RRR", "Telugu", 4.6);
        Movie m3 = new Movie("Parasite", "Korean", 4.9);
        Movie m4 = new Movie("Dangal", "Hindi", 4.5);
        m1.displayMovieDetails(); m2.displayMovieDetails(); m3.displayMovieDetails(); m4.displayMovieDetails();
    }
}
