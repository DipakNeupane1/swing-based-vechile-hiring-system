package com.student.vechilehiring.view;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.student.vechilehiring.dao.CustomersDao;
import com.student.vechilehiring.dao.CustomersDaoImpl;
import com.student.vechilehiring.dto.Customers;
import com.toedter.calendar.JDateChooser;

public class CreateCustomerForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField customerNameTxtBox;
	private JTextField customerAddTxtBox;
	private JTextField customerPhoneTxtBox;
	private JTextField customerEmailTxtBox;
	private JTextField customerUserNameTxtBox;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateCustomerForm frame = new CreateCustomerForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CreateCustomerForm() {
		setTitle("Customer Creation Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(554, 534);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 255), 2, true),
				"Create Customer Account", TitledBorder.CENTER, TitledBorder.TOP, new Font(null, Font.BOLD, 14), new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Name");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(104, 69, 109, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCustomer = new JLabel("Customer Phone No");
		lblCustomer.setForeground(Color.BLUE);
		lblCustomer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCustomer.setBounds(104, 165, 122, 14);
		contentPane.add(lblCustomer);
		
		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setForeground(Color.BLUE);
		lblEmailAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmailAddress.setBounds(104, 224, 109, 14);
		contentPane.add(lblEmailAddress);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setForeground(Color.BLUE);
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDateOfBirth.setBounds(104, 273, 109, 14);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblCustomerAddress = new JLabel("Customer Address");
		lblCustomerAddress.setForeground(Color.BLUE);
		lblCustomerAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCustomerAddress.setBounds(104, 116, 122, 14);
		contentPane.add(lblCustomerAddress);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setForeground(Color.BLUE);
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUserName.setBounds(104, 324, 109, 14);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.BLUE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(104, 367, 109, 14);
		contentPane.add(lblPassword);
		
		customerNameTxtBox = new JTextField();
		customerNameTxtBox.setBounds(286, 67, 128, 20);
		contentPane.add(customerNameTxtBox);
		customerNameTxtBox.setColumns(10);
		
		customerAddTxtBox = new JTextField();
		customerAddTxtBox.setBounds(286, 116, 128, 20);
		contentPane.add(customerAddTxtBox);
		customerAddTxtBox.setColumns(10);
		
		customerPhoneTxtBox = new JTextField();
		customerPhoneTxtBox.setBounds(286, 163, 128, 20);
		contentPane.add(customerPhoneTxtBox);
		customerPhoneTxtBox.setColumns(10);
		
		customerEmailTxtBox = new JTextField();
		customerEmailTxtBox.setBounds(286, 222, 128, 20);
		contentPane.add(customerEmailTxtBox);
		customerEmailTxtBox.setColumns(10);
		
		customerUserNameTxtBox = new JTextField();
		customerUserNameTxtBox.setBounds(286, 322, 128, 20);
		contentPane.add(customerUserNameTxtBox);
		customerUserNameTxtBox.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(286, 365, 128, 20);
		contentPane.add(passwordField);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(286, 279, 128, 20);
		contentPane.add(dateChooser);
		
		JButton btnNewButton = new JButton("Create Customer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Customers customers=new Customers();
				customers.setName(customerNameTxtBox.getText());
				customers.setAddress(customerAddTxtBox.getText());
				customers.setEmail(customerEmailTxtBox.getText());
				customers.setPhoneNo(customerPhoneTxtBox.getText());
				customers.setDob(dateChooser.getDate());
				customers.setUserName(customerUserNameTxtBox.getText());
				customers.setPassword(new String(passwordField.getPassword()));
				CustomersDao customersDao=new CustomersDaoImpl();
			int cid=customersDao.createCustomer(customers);
				if(cid>=1) {
					JOptionPane.showMessageDialog(CreateCustomerForm.this,"Customer Account Created","Created!!!",JOptionPane.PLAIN_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(CreateCustomerForm.this,"Sorry Could Not Proceed","Sorry!!!",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(231, 441, 155, 23);
		contentPane.add(btnNewButton);
	}
}
