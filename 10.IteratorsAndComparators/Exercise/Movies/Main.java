package JavaAdvanced.IteratorsAndComparators.Exercise.Movies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Movie> list = new ArrayList<>();

        Movie movie1 = new Movie("Harry Potter", 10);
        Movie movie2 = new Movie("Ababa", 5);
        Movie movie3 = new Movie("Eldren Ring", 6);


        list.add(movie1);
        list.add(movie2);
        list.add(movie3);

        Collections.sort(list,new MovieComparator());
    }
}
