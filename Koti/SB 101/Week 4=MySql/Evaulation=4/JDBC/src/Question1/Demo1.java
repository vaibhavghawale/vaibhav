package Question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo1 {

 public static void main(String[] args) {
  
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Please enter course number to find enrolled student details :");
  String cname = sc.next();
  
  try {
   Class.forName("com.mysql.cj.jdbc.Driver");
  } catch (ClassNotFoundException e) {
   System.out.println("problem with loading the driver related main class");
  }
  
  
  String url = "jdbc:mysql://localhost:3306/day1";
  
  
  
  try(Connection  conn=  DriverManager.getConnection(url, "root", "Koti79@143")) {

   
   
  
   PreparedStatement ps= conn.prepareStatement("select s.roll, s.name, s.address, s.mobile  from student s INNER JOIN course c INNER JOIN student_course sc ON  s.roll = sc.roll AND c.cid=sc.cid AND c.cname=?;");
   ps.setString(1, cname);
  
  
   ResultSet rs = ps.executeQuery(); 
   
   
   while(rs.next()){
    
    int roll = rs.getInt("roll");
    String name = rs.getString("name");
    String address = rs.getString("address");
    String mobile = rs.getString("mobile");
    
    
    System.out.println("roll is :"+roll);
    System.out.println("name is :"+name);
    System.out.println("address is :"+address);
    System.out.println("mobile is :"+mobile);
    
    System.out.println("=============================");
    
   }
   
  }catch(SQLException e) {
   
   e.printStackTrace();
   System.out.println("No record found");
  }
  
 }

 private static void where(boolean next) {
  // TODO Auto-generated method stub
  
 }

}
