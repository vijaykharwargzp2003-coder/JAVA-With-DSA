import java.util.*;
public class ArraysCC {

    public static void update(int marks[]) {
        for (int i = 0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        Scanner se=new Scanner(System.in);
        int marks[] = {97, 96, 95};
        update(marks);
        //print our marks
        for (int i = 0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

    }
}

        //int marks[] = new int[100];
       // Scanner se=new Scanner(System.in);
        //System.out.println("length of array =" + marks.length);
        //marks[0] = se.nextInt();//phy
        //marks[1] = se.nextInt();//chem
        //marks[2] = se.nextInt();//math
        //System.out.println("phy:" + marks[0]);
       // System.out.println("chem:" + marks[1]);
        //System.out.println("math:" + marks[2]);
       // marks[2]= marks[2]+1;
        //System.out.println("math:" + marks[2]);
       // int percentage = (marks[0]+marks[1]+marks[2]) /5;
        //System.out.println("percentage = "+percentage + "%");




