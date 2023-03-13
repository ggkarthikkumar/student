package pack;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class SelectC extends conn {
	   public SelectC() throws ClassNotFoundException, SQLException {
	       super();
	   }
	   public void select(int id) throws SQLException
	   {
	       String q="select * from student where id=?";
	       PreparedStatement ps=con.prepareStatement(q);
	       ps.setInt(1, id);
	       ResultSet rs=ps.executeQuery();
	       rs.next();
	       System.out.println("Employee Infomartion.........");
	       System.out.println("Employee Id:"+rs.getInt("ID"));
	       System.out.println("Employee Name:"+rs.getString("NAME"));
	       System.out.println("Employee Email:"+rs.getString("EMAIL"));
	       System.out.println("Employee PNO :"+rs.getLong("PNO"));
	       con.close();
	   }
	}
