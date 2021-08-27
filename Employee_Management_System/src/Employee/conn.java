package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {

	public Connection c;
	public Statement s;

	public conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "4567");
			s = c.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	public static void main(String[] args) {
//		conn c = new conn();
//	}
}
