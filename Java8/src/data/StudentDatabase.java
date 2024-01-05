package data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDatabase {
	public static Supplier<Student> studentSupplier=()->{
		Bike bike=new Bike();
		bike.setModel("2017");
		bike.setName("FZ900");
		Student student = new Student("Adam",2,3.6,"male",Arrays.asList("swimming","Talking"));
		student.setBike(Optional.ofNullable(bike));
		return student;
		
	};
	

	public static List<Student> getAllStudents(){
		
		Student student1=new Student("Adam", 2, 3.6, "male",Arrays.asList("swimming","basketball","volleyball"),11);
		Student student2=new Student("Jonny", 2, 3.8, "female",Arrays.asList("swimming","gymnatics","soccer"),12);
		
		Student student3=new Student("Emily", 3, 4.0, "female",Arrays.asList("swimming","gymnatics","aerobics"),10);
		Student student4=new Student("Dave", 3, 3.9, "male",Arrays.asList("swimming","gymnatics","soccer"),9);
		
		
		Student student5=new Student("Sophia", 4, 3.5, "female",Arrays.asList("swimming","dancing","football"),15);
		Student student6=new Student("James", 4, 3.9, "male",Arrays.asList("swimming","basketball","baseball","football"),14);
		
		return Arrays.asList(student1,student2,student3,student4,student5,student6);
	}
	public static Optional<Student> getOptionalStudent() {
		// TODO Auto-generated method stub
		
		return Optional.ofNullable(studentSupplier.get());
	}
}
