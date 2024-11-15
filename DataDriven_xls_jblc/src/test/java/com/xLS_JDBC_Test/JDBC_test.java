package com.xLS_JDBC_Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_test {
	
	public static void jdbc () throws Exception {
		//STEP 1. Import required packages declare variables jdbc driver, db url, userName , password  :
		
		//JDBC DriverName and URl
		
		final String jdbc_Driver = "com.sql.my.driver.jdbc_database";
		
		final String db_URL = "DataBase_Url";
		
		//database credential:
		
		final String userName = "userName_toConnectToTheDataBase";
		
		final String pass= "pass";
		
		//STEP 2: Register JDBC driver:
		
		Class.forName(jdbc_Driver);
		
		//Step 3 : open a connection to the database:
		
		
		Connection con = DriverManager.getConnection(db_URL, userName, pass);
		
		
	      //STEP 4: Execute a query

		Statement stmt= con.createStatement();
		
		String sql;
		
	      sql = "SELECT id, first, last, age FROM Employees";
	      
	    ResultSet rs = stmt.executeQuery(sql);
	      //STEP 5: Extract data from result set: 
	    
	    while (rs.next()) {
	    	
	    	int id  = rs.getInt("id");
	         int age = rs.getInt("age");
	         String first = rs.getString("first");
	         String last = rs.getString("last");
	         

	         //Display values
	         System.out.print("ID: " + id);
	         System.out.print(", Age: " + age);
	         System.out.print(", First: " + first);
	         System.out.println(", Last: " + last);
	    	
	    }
	    
	    //STEP 6: Clean-up environment
	      rs.close();
	      stmt.close();
	      con.close();
	      

		

		
		
	}

}
