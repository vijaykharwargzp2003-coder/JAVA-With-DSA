import java.util.ArrayList;
import java.util.Collections;
public class Classroom3 {
    public static void swap(ArrayList<Integer>List,int idx1,int idx2){
        int temp=List.get(idx1);
        List.set(idx1,List.get(idx2));
        List.set(idx2,temp);
    }
    public static void main(String[] args) {
       // ArrayList<Integer> List = new ArrayList<>();
        //List.add(2);
       // List.add(5);
       // List.add(9);
        //List.add(3);
       // List.add(6);
        //int idx1=1,idx2=3;
        //System.out.println(List);
       // swap(List,idx1,idx2);
        //System.out.println(List);
        //System.out.println(List);//Ascending order
        //Collections.sort(List);
        //System.out.println(List);
        //descending order
       // Collections.sort(List,Collections.reverseOrder());
        //Comparator_function logic
        //System.out.println(List);
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
       ArrayList<Integer>List1=new ArrayList<>();
        ArrayList<Integer>List2=new ArrayList<>();
        ArrayList<Integer>List3=new ArrayList<>();
        for(int i=1;i<=5;i++){
           List1.add(i*1);//1,2,3,4,5
            List2.add(i*2);//2,4,6,8,10
            List3.add(i*3);//3,6,9,12,15
        }
        mainList.add(List1);
       mainList.add(List2);
      mainList.add(List3);
      List1.remove(2);
      List2.remove(3);
        System.out.println(mainList);
        //nested loops
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>currentList=mainList.get(i);
            for(int j=0;j<currentList.size();j++) {
                System.out.println(currentList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
