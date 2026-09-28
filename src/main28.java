import java.util.Scanner;

public class main28 {
    public static void main(String[] args) {
       // int a=56;
        //int b=34;
        //System.out.println(a>b);
        //question=take positive integer input and tell if it is odd or even
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }



    }
}
