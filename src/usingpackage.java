import java.util.Stack;
public  class usingpackage{
    public static void main(String[] args) {
        Stack<Integer>stack=  new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(" top elelment " + stack.peek());
        stack.pop();
        System.out.println("Stack " + stack );
        System.out.println("Stack is Empty "+ stack.isEmpty());
    }
}