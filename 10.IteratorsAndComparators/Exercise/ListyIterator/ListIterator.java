package JavaAdvanced.IteratorsAndComparators.Exercise.ListyIterator;

import java.util.*;
import java.util.function.Consumer;

public class ListIterator<T> {
    private List<T> stringList;
    private int currentIndex;

    public ListIterator(T... input) {
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
}
