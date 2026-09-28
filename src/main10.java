public class main10 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Hello");
        sb.append("World");
        System.out.println("After Append :" +sb);
        sb.insert(5,"java");
        System.out.println("After Insert:"+sb);
        sb.delete(1,4);
        System.out.println("After Delete:"+ sb);
        sb.reverse();
        System.out.println("After Reverse :"+ sb);
    }
}