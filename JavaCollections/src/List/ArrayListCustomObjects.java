package List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListCustomObjects {
	public static void main(String[] args) {
     List<Student>students=new ArrayList<>();
     students.add(new Student("Ramesh", "ABC"));
     students.add(new Student("Prakash", "ABC"));
     students.add(new Student("Tony", "ABC"));
     
     students.sort(new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	});
     System.out.println(students);
	}
}
