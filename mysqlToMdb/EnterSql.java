package mysqlToMdb;
import java.io.*;
import java.sql.*;
public class EnterSql {
	public static void main(String[] args) {
		String lname="",fname="",dname="",sql="";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtProject","root","abcde");
			Statement st=con.createStatement();
			String marker="";
			BufferedReader br=new BufferedReader(new FileReader("file3.txt"));
			do{
				marker="";
				marker=br.readLine();
				if(marker==null)
					break;
				System.out.println(marker);
			    if(marker.charAt(0)=='f')
					fname=marker.substring(6);
				if(marker.charAt(0)=='l')
					lname=marker.substring(6);
				if(marker.charAt(0)=='d')
					dname=marker.substring(6);
				if(marker.charAt(0)=='='){
					sql="insert into rahul values ('"+fname+"','"+lname+"','"+dname+"');";
					System.out.println(sql);
					st.executeUpdate(sql);
				}	
			}while(true);
		}
		catch(SQLException e){e.printStackTrace();}
		catch(IOException e){e.printStackTrace();}
		catch(ClassNotFoundException e){e.printStackTrace();}
	}
}
