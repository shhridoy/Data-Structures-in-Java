package arraylist;

import java.util.ArrayList;
import java.util.List;


public class ArrayList1 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> words = new ArrayList<String>();
        System.out.println("Current Array List: ");
        // append
        words.add("C");
        words.add("C++");
        words.add("Java");
        printList(words);
 
        words.add(0, "Python");
        System.out.println("\nInsert via index: ");
        printList(words);
 
        words.set(1, "C#");
        System.out.println("\nUpdate via index: ");
        printList(words);
 
        words.remove(0);
        System.out.println("\nRemove via index: ");
        printList(words);
        
    }
    
    public static void printList(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            System.out.println("Words[" + i + "]: " + words.get(i));
        }
    }
}

/* OUTPUT:
 * Current Array List: 
Words[0]: C
Words[1]: C++
Words[2]: Java

Insert via index: 
Words[0]: Python
Words[1]: C
Words[2]: C++
Words[3]: Java

Update via index: 
Words[0]: Python
Words[1]: C#
Words[2]: C++
Words[3]: Java

Remove via index: 
Words[0]: C#
Words[1]: C++
Words[2]: Java
*/
