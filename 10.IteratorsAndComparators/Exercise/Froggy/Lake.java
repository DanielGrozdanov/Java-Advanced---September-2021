package JavaAdvanced.IteratorsAndComparators.Exercise.Froggy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    private List<Integer> lake;

    public Lake(List<Integer> list) {
        this.lake = list;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    class Frog implements Iterator<Integer> {
        private int index;
        boolean firstIterFinished = false;

        @Override
        public boolean hasNext() {
            return index < lake.size();
        }

        @Override
        public Integer next() {
            int currentIndex = index;
            index += 2;
            if (index >= lake.size() && !firstIterFinished) {
                index = 1;
                firstIterFinished = true;
            }
            return lake.get(currentIndex);
        }
    }
}
