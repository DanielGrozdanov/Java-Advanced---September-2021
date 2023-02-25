import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class SmartStack {
    private Node top;
    private int size;

    private static class Node {
        private int element;
        private Node previous;

        private Node(int element) {
            this.element = element;
        }
    }

    public SmartStack() {

    }

    public int peek() {
        checkIfValue();
        return this.top.element;
    }

    private void checkIfValue() {
        if (this.top == null) {
            throw new NoSuchElementException("Empty Stack");
        }
    }

    public int pop() {
        checkIfValue();
        int popped = this.top.element;
        this.top = this.top.previous;
        this.size--;
        return popped;
    }

    public void push(int element) {
        Node newNode = new Node(element);
        if (this.top != null) {
            newNode.previous = this.top;
        }
        this.top = newNode;
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public void forEach(Consumer<Integer> consumer){
        Node curr = this.top;

        while (curr != null){
            consumer.accept(curr.element);
            curr = curr.previous;
        }
    }
}
