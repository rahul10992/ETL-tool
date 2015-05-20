package mdbTomdb;
import java.sql.*;
public class MdbTransfer {
	public static void main(String[] args) {
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con1=DriverManager.getConnection("Jdbc:Odbc:dbtProjInMdb");
			Connection con2=DriverManager.getConnection("Jdbc:Odbc:dbtProj");
			Statement st1=con1.createStatement();
			Statement st2=con2.createStatement();
			String sql1="select * from Initial",sql2="",fname="",lname="",dname="";
			ResultSet rs=st1.executeQuery(sql1);
			while(rs.next()){
				fname=rs.getString(1);
				lname=rs.getString(2);
				dname=rs.getString(3);
				sql2="insert into Employee values ('"+fname+"','"+lname+"','"+dname+"');";
				System.out.println(sql2);
				st2.executeUpdate(sql2);
			}		
		}catch(ClassNotFoundException e){e.printStackTrace();}
		catch(SQLException e){e.printStackTrace();}
	}
}



