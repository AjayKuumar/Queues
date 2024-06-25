import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateNumbers {
    public static void generateNumbers(int n){
        //The digits may vary in this question. Here 5,6 is taken for reference.
        Queue<String> q = new ArrayDeque<>();
        //First add 5,6 to queue
        q.offer("5");
        q.offer("6");
        //Run a loop from 0 to n-1
        for (int i = 0; i < n; i++) {
            //Remove the top element which is 5
            String k = q.poll();
            //Print it
            System.out.print(k+" ");
            //Append it with 5 and 6 to get increasing order and offer to queue
            q.offer(k+"5");
            q.offer(k+"6");
            // 5 6 55 56 65 66 555 556 565 566 655 656 665 666
        }
    }
    public static void main(String[] args) {
        generateNumbers(20);
    }
}
