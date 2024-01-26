package com.Presentation;

import javax.swing.JFrame;

public class View {

	public static void main(String[] args) {

		FormLogin form = new FormLogin();
		
	    form.setTitle("Login Page");
	    form.setBounds(200, 200, 300, 150);
	    form.setVisible(true);
	    form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}   
