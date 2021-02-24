package connecctMySqlconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlConn {

	public static void main(String[] args) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jesus","root","root");
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("select * from  employee");
//			while(rs.next());
//			System.out.println(rs.getInt(1)+" "+rs.getString(2));
//			//String name1="Daniel";
//			//System.out.println("love");
//		}catch(Exception e) {}
		
		String url="jdbc:mysql://localhost:3306/Bonsa2020?autoReconnect=true&useSSL=false";
		 String dbuser="root" ;
	     String dbpassword="Tariku2112";
		
		try {
			Connection mycon=DriverManager.getConnection(url,dbuser,dbpassword);
			
		          Statement myst=mycon.createStatement();
		          
		          String sql = "insert into employee "
		        		  +"(emp_id, first_name,last_nmae,birth_day,sex,salary, super_id,branch_id)"
		        		  +"(108, 'dani', 'Bernard', '1973-07-22', 'M', 65000, 106, 3)";
		          
		          
		      myst.executeUpdate(sql); 
		      System.out.println("insert complete");
		          
		          
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		
	}

	}


