package linkedlist;
import java.util.*;

public class LinkedList1 {

    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> al = new LinkedList<Integer>();  
        al.add(5);  
        al.add(7);  
        al.add(9);  
        al.add(11);  
  
        Iterator<Integer> itr = al.iterator();  //(:/)
        
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        } 
    }
}

/* Output:
5
7
9
11
*/
