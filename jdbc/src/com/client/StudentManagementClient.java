package com.client;

import java.util.List;
import java.util.Scanner;

import com.dao.DBConenctionManager;
import com.dao.StudentDAO;
import com.model.Student;
/**
 * 
 * @author xdavid
 *
 */

public class StudentManagementClient {
	public static void main(String[] args) throws IllegalAccessException {
    Scanner scanner=new Scanner(System.in);
    int choice=0;
		do{
			System.out.println("1. Add student \n2.Delete Student \n3. Display students  \n4.Update student  \n5 exit");
			 choice=scanner.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Enter Student Name");
				String name=scanner.next();
				if(name.isEmpty()) {
					throw new IllegalAccessException("Name should no be empty");
				}
				System.out.println("Enter Student PhoneNo");
				String phoneNo=scanner.next();
				System.out.println("Enter user city");
				String city=scanner.next();
				Student student=new Student(name, phoneNo, city);
				boolean insertStudent = StudentDAO.insertStudent(student);
				if(insertStudent) {
					System.out.println("Student Inserted Successfully");
				}else {
					System.out.println("Some error occured while inserting");
				}
			
			break;
				
			case 2:
				System.out.println("Enter the student name to delete");
				String sname=scanner.next();
				boolean deleteStudent = StudentDAO.deleteStudent(sname);
				if(deleteStudent) {
					System.out.println("Student deleted succesfully");
				}else {
					System.out.println("Some issue occurred while deleting student");
				}
			break;
			
			case 3:
				System.out.println("Displaying all students in the database");
				List<Student> allStudents = StudentDAO.getAllStudents();
				for(Student s:allStudents) {
					System.out.println(s);
				}
				
			break;
			
			case 4:
				System.out.println("Enter the student name who's details are to be updated");
				String sname1=scanner.next();
				System.out.println("Enter new student name");
				String newSname=scanner.next();
				System.out.println("Enter new Student PhoneNo");
				String phone=scanner.next();
				System.out.println("Enter new user city");
				String city1=scanner.next();
				Student student1=new Student(newSname, phone, city1);
				boolean updateStudent = StudentDAO.updateStudent(sname1, student1);
				if(updateStudent) {
					System.out.println("Student updated successfully");
					System.out.println("Fetching all student details");
					List<Student> allStudents1 = StudentDAO.getAllStudents();
					for(Student s:allStudents1) {
						System.out.println(s);
					}
				}
				
			break;
			
			case 5:
				System.out.println("Thank you for using the application!!");
				
			break;
			}
				
			}while(choice!=5);

		}
	}

