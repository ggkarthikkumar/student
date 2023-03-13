package pack;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UpdateC extends conn{
	   public UpdateC() throws ClassNotFoundException, SQLException
	   {
	       super();
	   }
	   public void update(int id,String name) throws SQLException
	   {
	       String q="update student set name=? where id=?";
	       PreparedStatement ps=con.prepareStatement(q);
	       ps.setInt(2, id);
	       ps.setString(1, name);
	       int i=0;
	       i=ps.executeUpdate();
	       if(i!=0)
	       {
	           System.out.println("Updated");
	       }else
	       {
	           System.out.println("Not Updated");
	       }
	       con.close();
	   }
	}
