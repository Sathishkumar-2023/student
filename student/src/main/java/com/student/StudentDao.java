package com.student;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
 
 
import com.student.StudentDto;
 
public class StudentDao {
 
 
 public static Connection getconnection() throws SQLException
 {
  try {
   Class.forName("com.mysql.cj.jdbc.Driver");
   Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","root");
   return connection;
  } catch (ClassNotFoundException e) {
   e.printStackTrace();
  }
  return null;
 }
 
 
 
 public static int saveStudent(StudentDto emp) throws ClassNotFoundException, SQLException {
  Connection con=getconnection();
  PreparedStatement pst=con.prepareStatement("insert into student values (?,?,?,?,?)");
  pst.setInt(1, emp.getid());
  pst.setString(2, emp.getname());
  pst.setInt(3, emp.getphysics());
  pst.setInt(4, emp.getchemistry());
  pst.setInt(5, emp.getmaths());
  
  return pst.executeUpdate();
 }
 
 public static StudentDto findStudent(int id) throws ClassNotFoundException, SQLException
 {
  Connection con=getconnection();
  PreparedStatement pst=con.prepareStatement("select * from student where id=?");
  pst.setInt(1, id);
  ResultSet rs=pst.executeQuery();
  if(rs.next())
  {
   StudentDto emp=new StudentDto(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5));
   
   return emp;
  }
  else {
   return null;
  }
 
 }
 
 public static List<StudentDto> findallStudent() throws ClassNotFoundException, SQLException
 {
  Connection con=getconnection();
  Statement st= con.createStatement();
  
  ResultSet rs=st.executeQuery("select * from student");
  
  List<StudentDto> list=new ArrayList<>();
  while(rs.next())
  {
   StudentDto ee= new StudentDto(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5));
   list.add(ee);
   
  }
 return list;
   
 }
 
 
 
 
 public static int deleteStudent(int id) throws ClassNotFoundException, SQLException {
  Connection con=getconnection();
  PreparedStatement pst=con.prepareStatement("delete from student where id = ?");
  pst.setInt(1, id);
  return pst.executeUpdate();
  
  
 }
 
 public static boolean findadmin(String email,String password) throws SQLException {
  Connection con=getconnection();
  PreparedStatement pst=con.prepareStatement("select * from admin where email=? and password =?");
  pst.setString(1, email);
  pst.setString(2,password);
  ResultSet rs= pst.executeQuery();
  if(rs.next()) {
   return true; 
  }
  else
  {
   return false;
  }
 }
 
 public static int saveadmin(int id, String name,String email,long contact,String password) throws SQLException 
  
 {
  Connection con=getconnection();
  PreparedStatement pst=con.prepareStatement("insert into admin values(?,?,?,?,?)");
  pst.setInt(1, id);
  pst.setString(2, name);
  pst.setString(3 ,email);
  pst.setLong(4, contact);
  pst.setString(5, password);
  return pst.executeUpdate();
 }



public static int Addstudent(int id, String name, Double physics, Double chemistry, Double maths) {
	// TODO Auto-generated method stub
	return 0;
} 
 
}
