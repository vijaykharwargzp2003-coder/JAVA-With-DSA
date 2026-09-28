import java.util.*;

public class main34 {
    public static int factorial(int n){
       int f=1;
       for(int i=1;i<=n; i++){
           f=f*i;
       }
       return f;//Factorial of n
    }
    public static int binCoeff(int n,int r){
        int fact_n =  factorial (n);
        int fact_r = factorial (r);
        int fact_nmr=factorial (n-r);

        int binCoeff = fact_n/(fact_r * fact_nmr);
        return binCoeff;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println (binCoeff(7,2));
        System.out.println(factorial(5));




    }
}
