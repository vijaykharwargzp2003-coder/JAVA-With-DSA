public class Excepts {
    public static void main(String[] args) {
        try{
            int num = 4/0;
            System.out.println(num);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally");
        }
        System.out.println("program");
    }
}