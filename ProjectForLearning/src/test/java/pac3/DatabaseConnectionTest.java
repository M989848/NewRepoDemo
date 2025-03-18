package pac3;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class DatabaseConnectionTest {
	@Test
	public void databaseTest() throws Throwable {
		Driver driverref= new Driver();
		DriverManager.registerDriver(driverref);
		Connection conn = DriverManager.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm", "root", "root");
		System.out.println("=== connection done====");
		Statement stat = conn.createStatement();
		
		 int update = stat.executeUpdate("insert into project values('TY_PROJ_2029','ASDF','18/03/2025','bbnmnbm1','created','200')");
		 System.out.println(update);
		 ResultSet result = stat.executeQuery("select * from project");
			while(result.next()) {
				System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4)+"\t"+result.getString(5)+"\t"+result.getString(6));
			}
		
		
	}
	

}
