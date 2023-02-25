package JavaAdvanced.IteratorsAndComparators.Exercise.Movies;

public class Movie implements Comparable<Movie> {
    private String name;
    private int rating;

    public Movie(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public Movie setName(String name) {
        this.name = name;
        return this;
    }

    public int getRating() {
        return rating;
    }

    public Movie setRating(int rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public int compareTo(Movie o) {
        return this.name.compareTo(o.getName()); // -1 0 1
    }
}
