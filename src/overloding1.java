 class main{
    void sum(int a,int b){
        System.out.println("sum of two int type:"+(a+b));

    }
    void sum(int a,int b, int c){
        System.out.println("sum of three int type:"+(a+b+c));
    }
    void sum(double a,double b,double c){
        System.out.println("sum of three double type:"+(a+b+c));
    }
}
 public class overloding1 {
     public static void main(String[] args) {
       main  calc=new main();
         calc.sum(34,45);
         calc.sum(34,5,65);
         calc.sum(3.4,4.5,6.5);
     }
 }
        


