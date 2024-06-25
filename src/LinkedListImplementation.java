class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
    }
}
class linkedQueue{
    Node head;
    int size;
    Node rear;
    linkedQueue(){
        size = 0;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void enqueue(int x){
        Node temp =  new Node (x);
        if (head==null){
            head = temp;
            rear = head;
        }else{
            rear.next = temp;
            rear = temp;
        }
        size++;
    }
    public void dequeue(){
        if (head==null){
            return ;
        }
        head = head.next;
        size--;
        if (head==null){
            rear=null;
        }
    }
    public int getFront(){
        if (isEmpty()){
            return -1;
        }
        return head.data;
    }
    public int getRear(){
        if (isEmpty()){
            return -1;
        }
        return rear.data;
    }
}
public class LinkedListImplementation {
    public static void main(String[] args) {
        linkedQueue lq = new linkedQueue();
        lq.enqueue(10);
        lq.enqueue(20);
        System.out.println(lq.size);
        System.out.println(lq.isEmpty());
        lq.dequeue();
        lq.dequeue();
        System.out.println(lq.size);
        System.out.println(lq.isEmpty());
        lq.enqueue(60);
        lq.enqueue(70);
        System.out.println(lq.getFront());
        System.out.println(lq.getRear());
        System.out.println(lq.isEmpty());
    }

}
