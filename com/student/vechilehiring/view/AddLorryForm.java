package com.student.vechilehiring.view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.student.vechilehiring.dao.LorryDao;
import com.student.vechilehiring.dao.LorryDaoImpl;
import com.student.vechilehiring.dto.Lorry;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddLorryForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField lorryMakeTxtBox;
	private JTextField lorryModelTxtBox;
	private JTextField lorryTopSpeedTxtBox;
	private JTextField lorryRegistrationNumber;
	private JTextField lorryHireRateTxtBox;
	private JTextField lorryLCapacityTxtBox;
	private JRadioButton lorryLRadioBtn;
	private JRadioButton lorryUnlRadioBtn;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddLorryForm frame = new AddLorryForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AddLorryForm() {
		setTitle("Add Lorry Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(482, 489);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(255, 200, 0), 2, true), "Add Lorry Form",
				TitledBorder.CENTER, TitledBorder.TOP, new Font(null, Font.BOLD,14), Color.BLUE));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Make");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(64, 84, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setForeground(Color.BLUE);
		lblModel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblModel.setBounds(64, 127, 46, 14);
		contentPane.add(lblModel);
		
		JLabel lblTopSpeedKmph = new JLabel("Top Speed Km/Ph");
		lblTopSpeedKmph.setForeground(Color.BLUE);
		lblTopSpeedKmph.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTopSpeedKmph.setBounds(64, 164, 101, 14);
		contentPane.add(lblTopSpeedKmph);
		
		JLabel lblRegistrationNumber = new JLabel("Registration Number");
		lblRegistrationNumber.setForeground(Color.BLUE);
		lblRegistrationNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRegistrationNumber.setBounds(64, 204, 111, 14);
		contentPane.add(lblRegistrationNumber);
		
		JLabel lblHireRate = new JLabel("Hire Rate");
		lblHireRate.setForeground(Color.BLUE);
		lblHireRate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHireRate.setBounds(64, 252, 69, 14);
		contentPane.add(lblHireRate);
		
		JLabel lblLoadingCapacity = new JLabel("Loading Capacity in Ton");
		lblLoadingCapacity.setForeground(Color.BLUE);
		lblLoadingCapacity.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLoadingCapacity.setBounds(64, 296, 130, 14);
		contentPane.add(lblLoadingCapacity);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setForeground(Color.BLUE);
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStatus.setBounds(64, 342, 46, 14);
		contentPane.add(lblStatus);
		
		lorryMakeTxtBox = new JTextField();
		lorryMakeTxtBox.setBounds(239, 82, 144, 20);
		contentPane.add(lorryMakeTxtBox);
		lorryMakeTxtBox.setColumns(10);
		
		lorryModelTxtBox = new JTextField();
		lorryModelTxtBox.setBounds(239, 125, 144, 20);
		contentPane.add(lorryModelTxtBox);
		lorryModelTxtBox.setColumns(10);
		
		lorryTopSpeedTxtBox = new JTextField();
		lorryTopSpeedTxtBox.setBounds(239, 162, 144, 20);
		contentPane.add(lorryTopSpeedTxtBox);
		lorryTopSpeedTxtBox.setColumns(10);
		
		lorryRegistrationNumber = new JTextField();
		lorryRegistrationNumber.setBounds(239, 202, 144, 20);
		contentPane.add(lorryRegistrationNumber);
		lorryRegistrationNumber.setColumns(10);
		
		lorryHireRateTxtBox = new JTextField();
		lorryHireRateTxtBox.setBounds(239, 250, 144, 20);
		contentPane.add(lorryHireRateTxtBox);
		lorryHireRateTxtBox.setColumns(10);
		
		lorryLCapacityTxtBox = new JTextField();
		lorryLCapacityTxtBox.setBounds(239, 294, 144, 20);
		contentPane.add(lorryLCapacityTxtBox);
		lorryLCapacityTxtBox.setColumns(10);
		
		lorryLRadioBtn = new JRadioButton("Loan");
		lorryLRadioBtn.setForeground(Color.BLUE);
		lorryLRadioBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lorryLRadioBtn.setBounds(239, 338, 69, 23);
		contentPane.add(lorryLRadioBtn);
		
	    lorryUnlRadioBtn = new JRadioButton("Unloan");
		lorryUnlRadioBtn.setForeground(Color.BLUE);
		lorryUnlRadioBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lorryUnlRadioBtn.setBounds(326, 338, 69, 23);
		contentPane.add(lorryUnlRadioBtn);
		
		ButtonGroup group=new ButtonGroup();
		group.add(lorryLRadioBtn);
		group.add(lorryUnlRadioBtn);
		
		JButton btnNewButton = new JButton("Add Lorry");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lorry lorry=new Lorry();
				lorry.setMake(lorryMakeTxtBox.getText());
				lorry.setModel(new String(lorryModelTxtBox.getText()));
				lorry.setTopSpeed(new String(lorryTopSpeedTxtBox.getText()));
				lorry.setRegistrationNumber(Integer.parseInt(lorryRegistrationNumber.getText()));
				lorry.setHireRate(new String(lorryHireRateTxtBox.getText()));
				lorry.setLoadCapacity(new String(lorryLCapacityTxtBox.getText()));
				//for radio buttons
				if(lorryLRadioBtn.isSelected()) {
					lorry.setStatus("Loan");
				}
				else {
					lorry.setStatus("Unloan");
				}
				LorryDao lorryDao=new LorryDaoImpl();
				int lid=lorryDao.createLorry(lorry);
				if(lid>=1) {
					JOptionPane.showMessageDialog(AddLorryForm.this,"Successfully Added New Lorry","Added!!!",JOptionPane.PLAIN_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(AddLorryForm.this,"Error in Set Data","Error!!!",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(184, 399, 111, 23);
		contentPane.add(btnNewButton);
	}
}
