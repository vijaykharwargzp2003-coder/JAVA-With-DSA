import java.util.*;
public class main36 {
    //Check if a number is prime or not

    //public static boolean isPrime(int n){
       // boolean isPrime=true;
        //for(int i=2;i<=n-1;i++){
            //if(n%i==0){ //completely Dividing
               // isPrime=false;
           // }
       // }
       // return isPrime;
   // }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % 2==0){//completely Dividing
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n){
        for(int i=2; i<=n;i++){
            if(isPrime(i)){//true
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println( isPrime(11));
        //System.out.println( isPrime(11));
        primeRange(20);
    }
}
