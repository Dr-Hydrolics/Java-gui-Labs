/*
 * Nicholas Murphy
 * D12124126
 * Product manager Buisness logic class which decides which products to display
 */
package com.assignment.clothes;

import java.util.ArrayList;
import java.util.Random;

public class ProductManager {
	
	private ArrayList<Product> hatList = new ArrayList<Product>();
	private ArrayList<Product> topList = new ArrayList<Product>();
	private ArrayList<Product> bottomsList = new ArrayList<Product>();
	private ArrayList<Product> glovesList = new ArrayList<Product>();
	private ArrayList<Product> bootsList = new ArrayList<Product>();
	private Random rand  = new Random();
	private double hatMin= Integer.MAX_VALUE,bootMin=Integer.MAX_VALUE,gloveMin=Integer.MAX_VALUE,topMin=Integer.MAX_VALUE,bottomMin=Integer.MAX_VALUE;
	private double minValue;
	
	public ProductManager(){
		Dao d = new Dao();
		setArrays(d.getAllProducts());

		
	}
	
	
	public void setArrays( ArrayList<Product> array){
		
		for(Product p : array){
		
			if (p.getType().equals("hat")){
			hatList.add(p);
			if (p.getPrice()<hatMin)
				hatMin=p.getPrice();
			}	
			else if (p.getType().equals("top")){
			topList.add(p);
			if (p.getPrice()<topMin)
				topMin=p.getPrice();
			
			}
			else if (p.getType().equals("bottoms")){
			bottomsList.add(p);
			if (p.getPrice()<bottomMin)
				bottomMin=p.getPrice();
			}
			else if (p.getType().equals("gloves")){
			glovesList.add(p);
			if (p.getPrice()<gloveMin)
				gloveMin=p.getPrice();
			}
			else if (p.getType().equals("boots")){
			bootsList.add(p);
			if (p.getPrice()<bootMin)
				bootMin=p.getPrice();
			}
			
			
		}
		setMinValue(hatMin+topMin+bottomMin+gloveMin+bootMin);
	}
	
	public Product randomHat(){
		int r = rand.nextInt(hatList.size());
		return hatList.get(r);
		
	}
	public Product randomtop(){
		int r = rand.nextInt(topList.size());
		return topList.get(r);
		
	}
	public Product randombottoms(){
		int r = rand.nextInt(bottomsList.size());
		return bottomsList.get(r);
		
	}
	public Product randomgloves(){
		int r = rand.nextInt(glovesList.size());
		return glovesList.get(r);
		
	}
	public Product randomboots(){
		int r = rand.nextInt(bootsList.size());
		return bootsList.get(r);
		
	}


	public double getMinValue() {
		return minValue;
	}


	public void setMinValue(double minValue) {
		this.minValue = minValue;
	}
		
}
