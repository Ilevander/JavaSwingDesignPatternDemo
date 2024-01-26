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

public class FormLogin extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
 

	//Login Fields
	JTextField fldUser , fldPassword;
	//Login Fields:
	JLabel lblUser , lblPassword;
	JLabel lblError;
	//Create Buttons
	JButton btnCnx;
	//Create the pannel
	JPanel panel;
	
	
	public FormLogin()
			throws HeadlessException {
		super();
		lblUser = new JLabel("Username :");
		lblPassword = new JLabel("Password :");
		lblError = new JLabel("");
		
		
		
		fldUser = new JTextField("");
		fldPassword = new JTextField("");
		panel = new JPanel();
		
		btnCnx = new JButton("Login");
		btnCnx.addActionListener(this);   
		
		panel.setLayout(new GridLayout(4,2,5,5));
		
		panel.add(lblUser);
		panel.add(fldUser);
		
		panel.add(lblPassword);
		panel.add(fldPassword);
		
		panel.add(btnCnx); 
		panel.add(lblError);
		
		this.add(panel);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(fldUser.getText().equals("admin") && fldPassword.getText().equals("admin"))
		{
			FormAddProduct form = new FormAddProduct();
			
		    form.setTitle("Add Products Page");
		    form.setBounds(200, 200, 400, 300);
		    form.setVisible(true);
		    form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else
		{
			lblError.setText("Error of Insertion");
		}
	}
	
	
	
	
	
}
