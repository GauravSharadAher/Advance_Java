import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Demo {

	public static void main(String[] args) {
		// step 1 register the driver
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://192.168.10.150:3306/dac34";
			Connection conn=DriverManager.getConnection(url, "dac34", "welcome");
			
			if(conn!=null) {
				System.out.println("Connection Established");
			}else {
				System.out.println("Connection Failed");
			}
			
			Statement st = conn.createStatement();
			ResultSet rs=st.executeQuery("select * from emp ");
			while(rs.next()) {
				System.out.println( "Id " + rs.getInt(1));
				System.out.println("Name "+ rs.getString(2));
				System.out.println("Gender " + rs.getString(3));
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		
	}

}
