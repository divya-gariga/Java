import java.util.*;
public class ArrayListFun {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("divya");
        list.add("Kavya");
        list.add("nithya");
        list.add("pardhu");
        list.add(0,"first");
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}  