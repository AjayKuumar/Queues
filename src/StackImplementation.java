import java.util.LinkedList;
import java.util.Queue;

class Stack{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    int curr_size;

    Stack() {
        curr_size = 0;
    }

    public  void push(int x) {
        curr_size++;
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
    }

    public  void pop() {
        if (q1.isEmpty())
            return;
        q1.remove();
        curr_size--;
    }

    public int top() {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    public int size() {
        return curr_size;
    }
}
public class StackImplementation {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(5);
        s.push(15);
        s.push(20);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("current size: " + s.size());
    }

}
