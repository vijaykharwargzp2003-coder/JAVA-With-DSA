class StackNode{
    int data;
    StackNode next;
    StackNode(int data){
        this.data=data;
        next=null;

    }
}
class MyStack {
    StackNode top;

    void push(int data) {
        StackNode newnode = new StackNode(data);
        newnode.next = top;
        top = newnode;
    }

    int pop() {
        if (top == null) {
            System.out.println("stack is empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    int peek() {
        if (top == null) {
            return -1;
        }
        return top.data;
    }
    boolean isEmpty(){
        return top==null;
    }
}
public class Basic{
    public static void main(String[] args){
        MyStack st=new MyStack();
        st.push(22);
        st.push(24);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());

    }
}