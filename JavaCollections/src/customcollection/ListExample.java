package customcollection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
     List<Integer>list=new ArrayList<>();
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(2);
     
     //System.out.println("Element that got replaced "+list.set(1,100));
     
     List<Integer>list2=new ArrayList<>();
     list2.add(4);
     list2.add(5);
     list2.add(6);
     list2.add(7);
     list2.add(8);
     list2.add(9);
     

     System.out.println("List 1 :"+list);
     System.out.println("List 2 :"+list2);
     list.addAll(list2);
     System.out.println("List1 addAll List2 :"+list);
     
     // To index is exculsive
     List<Integer> subList = list2.subList(1, 4);
     System.out.println(subList);
     //shallow copy
     subList.add(1, 99);
     System.out.println(subList);
     System.out.println(list2);
	}
}
