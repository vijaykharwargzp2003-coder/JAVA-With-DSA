import java.util.*;

public class main32 {
    public static void Swap(int a,int b){
        int temp =a;
        a=b;
        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = "+ b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Swap- value exchange
        //int a=5;
        //int b=10;

        //swap
       //int temp=a;
      // a=b;
       //b=temp;

       //System.out.println("a = " + a);
        //System.out.println("b = "+ b);
        int a=5;
        int b=10;
        Swap(a,b);
       // System.out.println("a = " + a);//call by value
       // System.out.println("b = "+ b);

    }
}
