package JavaAdvanced.Generics.Exercise.Box;

import java.util.List;

public class Box<T> {

    private T box;

    public Box(T box) {
        this.box = box;
    }

    @Override
    public String toString() {
        return box.getClass().getTypeName() + ": " + box;
    }
}
