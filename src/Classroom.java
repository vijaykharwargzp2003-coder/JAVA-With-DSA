import java.util.ArrayList;
public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        ArrayList<String>List2=new ArrayList<>(); 
        ArrayList<Boolean>List3=new ArrayList<>();
        List.add(1);//0(1)time complexity
        List.add(2);
        List.add(3);
        List.add(4);
       // List.add(1,9);
        //System.out.println(List);
        //System.out.println(List.size());
        //print array List
        //for(int i=0;i<List.size();i++){
           // System.out.println(List.get(i)+"");
        //}
        //System.out.println();
        // reverse print=0(n)
        for(int i=List.size()-1;i>=0;i--){
            System.out.println(List.get(i)+"");
        }
        System.out.println();
        //Get operation= 0(1)
        //int element=List.get(2);
        //System.out.println(element);
        //Delete=0(n)
        //List.remove(2);
       // System.out.println(List);
        //set=0(n)
        //List.set(2,10);
        //System.out.println(List);
        //contains=0(n)
         //System.out.println(List.contains(5));
         // System.out.println(List.contains(23));
        //for(int n:List){
           // System.out.println(n);
       // }





    }
}
