package com.jan23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortOnNameThenAge {

	public static void main(String[] args) {
	List<Person> personList=new ArrayList<>();
	personList.add(new Person("Xavier", 23));
	personList.add(new Person("Shivani",23));
	personList.add(new Person("Shiv",22));
	personList.add(new Person("Gokulakrishnan",22));
	personList.add(new Person("Varun",23));
	personList.add(new Person("Francis",21));
	Collections.sort(personList,Comparator.comparing(Person::getName).thenComparing(Person::getAge));
	System.out.println(personList);
	List<Person> collect = personList.stream().sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge)).collect(Collectors.toList());
	System.out.println(collect);
	Collections.sort(personList,new NameThenAgeComparator());
	System.out.println(personList);
 }
}
