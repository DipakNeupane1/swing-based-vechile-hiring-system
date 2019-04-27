package com.student.vechilehiring.view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.student.vechilehiring.dao.CarsDao;
import com.student.vechilehiring.dao.CarsDaoImpl;
import com.student.vechilehiring.dto.Cars;

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


public class AddCarForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField carMakeTxtBox;
	private JTextField carModelTxtBox;
	private JTextField carTopSpeedTxtBox;
	private JTextField carRegistrationNumTxtBox;
	private JTextField carHireRateTxtBox;
	private JTextField carNoOfDoorsTxtBox;
	private JRadioButton pRadioBtn;
	private JRadioButton dRadioBtn;
	private JRadioButton lRadioBtn;
	private JRadioButton unLRadioBtn;
	private JButton btnNewButton;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCarForm frame = new AddCarForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AddCarForm() {
		setTitle("Add Cars Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(472, 504);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(255, 200, 0), 2, true), "Add Cars Form",
				TitledBorder.CENTER, TitledBorder.TOP,new Font(null, Font.BOLD,14), Color.BLUE));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Make");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(68, 86, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setForeground(Color.BLUE);
		lblModel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblModel.setBounds(68, 122, 46, 14);
		contentPane.add(lblModel);
		
		JLabel lblTopSpeed = new JLabel("Top Speed Km/Ph");
		lblTopSpeed.setForeground(Color.BLUE);
		lblTopSpeed.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTopSpeed.setBounds(68, 161, 118, 14);
		contentPane.add(lblTopSpeed);
		
		JLabel lblRegistrationNumber = new JLabel("Registration Number");
		lblRegistrationNumber.setForeground(Color.BLUE);
		lblRegistrationNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRegistrationNumber.setBounds(68, 199, 118, 14);
		contentPane.add(lblRegistrationNumber);
		
		JLabel lblHireRate = new JLabel("Hire Rate");
		lblHireRate.setForeground(Color.BLUE);
		lblHireRate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHireRate.setBounds(68, 235, 72, 14);
		contentPane.add(lblHireRate);
		
		JLabel lblNoOfDoors = new JLabel("No Of Doors");
		lblNoOfDoors.setForeground(Color.BLUE);
		lblNoOfDoors.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNoOfDoors.setBounds(68, 274, 93, 14);
		contentPane.add(lblNoOfDoors);
		
		JLabel lblFuelType = new JLabel("Fuel Type");
		lblFuelType.setForeground(Color.BLUE);
		lblFuelType.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFuelType.setBounds(68, 309, 72, 14);
		contentPane.add(lblFuelType);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setForeground(Color.BLUE);
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStatus.setBounds(68, 345, 46, 14);
		contentPane.add(lblStatus);
		
		carMakeTxtBox = new JTextField();
		carMakeTxtBox.setBounds(213, 84, 170, 20);
		contentPane.add(carMakeTxtBox);
		carMakeTxtBox.setColumns(10);
		
		carModelTxtBox = new JTextField();
		carModelTxtBox.setBounds(213, 120, 170, 20);
		contentPane.add(carModelTxtBox);
		carModelTxtBox.setColumns(10);
		
		carTopSpeedTxtBox = new JTextField();
		carTopSpeedTxtBox.setBounds(213, 159, 170, 20);
		contentPane.add(carTopSpeedTxtBox);
		carTopSpeedTxtBox.setColumns(10);
		
		carRegistrationNumTxtBox = new JTextField();
		carRegistrationNumTxtBox.setBounds(213, 197, 170, 20);
		contentPane.add(carRegistrationNumTxtBox);
		carRegistrationNumTxtBox.setColumns(10);
		
		carHireRateTxtBox = new JTextField();
		carHireRateTxtBox.setBounds(213, 233, 170, 20);
		contentPane.add(carHireRateTxtBox);
		carHireRateTxtBox.setColumns(10);
		
		carNoOfDoorsTxtBox = new JTextField();
		carNoOfDoorsTxtBox.setBounds(213, 272, 170, 20);
		contentPane.add(carNoOfDoorsTxtBox);
		carNoOfDoorsTxtBox.setColumns(10);
		
		pRadioBtn = new JRadioButton("Petrol");
		pRadioBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pRadioBtn.setForeground(Color.BLUE);
		pRadioBtn.setBounds(214, 306, 75, 23);
		contentPane.add(pRadioBtn);
		
		dRadioBtn = new JRadioButton("Diesel");
		dRadioBtn.setForeground(Color.BLUE);
		dRadioBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		dRadioBtn.setBounds(298, 306, 64, 23);
		contentPane.add(dRadioBtn);
		
	    lRadioBtn = new JRadioButton("Loan");
		lRadioBtn.setForeground(Color.BLUE);
		lRadioBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lRadioBtn.setBounds(213, 342, 54, 23);
		contentPane.add(lRadioBtn);
		
		unLRadioBtn = new JRadioButton("UnLoan");
		unLRadioBtn.setForeground(Color.BLUE);
		unLRadioBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		unLRadioBtn.setBounds(285, 342, 72, 23);
		contentPane.add(unLRadioBtn);
		
		ButtonGroup Group=new ButtonGroup();
		Group.add(pRadioBtn);
		Group.add(dRadioBtn);
		
		ButtonGroup buttonGroup=new ButtonGroup();
		buttonGroup.add(lRadioBtn);
		buttonGroup.add(unLRadioBtn);
		
		btnNewButton = new JButton("Add Car");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cars cars=new Cars();
				cars.setMake(carMakeTxtBox.getText());
				cars.setModel(new String(carModelTxtBox.getText()));
				cars.setTopSpeed(new String(carTopSpeedTxtBox.getText()));
				cars.setRegistrationNumber(Integer.parseInt(carRegistrationNumTxtBox.getText()));
	cars.setHireRate(new String(carHireRateTxtBox.getText()));
	cars.setNoOfDoors(Integer.parseInt(carNoOfDoorsTxtBox.getText()));
	//for radio buttons
	if(pRadioBtn.isSelected()) {
		cars.setFuelType("Petrol");
	}
	else {
		cars.setFuelType("Deisel");
	}
	if(lRadioBtn.isSelected()) {
		cars.setStatus("Loan");
	}
	else {
		cars.setStatus("Unloan");
	}
	CarsDao carsDao=new CarsDaoImpl();
	int carid=carsDao.createCars(cars);
			if(carid>=1) {
				JOptionPane.showMessageDialog(AddCarForm.this,"Successfully Added new car","Added",JOptionPane.PLAIN_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(AddCarForm.this,"Error in Set Datatype","ERROR!!!",JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(213, 400, 89, 23);
		contentPane.add(btnNewButton);
	}
}
