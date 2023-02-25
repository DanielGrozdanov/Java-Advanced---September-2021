package JavaAdvanced.Generics.Lab.GenericScale;

import java.util.Comparator;

public class Scale<T extends Comparable<T>> {
    T left;
    T right;

    public Scale(T left, T right){
        this.left = left;
        this.right = right;
    }

    public T getHeavier(){
       int res = left.compareTo(right);
       return res >= 0 ? left : right;
    }
}
