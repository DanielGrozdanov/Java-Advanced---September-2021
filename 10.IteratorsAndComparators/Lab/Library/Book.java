package JavaAdvanced.IteratorsAndComparators.Lab.Library;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Book implements Comparable<Book> {

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


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", years=" + years +
                ", authors=" + authors +
                '}';
    }

    @Override
    public int compareTo(Book other) {
        int compared = this.title.compareTo(other.title);
        if (compared == 0) {
            compared = Integer.compare(this.years, other.years);
        }
        return compared;
    }
}
