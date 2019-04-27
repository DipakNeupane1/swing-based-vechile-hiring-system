package com.student.vechilehiring.view;


import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.student.vechilehiring.dao.StaffsDao;
import com.student.vechilehiring.dao.StaffsDaoImpl;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class StaffLoginForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField staffUsernameTxtBox;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffLoginForm frame = new StaffLoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StaffLoginForm() {
		setTitle("Staffs Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(553, 370);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Staffs Login Form",
				TitledBorder.CENTER, TitledBorder.TOP,new Font(null, Font.BOLD, 14), Color.BLUE));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(130, 91, 70, 14);
		contentPane.add(lblNewLabel);
		
		staffUsernameTxtBox = new JTextField();
		staffUsernameTxtBox.setBounds(232, 89, 139, 20);
		contentPane.add(staffUsernameTxtBox);
		staffUsernameTxtBox.setColumns(10);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setForeground(Color.BLUE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setBounds(130, 144, 70, 14);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String staffName=staffUsernameTxtBox.getText();
				String password=new String(passwordField.getPassword());
				StaffsDao staffsDao=new StaffsDaoImpl();
				int logged=staffsDao.login(staffName, password);
				if(logged>=1) {
					JOptionPane.showMessageDialog(StaffLoginForm.this,"You are successfully login","SUCCESS!!!",JOptionPane.PLAIN_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(StaffLoginForm.this,"Incorrect UserName or Password","INCORRECT!!!",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(244, 204, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Are you customer?then login into customer account ");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(158, 249, 336, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Click Here");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new CustomerLoginForm().setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(232, 274, 127, 23);
		contentPane.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(232, 142, 139, 20);
		contentPane.add(passwordField);
	}
}
