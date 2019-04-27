package com.student.vechilehiring.view;


import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import com.student.vechilehiring.dao.StaffsDao;
import com.student.vechilehiring.dao.StaffsDaoImpl;
import com.student.vechilehiring.dto.Staffs;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StaffSignUpForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nametextField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffSignUpForm frame = new StaffSignUpForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StaffSignUpForm() {
		setTitle("Staffs Signup Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(526, 341);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 2, true), "Staffs Signup Form",
				TitledBorder.CENTER, TitledBorder.TOP,new Font(null, Font.BOLD, 12), null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLbl = new JLabel("Name");
		nameLbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		nameLbl.setForeground(Color.BLUE);
		nameLbl.setBounds(84, 91, 67, 14);
		contentPane.add(nameLbl);
		
		JLabel passwordLbl = new JLabel("Password");
		passwordLbl.setForeground(Color.BLUE);
		passwordLbl.setFont(new Font("Tahoma", Font.BOLD, 13));
		passwordLbl.setBounds(84, 135, 67, 14);
		contentPane.add(passwordLbl);
		
		nametextField = new JTextField();
		nametextField.setBounds(204, 89,143,20);
		contentPane.add(nametextField);
		nametextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(204, 133, 143, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StaffsDao staffsDao=new StaffsDaoImpl();
				Staffs staffs=new Staffs();
				staffs.setStaffName(nametextField.getText());
				staffs.setPassword(new String(passwordField.getPassword()));
				int register=staffsDao.registerStaffInfo(staffs);
				if(register>=1) {
					JOptionPane.showMessageDialog(null,"new staff is registered!!!","Register!!!",JOptionPane.PLAIN_MESSAGE);
					new StaffLoginForm().setVisible(true);
					dispose();
				}
				else{
					JOptionPane.showMessageDialog(null,"Error In database!!!!","Error!!",JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(216, 212, 89, 23);
		contentPane.add(btnNewButton);
	}
}
