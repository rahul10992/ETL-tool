package mysqlToMdb;
import java.sql.*;
public class Transfer {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtProject","root","abcde");
			Statement st1=con1.createStatement();
			ResultSet rs=st1.executeQuery("select * from rahul");
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con2=DriverManager.getConnection("Jdbc:Odbc:dbtProj");
			Statement st2=con2.createStatement();
			while(rs.next())
			{
				String fname=rs.getString(1);
				String lname=rs.getString(2);
				String dname=rs.getString(3);
			String sql2="insert into Employee values ('"+fname+"','"+lname+"','"+dname+"');";
			System.out.println(sql2);
			st2.executeUpdate(sql2);
			}
			rs.close();
			st1.close();
			st2.close();	
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
