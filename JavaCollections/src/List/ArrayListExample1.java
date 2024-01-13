package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample1 {
	public static void main(String[] args) {
 	List<String>fruits=new ArrayList<>();
 	 fruits.add("Banana");
     fruits.add("Apple");
     fruits.add("mango");
     fruits.add("orange");
     fruits.add("Watermelon");
     fruits.add("Strawberry");
	
     System.out.println("==Iterating using Java 8 forEach and Lambda==");
     fruits.forEach(System.out::println);
     
     System.out.println("==Iterating using an iterator()==");
     Iterator<String> iterator = fruits.iterator();
     while(iterator.hasNext()) {
    	 System.out.println(iterator.next());
    	 
    	 
     System.out.println("==Iterating using forEachRemaining() method==");
     Iterator<String>iterator2=fruits.iterator();
     iterator2.forEachRemaining(System.out::println);
     
     System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
     ListIterator<String> listIterator = fruits.listIterator(fruits.size());
     while(listIterator.hasPrevious()) {
    	 System.out.println(listIterator.previous());
     }
     }
	}
}
