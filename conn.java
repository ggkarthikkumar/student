package pack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conn {
	public static Connection con;
	   public  conn() throws ClassNotFoundException, SQLException
	   {
	   Class.forName("com.mysql.cj.jdbc.Driver");    
	   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","");
	   }
}