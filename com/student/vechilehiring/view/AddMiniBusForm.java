package com.student.vechilehiring.view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.student.vechilehiring.dao.MiniBusesDao;
import com.student.vechilehiring.dao.MiniBusesDaoImpl;
import com.student.vechilehiring.dto.MiniBuses;

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

public class AddMiniBusForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField busMakeTxtBox;
	private JTextField busModelTxtBox;
	private JTextField busTopSpeedTxtBox;
	private JTextField busRegistrationNumTxtBox;
	private JTextField busHireRateTxtBox;
	private JTextField busNoOfSeatsTxtBox;
private JRadioButton lRadioBtnBus;
private JRadioButton ulRadioBtnBus;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMiniBusForm frame = new AddMiniBusForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AddMiniBusForm() {
		setTitle("Add Mini_Bus Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(483, 494);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(255, 200, 0), 2, true), "Add Mini Bus Form",
				TitledBorder.CENTER, TitledBorder.TOP, new Font(null, Font.BOLD,14), Color.BLUE));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Make");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(61, 76, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setForeground(Color.BLUE);
		lblModel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblModel.setBounds(61, 112, 46, 14);
		contentPane.add(lblModel);
		
		JLabel lblTopSpeed = new JLabel("Top Speed Km/Ph");
		lblTopSpeed.setForeground(Color.BLUE);
		lblTopSpeed.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTopSpeed.setBounds(61, 154, 107, 14);
		contentPane.add(lblTopSpeed);
		
		JLabel lblRegistrationNumber = new JLabel("Registration Number");
		lblRegistrationNumber.setForeground(Color.BLUE);
		lblRegistrationNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRegistrationNumber.setBounds(61, 200, 119, 14);
		contentPane.add(lblRegistrationNumber);
		
		JLabel lblHireRate = new JLabel("Hire Rate");
		lblHireRate.setForeground(Color.BLUE);
		lblHireRate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHireRate.setBounds(61, 244, 62, 14);
		contentPane.add(lblHireRate);
		
		JLabel lblNoOfSeats = new JLabel("No of Seats");
		lblNoOfSeats.setForeground(Color.BLUE);
		lblNoOfSeats.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNoOfSeats.setBounds(61, 284, 76, 14);
		contentPane.add(lblNoOfSeats);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setForeground(Color.BLUE);
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStatus.setBounds(61, 322, 46, 14);
		contentPane.add(lblStatus);
		
		busMakeTxtBox = new JTextField();
		busMakeTxtBox.setBounds(203, 74, 147, 20);
		contentPane.add(busMakeTxtBox);
		busMakeTxtBox.setColumns(10);
		
		busModelTxtBox = new JTextField();
		busModelTxtBox.setBounds(203, 110, 147, 20);
		contentPane.add(busModelTxtBox);
		busModelTxtBox.setColumns(10);
		
		busTopSpeedTxtBox = new JTextField();
		busTopSpeedTxtBox.setBounds(203, 152, 147, 20);
		contentPane.add(busTopSpeedTxtBox);
		busTopSpeedTxtBox.setColumns(10);
		
		busRegistrationNumTxtBox = new JTextField();
		busRegistrationNumTxtBox.setBounds(203, 194, 147, 20);
		contentPane.add(busRegistrationNumTxtBox);
		busRegistrationNumTxtBox.setColumns(10);
		
		busHireRateTxtBox = new JTextField();
		busHireRateTxtBox.setBounds(203, 242, 147, 20);
		contentPane.add(busHireRateTxtBox);
		busHireRateTxtBox.setColumns(10);
		
		busNoOfSeatsTxtBox = new JTextField();
		busNoOfSeatsTxtBox.setBounds(203, 282, 147, 20);
		contentPane.add(busNoOfSeatsTxtBox);
		busNoOfSeatsTxtBox.setColumns(10);
		
	    lRadioBtnBus = new JRadioButton("Loan");
		lRadioBtnBus.setForeground(Color.BLUE);
		lRadioBtnBus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lRadioBtnBus.setBounds(203, 318, 65, 23);
		contentPane.add(lRadioBtnBus);
		
		ulRadioBtnBus = new JRadioButton("Unloan");
		ulRadioBtnBus.setForeground(Color.BLUE);
		ulRadioBtnBus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ulRadioBtnBus.setBounds(288, 318, 62, 23);
		contentPane.add(ulRadioBtnBus);
		
		ButtonGroup group=new ButtonGroup();
		group.add(lRadioBtnBus);
		group.add(ulRadioBtnBus);
		
		JButton btnNewButton = new JButton("Add Bus");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MiniBuses buses=new MiniBuses();
				buses.setMake(busMakeTxtBox.getText());
				buses.setModel(new String(busModelTxtBox.getText()));
				buses.setTopSpeed(new String(busTopSpeedTxtBox.getText()));
				buses.setRegistrationNumber(Integer.parseInt(busRegistrationNumTxtBox.getText()));
				buses.setHireRate(new String(busHireRateTxtBox.getText()));
				buses.setNoOfSeats(Integer.parseInt(busNoOfSeatsTxtBox.getText()));
				//for radio buttons
				if(lRadioBtnBus.isSelected())
				{
					buses.setStatus("Loan");
				}
				else {
					buses.setStatus("Unloan");
				}
				MiniBusesDao miniBusesDao=new MiniBusesDaoImpl();
				int bid=miniBusesDao.createBus(buses);
				if(bid>=1) {
					JOptionPane.showMessageDialog(AddMiniBusForm.this, "Successfully added new Mini Bus","Added!!!",JOptionPane.PLAIN_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(AddMiniBusForm.this, "sorry error in Data Type","Error!!!",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(215, 398, 89, 23);
		contentPane.add(btnNewButton);
	}
}
