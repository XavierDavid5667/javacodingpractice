package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Program1 {
	public static void main(String[] args) {
//      HashSet<String>set=new HashSet<>();
//      set.add("Java");
//      set.add("Python");
//      set.add("Javascript");
//      
//      for(String s:set) {
//    	  System.out.println(s);
//      }
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(6);
		list2.add(9);
		list2.add(12);
		list2.add(15);
		
		Set<Integer>set=new HashSet<>(list);
		set.addAll(list2);
		System.out.println(set);
		
	}
}
