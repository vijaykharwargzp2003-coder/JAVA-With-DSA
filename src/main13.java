import java.util.Scanner;

public class main13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius:");
        double r=sc.nextDouble();
        System.out.print("Area is:");
        double a=3.141592*r*r;
        System.out.println(a);
    }
}
