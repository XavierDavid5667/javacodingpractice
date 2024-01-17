package set;

import java.util.LinkedHashSet;

public class LinkedHashSetCustomObejct {
	public static void main(String[] args) {
     LinkedHashSet<Customers>linkedHashSet=new LinkedHashSet<>();
     linkedHashSet.add(new Customers(1, "Xavier"));
     linkedHashSet.add(new Customers(2,"Francis"));
     linkedHashSet.add(new Customers(3, "Grace"));
     
     linkedHashSet.forEach((e)->System.out.println(e.getId()+" "+e.getName()));
    System.out.println("=================");
     for(Customers c:linkedHashSet) {
    	System.out.println(c.getId()+" "+c.getName());
    }
	}
}
