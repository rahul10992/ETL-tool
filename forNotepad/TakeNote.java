package forNotepad;
import java.io.*;
import java.sql.*;
public class TakeNote {
	public static void main(String[] args) {
		String lname="",fname="",dname="",sql="";
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("Jdbc:Odbc:dbtProj");
			Statement st=con.createStatement();
			BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
			String marker="";
			do{
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
					sql="insert into Employee values ('"+fname+"','"+lname+"','"+dname+"');";
					System.out.println(sql);
					st.executeUpdate(sql);
				}	
			}while(true);		
			br.close();
			}
			catch(IOException e){
			e.printStackTrace();
		}
			catch(NullPointerException e){
				System.out.println("null");
				e.printStackTrace();
			}
			catch(ClassNotFoundException e){
				e.printStackTrace();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			catch(Exception e){
				System.out.println("You were not supposed to reach here dude!!");
				e.printStackTrace();
			}
		}
	}

