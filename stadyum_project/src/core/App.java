package core;

import java.sql.SQLException;

public class App 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	     Test test=new Test();
	     String[] liste=test.Listele("takim1_id");
	     String[] liste2=test.Listele("takim2_id");
	    

			for(int i=0;i<liste.length;i++)
			{
			     System.out.println(liste[i]+" VS "+liste2[i]);
			}
				
			
	}

}
