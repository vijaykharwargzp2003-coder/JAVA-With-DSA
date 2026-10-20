import java.util.*;
public class Strings4 {
    public static String substrings(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        // Substring
        //String str = "Helloworld";
        // System.out.println( str.substring(0,5));
        //System.out.println(substrings (str, 0 ,5));

//        String fruits[] = {"apple", "mango", "banana"};
//            String largest = fruits[0];
//            for (int i = 1; i < fruits.length; i++) {
//                if (largest.compareTo(fruits[i]) < 0) {
//                    largest = fruits[i];
//                }
//            }
//            System.out.println(largest);
        //String Builder
        StringBuilder sb = new StringBuilder("");
        for(char ch= 'a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        }
    }


