
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SubmitDao {
	
	public String insert(Data Data) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/pltest","root","7558");
		
		String result = null;
		
		String q = "Insert into office value(?,?,?,?)";
		
		try {
			PreparedStatement ps = c.prepareStatement(q);
			ps.setString(1, Data.getName());
			ps.setString(2, Data.getAge());
			ps.setString(3, Data.getNumber());
			ps.setString(4, Data.getMailid());
			ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
			result = "Data not enter";
		} 
		return result;
	}

}
