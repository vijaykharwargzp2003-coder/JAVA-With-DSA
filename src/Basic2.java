class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        next = null;
    }
}
class MyQueue {
    QueueNode front, rear;

    void add(int data) {
        QueueNode newnode = new QueueNode(data);
        if (rear == null) {
            front = rear = newnode;
        } else {
            rear.next = newnode;
            rear = newnode;
        }
    }

    int remove() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }

    int peek() {
        if (front == null) {
            return -1;
        }
        return front.data;

    }

    boolean isEmpty() {
        return front == null;
    }
}
public class Basic2{
    public  static void main(String[] args){
        MyQueue q=new MyQueue();
        q.add(34);
        q.add(45);
        System.out.println(q.peek());
    }
}