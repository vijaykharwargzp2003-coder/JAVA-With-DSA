class NegNumException extends Exception{
    NegNumException(String message){
        super(message);
    }

}
public class CustomException {
    public static void value(int n)throws NegNumException {
        if(n<0){
            throw new NegNumException("negative not allowed");

        }
        System.out.println("allowed");
    }
    public static void main(String[] args) {
        try {
            value(-2);

        } catch (NegNumException e) {
            System.out.println("error caught:"+e.getMessage());
        }
        System.out.println("program continues");
    }

}