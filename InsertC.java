package pack;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertC extends conn {
	   public InsertC() throws ClassNotFoundException, SQLException {
	       super();
	   }
	   public int insert(int id,String name,String email,long pno)
	           throws SQLException
	   {
	       int i=0;
	       String q="insert into student values(?,?,?,?)";
	       PreparedStatement ps=con.prepareStatement(q);
	       ps.setInt(1, id);
	       ps.setString(2, name);
	       ps.setString(3, email);
	       ps.setLong(4, pno);
	       i=ps.executeUpdate();
	       con.close();
	       return i;
	   }
	}
