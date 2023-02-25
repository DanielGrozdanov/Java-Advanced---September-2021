package JavaAdvanced.IteratorsAndComparators.Exercise.ImprovedListIterator;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LisIterator<T> implements Iterable<T> {

    private List<T> stringList;
    private int currentIndex;

    public LisIterator(T... input) {
        this.stringList = Arrays.asList(input);
    }

    public boolean HasNext() {
        return currentIndex < stringList.size() - 1;
    }

    public boolean Move() {
        if (HasNext()) {
            currentIndex++;
            return true;
        }
        return false;
    }

    public void Print() {
        if (stringList.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        }
        System.out.println(stringList.get(currentIndex));
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index;

            @Override
            public boolean hasNext() {
                return this.index < stringList.size();
            }

            @Override
            public T next() {
                T el = stringList.get(index);
                index++;
                return el;
            }
        };
    }

    public void printAll() {
        this.forEach(el -> System.out.print(el + " "));
        System.out.println();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        this.stringList.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
