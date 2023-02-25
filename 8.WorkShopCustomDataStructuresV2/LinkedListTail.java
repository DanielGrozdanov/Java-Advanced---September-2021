import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LinkedListTail {
    private Node head;
    private Node tail;
    private int size;


    public void addFirst(int element) {
        Node newNode = new Node(element);
        if (!isEmpty()) {
            newNode.next = head;
        }else {
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
        tail = newNode;
        this.size++;
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot remove out of empty list");
        }
        int value = this.head.value;
        this.head = this.head.next;
        this.size--;
        if (isEmpty()){
            this.head = this.tail = null;
        }
        return value;
    }

    public int removeLast() {
        if (this.size < 2) {
            removeFirst();
        }

        Node node = head;
        int value = 0;
        while (node.next.next != null) {
            node = node.next;
        }
        value = node.next.value;
        node.next = null;
        tail = node;

        this.size--;
        return value;
    }

    public int get(int index) {
        checkIsValid(index);
        int result = 0;
        int currentIndex = 0;
        Node currentNode = head;
        while (currentNode != null) {
            if (currentIndex == index) {
                result = currentNode.value;
                break;
            }
            currentIndex++;
            currentNode = currentNode.next;
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
