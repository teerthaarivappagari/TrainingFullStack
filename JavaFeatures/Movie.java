import java.util.*;
import java.util.stream.Collectors;

class Movie {
    private final String title;
    private final String genre;
    private final double rating;

    public Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return title + " (" + genre + ") - Rating: " + rating;
    }
}

public class MovieRecommendationSystem {
    private final List<Movie> movies;

    public MovieRecommendationSystem() {
        movies = new ArrayList<>();
    }

    public void addMovie(String title, String genre, double rating) {
        movies.add(new Movie(title, genre, rating));
    }

    public List<Movie> recommendByGenre(String genre) {
        return movies.stream()
                .filter(movie -> movie.getGenre().equalsIgnoreCase(genre))
                .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
                .collect(Collectors.toList());
    }

    public List<Movie> recommendTopMovies(int count) {
        return movies.stream()
                .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
                .limit(count)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        MovieRecommendationSystem system = new MovieRecommendationSystem();
        system.addMovie("Inception", "Sci-Fi", 8.8);
        system.addMovie("Interstellar", "Sci-Fi", 8.6);
        system.addMovie("The Dark Knight", "Action", 9.0);
        system.addMovie("Avengers: Endgame", "Action", 8.4);
        system.addMovie("The Matrix", "Sci-Fi", 8.7);

        System.out.println("\nRecommended Sci-Fi Movies:");
        system.recommendByGenre("Sci-Fi").forEach(System.out::println);

        System.out.println("\nTop 3 Movies:");
        system.recommendTopMovies(3).forEach(System.out::println);
    }
}
