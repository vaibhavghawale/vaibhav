package Question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Roll : ");
	 int roll=sc.nextInt();
	 
	 System.out.println("Enter name : ");
	 String name=sc.next();
	 
	 System.out.println("Enter Address : ");
	 String address=sc.next();
	 
	 System.out.println("Enter Mobile No : ");
	 String mobile=sc.next();
	 
	 System.out.println("=========================================");
	 
	 System.out.println("Course id : ");
	 int cid=sc.nextInt();
	 
	 System.out.println("Course name : ");
	 String cname=sc.next();
	 
	 System.out.println("Course fee : ");
	 int fee=sc.nextInt();
	 
	 System.out.println("Course duration : ");
	 String duration=sc.next();
	 
	 System.out.println("=========================================");
	 System.out.println("Course roll : ");
	 int roll1=sc.nextInt();
	 
	 System.out.println("Course id : ");
	 int cid1=sc.nextInt();
	 
	 
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("problem with loading driver");
	}
	
	String url="jdbc:mysql://localhost:3306/day1";
	
	try {
		Connection conn=DriverManager.getConnection(url, "root", "Koti79@143");
		Statement st=conn.createStatement();
		
int x=st.executeUpdate("insert into student values("+roll+","+name+","+address+","+mobile+")");
int y=st.executeUpdate("insert into student values("+cid+","+cname+","+fee+","+duration+")");
int z=st.executeUpdate("insert into student values("+roll1+","+cid1+")");

     if(x>0 && y>0 && z>0) {
    	 System.out.println("record inserted sucessfully");
     }
     else {
    	 System.out.println("not inserted ");
     }

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
}
}




