package queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class QueueClass {
   
   public static void main(String[] args) {
      
      Deque<Integer> qeue = new ArrayDeque<Integer>();
      qeue.add(50); // adding element in queue
      qeue.add(75);
      qeue.add(22);
      qeue.add(25);
      qeue.add(12);
      System.out.println("Element in Qeue: "+qeue);
      
      System.out.println("First Element: "+qeue.getFirst()); // print the first element in queue
      System.out.println("Last Element: "+qeue.getLast()); // print the last element in queue
      System.out.println("First element poped");
      qeue.remove(); // remove the first element in queue
      System.out.println("Element in Qeue: "+qeue);
   }
}
/* OUTPUT:
Element in Qeue: [50, 75, 22, 25, 12]
First Element: 50
Last Element: 12
First element poped
Element in Qeue: [75, 22, 25, 12]
*/
