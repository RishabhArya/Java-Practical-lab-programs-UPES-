package sqlconnector;
import java.sql.*;  
public class MysqlConDel{  
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","qwerty");
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		while(rs.next()){System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  }
		System.out.println("Deleating records into the table...");
	    stmt = con.createStatement();
	    String sql = "DELETE FROM emp " + "WHERE id = 13";
	    stmt.executeUpdate(sql);
	    System.out.println("Records deleated from the table...");
	    con.close();  
		System.out.println("Connection Closed...");
		}catch(Exception e){ System.out.println(e);}  
	}		  
}  