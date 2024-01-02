package customcollection;

import java.util.Iterator;

public class CustomGenericList<T> implements Iterable<T>{
	private T[] items;
	private int size;
	
	public CustomGenericList() {
		size=0;
		items=(T[])new Object[100];
	}
	
	public void add(T item) {
		items[size++]=item;
	}
	
	public T getItemAtIndex(int index) {
		return items[index];
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new CustomIterator(this);
	}
	private class CustomIterator implements Iterator<T>{
        
		private CustomGenericList<T> list;
		private int index=0;
		
		public CustomIterator(CustomGenericList<T> list) {
			this.list=list;
		}
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			System.out.println("has next called");
			return index < list.size;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			System.out.println("next called");
			return list.items[index++];
		}
		
	}

}
