package Question3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/day3";
         Connection conn=null; //Connection is interface so we cannot use without initializing
		try {
			 conn = DriverManager.getConnection(url, "root", "Koti79@143");
			Statement st = conn.createStatement();

int x = st.executeUpdate("insert into student values(10,'Ram','Ayodhya','9014559782','1990-01-01'),(11,'Adam','Aru','9014559789','1998-01-01'),(12,'Koti','Nandigama','9014599789','1999-12-12')");
int y = st.executeUpdate("insert into course values(101,'JAVA',1000,'12 Weeks'),(102,'Spring',1000,'12 Weeks'),(103,'Sql',1000,'12 Weeks')");
int z= st.executeUpdate("insert into student_course values(10,101),(11,102),(12,103)");
			if (x > 0 && y>0 && z>0)
				System.out.println("record inserted sucessfully..!");
			else
				System.out.println("not inserted..");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

       finally {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	}
}



