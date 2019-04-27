package com.student.vechilehiring.view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class CustomerListView extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable studentTable;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerListView frame = new CustomerListView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public CustomerListView() {
		setTitle("Customer List Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(742, 285);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		studentTable = new JTable();
		String [] columnNames={"CID","Customer Name","Customer Address","Phone Number","Email","DOB","User Name","Password"};
		DefaultTableModel tableModel=new DefaultTableModel(columnNames, 0);
		studentTable.setModel(tableModel);
		contentPane.add(studentTable);
		
		JScrollPane scrollPane = new JScrollPane(studentTable);
		scrollPane.setBounds(10, 47, 706, 154);
		contentPane.add(scrollPane);
	}
}
