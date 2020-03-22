package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class jdbc 
{
    public void connect()
    {
    	try
    	{
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","KARTHIK","Karthik@04");
			if(con!=null)
			{
				System.out.println("connection established");
			}
			else
			{
				System.out.println("error occured while connecting");
			}
			con.close();
		}
    	catch(ClassNotFoundException | SQLException e)
    	{
    		System.out.println(e);
    	}
    }
	public static void main(String[] args)
	{
         jdbc j=new jdbc();
         j.connect();
	}
}
