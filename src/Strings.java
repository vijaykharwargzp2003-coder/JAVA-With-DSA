import java.util.*;
public class Strings {
    public static boolean isPalindrome(String str){
        int n= str.length();
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i)!= str.charAt(n-1-i)){
                // Not palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
//        String firstNme= "Vijay";
//        String lastNme= "Vijay";
//        String fullNme=firstNme + " " +  lastNme ;
//        System.out.println(fullNme.charAt(0));

        String str = "racecar";
        System.out.println(isPalindrome(str));

    }
}
