package com.Dao;


//Serializable to convert Object into an octet Flux to be able to stock it into Folders and Files as Data
import java.io.Serializable;

public class Product implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private static int counter=1;
	private String designation;
	private double priceUnit;
	private int quantity;
	
	public Product() {
		super();
		this.id = counter++;
	}

	public Product(String designation, double priceUnit, int quantity) {
		super();
		this.id = counter++;
		this.designation = designation;
		this.priceUnit = priceUnit;
		this.quantity = quantity;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Product.counter = counter;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPriceUnit() {
		return priceUnit;
	}

	public void setPriceUnit(double priceUnit) {
		this.priceUnit = priceUnit;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", designation=" + designation + ", priceUnit=" + priceUnit + ", quantity="
				+ quantity + "]";
	}
	
	

}
