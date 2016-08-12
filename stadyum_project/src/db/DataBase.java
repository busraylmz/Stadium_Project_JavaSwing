package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase 
{
	
	  public Connection conn;
	   public void baglan()
	   {
		   try {
			   Class.forName("org.postgresql.Driver");
		    
		    	 
		    	 conn=DriverManager.getConnection(
		    		        "jdbc:postgresql://localhost:5432/stadyum","postgres","1993busra");
		    	
		    	 
		} catch (Exception e) {
			// TODO: handle exception
		}
	   }

}
