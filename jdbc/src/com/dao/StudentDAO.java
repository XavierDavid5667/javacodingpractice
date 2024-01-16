package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;
/**
 * 
 * @author xdavid
 *
 */
public class StudentDAO {

	public static boolean insertStudent(Student student) {
		Connection connection = DBConenctionManager.getConnection();
		String query = "insert into students(sname,sphone,scity) values(?,?,?)";
		boolean flag = false;
		try {
			PreparedStatement pStmt = connection.prepareStatement(query);
			pStmt.setString(1, student.getsName());
			pStmt.setString(2, student.getsPhone());
			pStmt.setString(3, student.getsCity());
			pStmt.executeUpdate();
			flag = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return flag;
	}

	public static boolean deleteStudent(String sname) {
		Connection connection = DBConenctionManager.getConnection();
		boolean flag=false;
		String query="delete from students where sname=?";
		try {
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		prepareStatement.setString(1,sname);
			prepareStatement.executeUpdate();
			flag=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(connection!=null) {
					connection.close();
				}
			}catch (SQLException e) {
			  e.printStackTrace();
			}
		}
		return flag;
	}
	
	public static List<Student> getAllStudents(){
		Connection connection = DBConenctionManager.getConnection();
		String query="select * from students";
		List<Student>students=new ArrayList<>();
		try {
			Statement createStatement = connection.createStatement();
			ResultSet rs= createStatement.executeQuery(query);
			
			while(rs.next()) {
				Student student=new Student();
				student.setsId(rs.getInt(1));
				student.setsName(rs.getString(2));
				student.setsPhone(rs.getString(3));
				student.setsCity(rs.getString("scity"));
				students.add(student);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(connection!=null) {
					connection.close();
				}
			}catch (SQLException e) {
			  e.printStackTrace();
			}
		}
		
		return students;
	}
	
	public static boolean updateStudent(String sName,Student student) {
		Connection connection = DBConenctionManager.getConnection();
		String query="update students set sname=?,sphone=?,scity=? where sname=?";
		boolean flag=false;
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(query);
			prepareStatement.setString(1,student.getsName());
			prepareStatement.setString(2, student.getsPhone());
			prepareStatement.setString(3,student.getsCity());
			prepareStatement.setString(4,sName);
			prepareStatement.executeUpdate();
			flag=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(connection!=null) {
					connection.close();
				}
			}catch (SQLException e) {
			  e.printStackTrace();
			}
	}
		return flag;
}
}
