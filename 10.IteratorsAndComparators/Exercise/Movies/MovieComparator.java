package JavaAdvanced.IteratorsAndComparators.Exercise.Movies;

import java.util.Comparator;

public class MovieComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return Integer.compare(o1.getRating(),o2.getRating());
    }
}
