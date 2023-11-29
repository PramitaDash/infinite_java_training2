package infinite.JDBCW;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserAuth {
	public static void main(String[] args) {
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  userName: ");
		user = sc.next();
		System.out.println("Enter Password:");
		pwd = sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinite_august23","root","root");
				String cmd = "select count(*) cnt from Login where userName=?" +"And Passcode=?";
				PreparedStatement pst = connection.prepareStatement(cmd);
				pst.setString(1, user);
				pst.setString(2, pwd);
				ResultSet rs = pst.executeQuery();
				rs.next();
				int count = rs.getInt("cnt");
				if(count==1) {
					System.err.println("Correct Credentials...");
				}else {
					System.err.println("Invalid Credential...");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
}
}
