package com.package1;

import java.util.ArrayList;
import java.util.List;

public class CollectionPractice {
	public static void main(String[] args) {
      List<Integer>list=new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4); 
      list.add(4);
      list.add(null);
      list.add(null);
      System.out.println(list);
	}
}