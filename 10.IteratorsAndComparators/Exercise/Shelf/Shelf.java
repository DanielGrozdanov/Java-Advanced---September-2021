package JavaAdvanced.IteratorsAndComparators.Exercise.Shelf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Shelf implements Iterable<String> {
    private List<String> fruits;

    public Shelf(String... fruits) {
        this.fruits = Arrays.asList(fruits);
    }

    public List<String> getFruits() {
        return fruits;
    }

    public Shelf setFruits(List<String> fruits) {
        this.fruits = fruits;
        return this;
    }


    @Override
    public Iterator<String> iterator() {
//        return new Iterator<String>() {
//            int index = 0;
//
//            @Override
//            public boolean hasNext() {
//                return index <= fruits.size() - 1;
//            }
//
//            @Override
//            public String next() {
//                String s = fruits.get(index);
//                index++;
//                return s;
//            }
//        }
        return new ShopIterator();
    }

    class ShopIterator implements Iterator<String> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index <= fruits.size() - 1;
        }

        @Override
        public String next() {
            String s = fruits.get(index);
            index++;
            return s;
        }
    }
}

