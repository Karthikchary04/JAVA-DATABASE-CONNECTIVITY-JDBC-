package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Retriving_data_from_table
{
    public void retriving()
    {
    	try
    	{
    	Class.forName("org.h2.Driver");
    	Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","karthik","Karthik@04");
    	Statement st=con.createStatement();
    	String sql="select * from student";
    	ResultSet str=st.executeQuery(sql);
    	while(str.next())
    	{
    		String name = str.getString("name");
            int marks = str.getInt("marks");
            String gender = str.getString("gender");
            String city = str.getString("city");
            System.out.print("name:" +name+"  ");
            System.out.print("marks:" +marks+"  ");
            System.out.print("gender:" +gender+"  ");
            System.out.println("city:" +city+"  ");
         }
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
	public static void main(String[] args) 
	{
       Retriving_data_from_table r=new Retriving_data_from_table();
       r.retriving();
	}

}
