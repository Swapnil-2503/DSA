import java.util.LinkedList;

class Queue {
    private LinkedList<Integer> data;

    public Queue() {
        data = new LinkedList<>();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return data.isEmpty();
    }

    // Enqueue an element to the back of the queue
    public void enqueue(int item) {
        data.addLast(item);
    }

    // Dequeue and return the front element from the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue.");
        }
        return data.removeFirst();
    }

    // Peek and return the front element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot peek.");
        }
        return data.getFirst();
    }

    // Get the number of elements in the queue
    public int size() {
        return data.size();
    }
}
