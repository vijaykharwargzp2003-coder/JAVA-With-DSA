import java.util.*;
public class main31 {
    public static void printHelloWorld(){
        System.out.println("HELLO WORLD");
        System.out.println("HELLO WORLD");
        System.out.println("HELLO WORLD");
    }
    public static int CalculateSum(int a,int b) { //parameters or formal parameters
        int sum = a + b;
       // System.out.println("sum is:" + sum);
        return sum;

    }
    public static void main(String[]arg){
       Scanner sc=new Scanner(System.in) ;
        printHelloWorld(); // function call
        int a=sc.nextInt();
        int b= sc.nextInt();
       int sum = CalculateSum(a,b); //Argument of Actual parameters
        System.out.println("sum is:" + sum);

    }
}
