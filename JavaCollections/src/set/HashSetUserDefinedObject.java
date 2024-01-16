package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetUserDefinedObject {
	public static void main(String[] args) {
    
		Set<Customer>customers=new HashSet<>();
		   customers.add(new Customer(1, "Ramesh"));
	        customers.add(new Customer(2, "Pramod"));
	        customers.add(new Customer(3, "Sanjay"));
	        
	        System.out.println(customers);
	}
}
