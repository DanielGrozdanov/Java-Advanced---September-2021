package JavaAdvanced.Generics.Exercise.GenericSwapMethodStrings;

import java.util.Collections;
import java.util.List;

public class Box<T> {
    private final List<T> collection;

    public Box(List<T> collection) {
        this.collection = collection;
    }

//    public void swap(int index1, int index2) {
//        Collections.swap(collection, index1, index2);
//    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T t : collection) {
            builder.append(t.getClass().getTypeName()).append(": ").append(t).append(System.lineSeparator());
        }
        return builder.toString();
    }

}
