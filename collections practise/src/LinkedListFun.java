import java.util.*;
public class LinkedListFun {
    public static void main(String args[]){
        LinkedList<String> ll=new LinkedList<>();
        ll.add("divya");
        ll.add("kavya");
        ll.add("shashi");
        ll.add("bhavya");
        ll.addFirst("first");
        ll.addLast("last");
        Iterator<String> itr=ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("the head is : "+ll.peek());
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
