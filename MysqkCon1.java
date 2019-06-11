package sqlconnector;
import java.sql.*;  
public class MysqkCon1{  
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","qwerty");
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		while(rs.next()){System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  }
		System.out.println("Inserting records into the table...");
	    stmt = con.createStatement();
	    String sql = "INSERT INTO emp " + "VALUES (11,'abc',20)";
	    stmt.executeUpdate(sql);
	    String sql1 = "INSERT INTO emp " + "VALUES (12,'qwe',21)";
	    stmt.executeUpdate(sql1);
	    String sql2 = "INSERT INTO emp " + "VALUES (13,'asd',23)";
	    stmt.executeUpdate(sql2);
	    String sql3 = "INSERT INTO emp " + "VALUES (14,'zxc',24)";
	    stmt.executeUpdate(sql3);
	    String sql4 = "INSERT INTO emp " + "VALUES (15,'bnm',25)";
	    stmt.executeUpdate(sql4);
	    System.out.println("Inserted records into the table...");
	    con.close();  
		System.out.println("Connection Closed...");
		}catch(Exception e){ System.out.println(e);}  
	}		  
}  