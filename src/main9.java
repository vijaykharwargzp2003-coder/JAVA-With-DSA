public class main9 {
    public static void main(String[] args) {
        String str1="java";
        System.out.println("length of\""+str1+"\"\u2192"+str1.length());
        String str2="hello";
        String str3="world";
        System.out.println("\""+str2+"\"+\""+str3+"\"\u2192"+(str2+str3));
        System.out.println("using concat():"+str2.concat(str3));
    }
}
