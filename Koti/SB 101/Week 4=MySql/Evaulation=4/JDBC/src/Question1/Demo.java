package Question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {

 public static void main(String[] args) {
  
  
  Scanner sc = new Scanner(System.in);
  System.out.println("Please enter roll number to find course :");
  int roll = sc.nextInt();
  
  try {
   Class.forName("com.mysql.cj.jdbc.Driver");
  } catch (ClassNotFoundException e) {
   System.out.println("problem with loading the driver related main class");
  }
  
  
  String url = "jdbc:mysql://localhost:3306/day1";
  
  
  
  try(Connection  conn=  DriverManager.getConnection(url, "root", "Koti79@143")) {

   PreparedStatement ps= conn.prepareStatement("select c.cname, c.fee, c.duration  from student s INNER JOIN course c INNER JOIN student_course sc ON  s.roll = sc.roll AND c.cid=sc.cid AND s.roll=?;");
   ps.setInt(1, roll);
   ResultSet r = ps.executeQuery(); 
    
   while(r.next()){
    
    
    String cname = r.getString("cname");
    int fee = r.getInt("fee");
    String duration = r.getString("duration");
   
    System.out.println("cname :"+cname);
    System.out.println("fee is :"+fee);
    System.out.println("duration is :"+duration);
    
    System.out.println("-----------------------------------");
    
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


