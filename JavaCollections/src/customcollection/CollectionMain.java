package customcollection;

import java.util.Iterator;

public class CollectionMain {
	public static void main(String[] args) {
      CustomGenericList<Integer>list=new CustomGenericList<>();
      
      list.add(1);
      list.add(2);
      list.add(3);
      
//      Iterator<Integer> iterator = list.iterator();
//      while(iterator.hasNext()) {
//    	  System.out.println(iterator.next());
//      }
      
      
      for(int integer:list) {
    	  System.out.println(integer);
      }
	}
}
