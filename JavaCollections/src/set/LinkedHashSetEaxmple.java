package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEaxmple {
	public static void main(String[] args) {
     
		LinkedHashSet<String>linkedHashSet=new LinkedHashSet<>();
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Cherry");
		
		Iterator<String> iterator = linkedHashSet.iterator();
	    while(iterator.hasNext()) {
	    	System.out.println(iterator.next());
	    }
	    System.out.println("==============");
	    for(String s:linkedHashSet) {
	    	System.out.println(s);
	    }
	}
}
