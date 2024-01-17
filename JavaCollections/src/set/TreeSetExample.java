package set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
//    TreeSet<String>fruits=new TreeSet<>(Comparator.reverseOrder());
//    fruits.add("Banana");
//    fruits.add("Apple");
//    fruits.add("Pineapple");
//    fruits.add("Orange");
//    System.out.println(fruits);
		
		TreeSet<String> students = new TreeSet<>(Comparator.reverseOrder());
		students.add("Ramesh");
		students.add("Prakash");
		students.add("Amir");
		// Navigating through the TreeSet
		System.out.println(students);
		System.out.println("First element : " + students.first());
		System.out.println("Last element :"+students.last());
		
		String name="Amir";
		System.out.println("Element just greater than "+name+" : "+students.higher(name));
		System.out.println("Element just lower than "  + name + " : " + students.lower(name));
			}
}
