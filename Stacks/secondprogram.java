import java.util.LinkedList;
import java.util.Queue;

public class secondprogram {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(10);
        queue.add(11);
        queue.add(12);
        queue.add(13);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
