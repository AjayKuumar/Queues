////class queue{
////    int cap;
////    int size;
////    int[] arr;
////    queue(int n) {
////     cap = n;
////     size = 0;
////     arr = new int[n];
////    }
////    void enqueue(int x){
////        if (isFull()){
////            return ;
////        }
////        arr[size]=x;
////        size++;
////    }
////    void dequeue(){
////        if (isEmpty()){
////            return ;
////        }
////        for (int i = 0; i <size-1 ; i++) {
////            arr[i]=arr[i+1];
////        }
////        size--;
////    }
////    int getFront(){
////        if (isEmpty()){
////            return -1;
////        }
////        return arr[0];
////    }
////    int getRear(){
////        if (isEmpty()){
////            return 1;
////        }
////        return arr[size-1];
////    }
////    int size(){
////        return size;
////    }
////    boolean isEmpty(){
////        return size==0;
////    }
////    boolean isFull(){
////        return size==arr.length;
////    }
////}
//class queue{
//    int [] arr;
//    int cap,front, size;
//    queue(int c){
//        arr= new int[c];
//        cap = c;
//        front = 0;
//        size  = 0;
//    }
//    boolean isFull(){
//        return (size+1)%cap==front;
//    }
//    boolean isEmpty(){
//        return size==front;
//    }
//    void enqueue(int x){
//        if(isFull()){
//            return ;
//        }
//        arr[size]=x;
//        size = (size+1)%cap;
//    }
//    void dequeue(){
//        front = (front+1)%cap;
//    }
//
//}
//
class queue{
    int[] arr;
    int front;
    int size;
    int cap;
    queue(int n){
        arr=new int[n];
        front=0;
        size=0;
        cap=n;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==cap;
    }
    public int getFront(){
        if (isEmpty()){
            return -1;
        }
        return arr[front];
    }
    public int getSize(){
        return size;
    }
    public int getRear(){
        if (isEmpty()){
            return -1;
        }
        return arr[(front+size-1)%cap];
    }
    public void enqueue(int x){
        if (isFull()){
            return ;
        }
        int rear = (front+size-1)%cap;
        rear = (rear+1)%cap;
        arr[rear]=x;
        size++;
    }
    public void dequeue(){
        if (isEmpty()){
            return ;
        }
        front= (front+1)%cap;
        size--;
    }
}
public class ArrayImplementation {
    public static void main(String[] args) {
        queue q = new queue(4);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.getSize());
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        q.dequeue();
        q.dequeue();
        System.out.println(q.getSize());
        System.out.println(q.getFront());
        System.out.println(q.getRear());
        q.enqueue(50);
        System.out.println(q.getRear());
        System.out.println(q.getFront());
        System.out.println(q.getSize());
        q.enqueue(60);
        System.out.println(q.isFull());

    }
}
