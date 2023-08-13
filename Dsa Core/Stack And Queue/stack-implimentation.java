import java.util.ArrayList;

class stackImplimentation {
    private ArrayList<Integer> data;

    public stackImplimentation() {
        data = new ArrayList<>();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return data.isEmpty();
    }

    // Push an element to the top of the stack
    public void push(int item) {
        data.add(item);
    }

    // Pop and return the top element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        return data.remove(data.size() - 1);
    }

    // Peek and return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return data.get(data.size() - 1);
    }

    // Get the number of elements in the stack
    public int size() {
        return data.size();
    }
}
