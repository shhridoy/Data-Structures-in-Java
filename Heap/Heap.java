package heap;

public class Heap {

    private final int size = 5;
    private int arr[] = new int[size];
    private int count;
    
    public void Adjust(int startIndex, int endIndex){
        int item = arr[startIndex];
        int i = startIndex;
        while(i/2 >= endIndex){
            if(arr[i/2] < item){
                arr[i] = arr[i/2];
                i = i/2;
            }
            else{
                break;
            }
            arr[i] = item; // set new index at item
        }
    }
    
    public void Insert(int value){
        if(count < size-1){ // insert element from index 1
            count++;
            arr[count] = value;
            Adjust(count, 1); 
        }
        else{
            System.out.println("Heap is full");
        }
    }
    
    public void print(){
        System.out.print("Heap (max-priority): ");
        for(int i=1; i<=count; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        Heap ob = new Heap();
        ob.Insert(30);
        ob.Insert(50);
        ob.Insert(10);
        ob.Insert(5);
        ob.Insert(300); // this element doesn't print coz the array size full
        ob.print();
    }
}

/* OUTPUT:
Heap is full
Heap (max-priority): 50 30 10 5
 */
