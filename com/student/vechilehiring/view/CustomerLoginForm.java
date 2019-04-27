package com.student.vechilehiring.view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.border.TitledBorder;

import com.student.vechilehiring.dao.CustomersDao;
import com.student.vechilehiring.dao.CustomersDaoImpl;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerLoginForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField customerUserNameTxtBox;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerLoginForm frame = new CustomerLoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CustomerLoginForm() {
		setTitle("Customer Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(471, 333);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(255, 175, 175), 2, true), "Customer Login Form",
				TitledBorder.CENTER, TitledBorder.TOP,new Font(null, Font.BOLD, 14), Color.BLUE));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(110, 103, 70, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.BLUE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(110, 167, 70, 14);
		contentPane.add(lblPassword);
		
		customerUserNameTxtBox = new JTextField();
		customerUserNameTxtBox.setBounds(226, 101, 132, 20);
		contentPane.add(customerUserNameTxtBox);
		customerUserNameTxtBox.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(226, 165, 132, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String userName=customerUserNameTxtBox.getText();
				String password=new String(passwordField.getPassword());
				CustomersDao customersDao=new CustomersDaoImpl();
				int cid=customersDao.login(userName, password);
				if(cid>=1) {
					JOptionPane.showMessageDialog(CustomerLoginForm.this, "You are Successfully Logged in","SUCCESS!!!",JOptionPane.PLAIN_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(CustomerLoginForm.this,"Sorry UserName or Password Incorrect","ERROR!!!",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(192, 237, 89, 23);
		contentPane.add(btnNewButton);
	}

}
