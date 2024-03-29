/*
 * Nicholas Murphy
 * D12124126
 * Product class contains all information on a givemn product
 */
package com.assignment.clothes;

import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public  class Product {
	
	private String type;
	private String name;
	private float price;
	public ImageIcon icon;
	public Product(String type,String name, float price,String imagepath){
		this.name = name;
		this.price = price;
		this.type = type;
		try
		{
			this.icon =new ImageIcon(this.getClass().getResource("/images/"+imagepath));
		}
		catch( NullPointerException e)
		{
			System.out.print(imagepath);
		}
		
	}
	
	public void setPrice(float price){
		
		this.price = price;
		
	}
	public float getPrice(){
		return price;
	}
	
	public void setName(String name){
		this.name = name;
		
	}
	public String getName(){
	
		return name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ImageIcon getIcon(){
	return icon;
	
	}
	
	

}
