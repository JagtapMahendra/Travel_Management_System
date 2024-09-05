package Travel_Management;

import java.sql.*;

public class Conn
{

	Connection c;
	Statement s;
	
	public Conn()
	{
		try
		{
			Class.forName("org.postgresql.Driver");
		    c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/travel_tourism_management","postgres","root");
		    s=c.createStatement();
			
			System.out.println("Connection established");
			
			
			c.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
