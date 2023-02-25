package JavaAdvanced.IteratorsAndComparators.Lab.Book;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Book {
    private String title;
    private int years;
    private List<String> authors;

    public Book(String title, int years, String... authors) {
        this.setTitle(title);
        this.setYears(years);
        this.setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    private Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public int getYears() {
        return years;
    }

    private Book setYears(int years) {
        this.years = years;
        return this;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public Book setAuthors(String... authors) {
        this.authors = Arrays.stream(authors).collect(Collectors.toList());
        return this;
    }
}
