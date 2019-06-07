import java.util.Iterator;

//
// Complete this class: 15 points
//
// Note:
// Do NOT copy from textbook, or any other sources
// Do NOT copy from code that we did in class (as it contains errors)
//
// Do READ CODE from textbook and in-class code and write it out as your own code
//
public class DynamicArray<T> implements Iterable<T>
{
  
  private static final int INITCAP = 2; // default initial capacity / minimum capacity
  private T[] storage; // underlying array
  private int size;
  private int capacity;
  private T item;

    public static void main(String [] args)
    {
        //Optional: test DynamicArray here
        DynamicArray<Double> A = new DynamicArray<Double>();
        for(int i=0;i<20;i++) A.insert(Math.random()*100);
        for(Double v : A)
        {
          System.out.println(v);
        }
    }

    // Note: You can add any private data and methods here

    @SuppressWarnings("unchecked")
    public DynamicArray() //constructor
    {
      this.capacity = INITCAP;
      storage = (T[]) new Object[INITCAP]; 
      size = 0;
    }

    @SuppressWarnings("unchecked")
    public void insert(T data)
    {
      
    }

    public T get(int index) //get value by index
    {
      if (!isEmpty(index)) {
      return storage[index];
    }
    }

    public int size() //size of the dynamic array
    {
      return size;
    }

    void delete() //delete the last value in the array
   {
      if (storage != null && !storage.isEmpty()) {
       storage.remove(storage.size()-1);
    }
   }

   void delete(int loc) //delete element at index "loc"
   {
     if (storage == null
            || loc < 0
            || loc >= storage.length) { 
  
            return storage; 
        } 
  
        // Create another array of size one less 
        int[] anotherArray = new int[storage.length - 1]; 
  
        // Copy the elements except the index 
        // from original array to the other array 
        for (int i = 0, k = 0; i < storage.length; i++) { 
  
            // if the index is 
            // the removal element index 
            if (i == loc) { 
                continue; 
            } 
  
            // if the index is not 
            // the removal element index 
            anotherArray[k++] = storage[i]; 
        } 
  
        // return the resultant array 
        return anotherArray; 
   }

    boolean is_empty(){ 
      if ((i < 0) || (i > size)) {
      throw new IndexOutOfBoundsException("is empty");
    }
    else {
      return true;
    }
    } //replace true

    public Iterator<T> iterator(){
      return null;
    }

    //Note: You will need to implement an iterator class using java.util.Iterator
    //      interface

    //TO DO: implement iterator here
}
