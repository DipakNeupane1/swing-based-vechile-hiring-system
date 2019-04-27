package com.student.vechilehiring.view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class CarListView extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable carTable;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarListView frame = new CarListView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public CarListView() {
		setTitle("Car List Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(805, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		carTable = new JTable();
		String [] columnNames= {"Car ID","Make","Model","No Of Doors","Top Speed","Registration Number","Hire Rate","Fuel Type","Status","CID","Car Status"};
		DefaultTableModel tableModel=new DefaultTableModel(columnNames,0);
		carTable.setModel(tableModel);
		contentPane.add(carTable);
		
		JScrollPane scrollPane = new JScrollPane(carTable);
		scrollPane.setBounds(10, 49, 769, 165);
		contentPane.add(scrollPane);
	}

}
