import java.util.ArrayDeque;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q =new ArrayDeque<Integer>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q.peek());
        q.poll();
        q.poll();
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        System.out.println(q.element());
        q.poll();
        //This throws exception.
        System.out.println(q.element());
    }
}
