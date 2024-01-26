package com.Presentation;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.Dao.Product;
import com.Services.ManageProducts;

public class FormAddProduct extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
 
	//Create lebeles
	JLabel lblDesignation , lblUnitPrice , lblQuantity , lblError;
	//Create Fields:
	JTextField fldDesignation , fldUnitPrice , fldQuantity;
	//Create Buttons
	JButton btnAdd;
	//Create the pannel
	JPanel panel;
	ManageProducts manageProduct;
	
	
	public FormAddProduct()
			throws HeadlessException {
		super();
		lblDesignation = new JLabel("Designation");
		lblUnitPrice = new JLabel("Unit Price");
		lblQuantity = new JLabel("Quantity") ;
		lblError = new JLabel("");
		
		fldDesignation = new JTextField("");
		fldUnitPrice = new JTextField("");
		fldQuantity = new JTextField("");
		panel = new JPanel();
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(this);   
		
		panel.setLayout(new GridLayout(4,2,5,5));
		panel.add(lblDesignation);
		panel.add(fldDesignation);
		panel.add(lblUnitPrice);
		panel.add(fldUnitPrice);
		panel.add(lblQuantity);
		panel.add(fldQuantity);
		panel.add(btnAdd); 
		panel.add(lblError);   
		
		this.add(panel);
		
		manageProduct = new ManageProducts();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(fldQuantity.getText().isEmpty() || fldDesignation.getText().isEmpty() || fldUnitPrice.getText().isEmpty())
		{
			lblError.setText("Enter fill in All Fields");
		}
		else
		{
			String designation = fldDesignation.getText();
			double unitPrice = Double.parseDouble(fldUnitPrice.getText());
			int qauntity = Integer.parseInt(fldQuantity.getText());
			Product product = new Product(designation, unitPrice, qauntity);
			
			try {
				manageProduct.AddProducts(product);
				lblError.setText("Product Added successfuly !");
				manageProduct.GetProducts().stream().forEach(System.out::println);
			}
			catch(Exception ex)
			{
				ex.getStackTrace();
				lblError.setText("Error of Insertion");
			}
		}
	}
	
	
	
	
	
}
