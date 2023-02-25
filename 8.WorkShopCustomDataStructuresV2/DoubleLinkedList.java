import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int size;


    public void addFirst(int element) {
        Node newNode = new Node(element);
        if (!isEmpty()) {
            newNode.next = head;
            this.head.previous = newNode;
        } else {
            this.tail = newNode;
        }
        this.head = newNode;
        size++;
    }

    public void addLast(int element) {
        if (isEmpty()) {
            addFirst(element);
            return;
        }

        Node newNode = new Node(element);
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
        this.size++;
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot remove out of empty list");
        }
        int value = this.head.value;
        this.head = this.head.next;
        if (this.size > 1) {
            this.head.previous = null;
        }
        this.size--;
        if (isEmpty()) {
            this.head = this.tail = null;
        }
        return value;
    }

    public int removeLast() {
        if (this.size < 2) {
            removeFirst();
        }
        int result = this.tail.value;
        this.tail = this.tail.previous;
        this.size--;
        return result;
    }

    public int get(int index) {
        checkIsValid(index);
        int result = 0;
        if (index <= this.size / 2) {
            //iterate from head
            Node currentNode = this.head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            result = currentNode.value;
        } else {
            Node currentNode = this.tail;
            for (int i = this.size - 1; i > index; i--) {
                currentNode = currentNode.previous;
            }
            result = currentNode.value;
            //iterate from tail
        }
        return result;
    }

    private void checkIsValid(int index) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("The index " + index + "is out of bounds for size " + this.size);
        }
    }

    public void forEach(Consumer<Integer> consumer) {
        Node currentNode = this.head;
        while (currentNode != null) {
            consumer.accept(currentNode.value);
            currentNode = currentNode.next;
        }
    }


    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int[] toArray() {
        List<Integer> list = new ArrayList<>();
        forEach(list::add);
        return list.stream().mapToInt(e -> e).toArray();
    }
}
