package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Inserting_Multiple_Rows_Into_Student_Table
{
    public void multipleLines()
    {
    	Scanner s=new Scanner(System.in);
    	String name=null,gender=null,city=null;
    	int marks=0;
    	String sql=null;
    	try {
			Class.forName("org.h2.Driver");
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","karthik","Karthik@04");
			Statement st=con.createStatement();
			System.out.println("how many rows do you want to insert");
			int n=s.nextInt();
			int i=1;
			while(i<=n)
			{
				System.out.println("enter name");
				name=s.nextLine();
				System.out.println("enter marks");
				marks=s.nextInt();
				System.out.println("enter gender");
				gender=s.nextLine();
				System.out.println("enter city");
				city=s.nextLine();
				sql="insert into student values('"+name+"','"+marks+"','"+gender+"','"+city+"')";
				st.executeUpdate(sql);
				System.out.println("row inserted");
				i++;
			}
			con.close();
		}
    	catch (ClassNotFoundException | SQLException  e)
    	{
			System.out.println(e);
		}
    }
	public static void main(String[] args)
	{
       Inserting_Multiple_Rows_Into_Student_Table m=new Inserting_Multiple_Rows_Into_Student_Table();
       m.multipleLines();
	}

}
