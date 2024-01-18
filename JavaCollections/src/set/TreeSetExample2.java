package set;

import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age, o.age);
	}

	@Override
	public String toString() {
		return name + " (Age: " + age + ")";
	}

}

public class TreeSetExample2 {
	public static void main(String[] args) {
    
		TreeSet<Person>persons=new TreeSet<>();
		persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 30));
        persons.add(new Person("Charlie", 20));
        
        Person floorPerson = persons.floor(new Person("Xavier", 28));
        Person ceilingPerson = persons.ceiling(new Person("David", 28));

        System.out.println("Floor Person: " + floorPerson);     // Output: Bob (Age: 30)
        System.out.println("Ceiling Person: " + ceilingPerson); // Output: Alice (Age: 25)
	}
}
