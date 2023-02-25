package JavaAdvanced.Generics.Exercise.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> collection;

    public CustomList() {
        this.collection = new ArrayList<>();
    }

    public void add(T element) {
        collection.add(element);
    }

    public T remove(int index) {
        return collection.remove(index);
    }

    public boolean contains(T element) {
        return collection.contains(element);
    }

    public void swap(int first, int second) {
        Collections.swap(collection, first, second);
    }

    public int countGreaterElement(T element) {
        return (int) collection.stream().filter(el -> el.compareTo(element) > 0).count();
    }

    public T max() {
        return Collections.max(collection);
    }

    public T min() {
        return collection.stream().min(Comparable::compareTo).get();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T t : collection) {
            builder.append(t).append(System.lineSeparator());
        }
        return builder.toString();
    }

    public int size() {
        return collection.size();
    }

    public T get(int index) {
        return collection.get(index);
    }
}
