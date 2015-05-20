package finalTransferToWarehouse;
import java.sql.*;
public class Transfer {
	public static void doStuff() {
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("Jdbc:Odbc:dbtProj");
			Statement st=con.createStatement();
			Statement st1=con.createStatement();
			ResultSet rsx=st.executeQuery("select * from Employee");
			while(rsx.next()){
				String fname=rsx.getString(1);
				String lname=rsx.getString(2);
				String dname=rsx.getString(3);
				if(dname.substring(0, 1).equalsIgnoreCase("i")){dname="information technology";}
				if(dname.substring(0, 1).equalsIgnoreCase("c")){dname="computer";}
				if(dname.substring(0, 1).equalsIgnoreCase("p")){dname="production";}
				if(dname.substring(0, 1).equalsIgnoreCase("b")){dname="biomedical";}
				if(dname.substring(0, 1).equalsIgnoreCase("e")){
					if(dname.substring(0, 2).equalsIgnoreCase("el")){dname="electronics";}
					else{dname="electronics and telecom";}	
				}
				String sql2="insert into finalWarehouse values ('"+fname+"','"+lname+"','"+dname+"');";
				System.out.println(sql2);
				st1.executeUpdate(sql2);
			}
			rsx.close();	
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		finally{	
		System.out.println("inserted stuff");}
	}
}
