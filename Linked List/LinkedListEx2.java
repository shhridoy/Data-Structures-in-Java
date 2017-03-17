package linkedlistex2;
import java.util.*;

public class LinkedListEx2 {

    public static void main(String[] args) {
        //Creating list of Books
        List<LinkedListEx2Book> list = new LinkedList<LinkedListEx2Book>(); 
        
        //Creating Books  
        LinkedListEx2Book b1=new LinkedListEx2Book(101,"Learn C","Balagurushwamy","BPB",8);  
        LinkedListEx2Book b2=new LinkedListEx2Book(102,"Introducing C++","K.M. Niton","Niton computing",4);  
        LinkedListEx2Book b3=new LinkedListEx2Book(103,"Java Programing","Hilbert","Wiley",6);
        
        //Adding Books to list  
        list.add(b1);  
        list.add(b2);  
        list.add(b3);
        
        //Traversing list  
        System.out.println("ID  Name  Author  Publisher  Quantity\n");
        for(LinkedListEx2Book b : list){  
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
        } 
    }
}

/* OUTPUT:
ID  Name  Author  Publisher  Quantity
101 Learn C Balagurushwamy BPB 8
102 Introducing C++ K.M. Niton Niton computing 4
103 Java Programing Hilbert Wiley 6
*/
