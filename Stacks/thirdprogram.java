import java.util.ArrayDeque;
import java.util.Deque;

public class thirdprogram {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        deque.addFirst(88);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
