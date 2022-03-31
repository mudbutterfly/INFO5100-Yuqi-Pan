import java.util.LinkedList;
import java.util.Queue;

public class SafeQueue<T> {
    private Queue<T> queue = new LinkedList<>();
    private int capacity;

    public SafeQueue(int capacity) {
        super();
        this.capacity = capacity;
    }

    public synchronized void add(T element) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();
        }
        queue.add(element);
        notify();
    }

    public synchronized T remove() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        T element = queue.remove();
        notify();
        return element;
    }

    public synchronized T peek() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        T element = queue.peek();
        return element;
    }

    public synchronized Boolean isEmpty() throws InterruptedException {
        return queue.isEmpty();
    }

}