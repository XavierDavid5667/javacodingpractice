package com.package1;

import java.util.Arrays;
import java.util.List;

/**
 * Given  a list of integers find out all athe odd numbers exists
 * in the list using stream api
 * @author xdavid
 *
 */
public class Program2 {
	public static void main(String[] args) {
		List<Integer>oddNumberList=Arrays.asList(3,2,6,7,9,10);
		List<Integer> list = oddNumberList.stream().filter(num->num%2!=0).toList();
		System.out.println(list);
	}

}
