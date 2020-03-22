package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Inserting_data {
    public void insert()
    {
    	try 
    	{
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","karthik","Karthik@04");
			Statement st=con.createStatement();
			String sql="insert into student values('karthik',99,'male','hyd')";
			int i=st.executeUpdate(sql);
			if(i>0)
			System.out.println("data inserted");
			else
				System.out.println("error");
		} 
    	catch (ClassNotFoundException e) 
    	{
			e.printStackTrace();
		} 
    	catch (SQLException e)
    	{
			e.printStackTrace();
		}
    	
    }
	public static void main(String[] args) 
	{
        Inserting_data i=new Inserting_data();
        i.insert();
	}
}
