package com.Services;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.Dao.Product;

public class ManageProducts {
       
	ArrayList<Product> list;
    ObjectInputStream in;
    ObjectOutputStream out;
    
	public ManageProducts() {
		super();
		list = new ArrayList<Product>();
	}
    
    //CRUD Services:
	
	public void AddProducts(Product product) throws FileNotFoundException, IOException
	{
		list.add(product);
		
		out = new ObjectOutputStream(new FileOutputStream(new File("Product.txt")));
		
		out .writeObject(product);
		out.close();
	}
	
	public ArrayList<Product> GetProducts() throws Exception {
		
		in = new ObjectInputStream(new FileInputStream(new File("Product.txt")));
		
		while(in.available() > 0)
		{
			list.add((Product)in.readObject());
		}
		in.close();
		return list;
		
	}
        
	
}
