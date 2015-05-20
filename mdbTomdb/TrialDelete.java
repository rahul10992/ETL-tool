package mdbTomdb;
import java.sql.*;
public class TrialDelete {
	public static void main(String[] args) {
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("Jdbc:Odbc:dbtProj");
			Statement st1=con.createStatement();
			System.out.println("hhdhdhdhdhdh");
			System.out.println(st1.executeUpdate("delete from employee"));
			con.commit();
			con.close();
			st1.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
