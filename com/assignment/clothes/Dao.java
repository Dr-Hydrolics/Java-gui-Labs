/*
 * Nicholas Murphy
 * D12124126
 * Data Access Object Designed to Access the database
 */
package com.assignment.clothes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Dao {
	//Define Connection
	Connection connection;
	
	
	//Constructor
	public Dao(){
		//initilise connection
	
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try
		{
			connection = DriverManager.getConnection("jdbc:odbc:MS Access Database;DBQ=src/ProductList.accdb");
			//C:\Windows\SysWOW64\odbcad32.exe    - add MS Access Database
		}
		catch (Exception exx)
		{
			System.out.println("The connection is not got: "+exx.getMessage());
		}
		
	
	
	
	
	}
	
	public ArrayList<Product> getAllProducts(){
		
		 
		ArrayList<Product> allProducts = new ArrayList<Product>(30);
		//create sql querie
		String sql = "SELECT * from Products";
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		try {
			//copy information to array
			while (rs.next())
			{
				allProducts.add(new Product(rs.getString("type"), rs.getString("Name"), rs.getFloat("Price"), rs.getString("Imagepath")));
				//System.out.print(rs.getString("type"));
				
			}
		} 
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	
	
	
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Nothing to close"+e.getMessage());
			e.printStackTrace();
		}
		return allProducts;
		
		
	}

}
