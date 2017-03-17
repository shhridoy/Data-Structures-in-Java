package linkedlist3;

import java.util.LinkedList;

public class LinkedList3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList ll = new LinkedList();
        // add elements to the linked list
      ll.add(3);
      ll.add(5);
      ll.add(7);
      ll.add(9);
      ll.add(11);
      System.out.println("Original contents of Linked list: " + ll);
      
      // add first and last element in Linked list
      ll.addLast(15);
      ll.addFirst(0);
      System.out.println("After adding in Last and First: " + ll);
      
      ll.add(1, 2); //inserting 2 at index 1
      System.out.println("After insertion 2 at index 1: " + ll);

      // remove elements from the linked list
      ll.remove(7); //remove using index number 7
      ll.remove(2);
      System.out.println("Linked List after deletion of index 2 and 7: " + ll);
      
      // remove first and last elements
      ll.removeFirst();
      ll.removeLast();
      System.out.println("Linked list after deleting first and last: " + ll);

      // get and set a value
      Object val = ll.get(2);
      ll.set(2, val + " Changed"); // changed value at index number 2
      System.out.println("Linked list after change/update: " + ll);
      
    }
}

/* Output: 
 * Original contents of Linked list: [3, 5, 7, 9, 11]
After adding in Last and First: [0, 3, 5, 7, 9, 11, 15]
After insertion 2 at index 1: [0, 2, 3, 5, 7, 9, 11, 15]
Linked List after deletion of index 2 and 7: [0, 2, 5, 7, 9, 11]
Linked list after deleting first and last: [2, 5, 7, 9]
Linked list after change/update: [2, 5, 7 Changed, 9]
 */
