import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    static void Print(Queue<Integer> queue) {
        //This function is just to print the items in queue
        for(Integer x: queue)
            System.out.print(x + " ");
    }

    public static void reverse (Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        //Keep all elements in stack
        while(!q.isEmpty()){
            s.push(q.poll());
        }
        //Now removing stack elements and again keeping back into queue
        while(!s.isEmpty()){
            q.offer(s.pop());
        }
    }
    static void recursiveReverse (Queue<Integer> q){
        if (q.isEmpty()){
            return;
        }
        //This is recursive
        //So store top elemetn in k
        //And send remaining q into function until it becomes empty to reach top element
        int k = q.poll();
        recursiveReverse(q);
        //After recursion add element into q again recursively
        q.add(k);
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(12);
        queue.add(5);
        queue.add(15);
        queue.add(20);
//        reverse(queue);
        recursiveReverse(queue);
        Print(queue);
    }
}
