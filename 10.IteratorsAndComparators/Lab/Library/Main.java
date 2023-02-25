package JavaAdvanced.IteratorsAndComparators.Lab.Library;

import JavaAdvanced.IteratorsAndComparators.Lab.utils.BookComparator;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");
        Book bookThree = new Book("The Documents in the Case", 2002);

        Library library = new Library();

        library.add(bookThree);
        library.add(bookTwo);
        library.add(bookOne);

        List<Book> books = library.getBooks();
        books.stream().sorted(new BookComparator()).forEach(System.out::println);
    }
}
