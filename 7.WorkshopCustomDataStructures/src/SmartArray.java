import java.util.function.Consumer;

public class SmartArray {
    private final static int INITIAL_CAPACITY = 8;
    private int[] elements;
    private int size;

    public SmartArray() {
        this.elements = new int[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void add(int element) {
        if (size == elements.length) {
            this.elements = grow();
        }
        this.elements[this.size] = element;
        this.size++;
    }


    public void add(int index, int element) {
        isInBounds(index);

        int lastElement = this.elements[this.size - 1];

        for (int i = this.size - 1; i > index; i--) {
            this.elements[i] = this.elements[i - 1];
        }

        this.elements[index] = element;
        add(lastElement);
    }

    private int[] grow() {
        int[] newElements = new int[elements.length * 2];

       /* for (int i = 0; i < this.elements.length; i++) {
            newElements[i] = elements[i];
        }*/


        System.arraycopy(elements, 0, newElements, 0, this.elements.length);

        return newElements;
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.elements[i]);
        }
    }

    public int get(int index) {
        isInBounds(index);
        return this.elements[index];
    }

    public boolean contains(int element) {
        for (int i = 0; i < this.size; i++) {
            if (element == elements[i]) {
                return true;
            }
        }

        return false;
    }


    public int remove(int index) {
        isInBounds(index);
        int removed = this.elements[index];

        for (int i = index; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }

        this.elements[this.size - 1] = 0;
        this.size--;
        if (this.size <= this.elements.length / 4) {
            this.elements = shrink();
        }
        return removed;
    }

    private int[] shrink() {
        int reduceFactor = 2;
        if (this.elements.length / reduceFactor >= INITIAL_CAPACITY) {
            int[] newElements = new int[this.elements.length / reduceFactor];

            if (this.size >= 0) System.arraycopy(this.elements, 0, newElements, 0, this.size);

            return newElements;
        }
        return this.elements;

    }

    public int size() {
        return this.size;
    }

    private void isInBounds(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for size " + this.size);
        }
    }
}
