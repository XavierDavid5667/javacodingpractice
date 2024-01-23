package com.jan23;

import java.util.Comparator;

public class NameThenAgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		int val = o1.getName().compareTo(o2.getName());
		if(val==0) {
			return o1.getAge()-o2.getAge();
		}
		return val;
	}

}
