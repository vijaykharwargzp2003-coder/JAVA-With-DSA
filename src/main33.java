import java.util.Scanner;

public class main33 {
    public static int Multiply(int a,int b){ //find product of a & b
        int product=a*b;
        return product;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=3;
        int b=5;
         int product=Multiply(a,b);
        System.out.println("a * b =" + product);

    }

}
