package JavaAdvanced.IteratorsAndComparators.Lab.utils;

import JavaAdvanced.IteratorsAndComparators.Lab.Library.Book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        int compare = b1.getTitle().compareTo(b2.getTitle());
        if (compare == 0) {
            compare = Integer.compare(b1.getYears(), b2.getYears());
        }
        return compare;

    }
}
