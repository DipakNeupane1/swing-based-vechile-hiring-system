package com.student.vechilehiring.view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class MiniBusListView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable busTable;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniBusListView frame = new MiniBusListView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MiniBusListView() {
		setTitle("Mini Bus List Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(785, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		busTable = new JTable();
		String [] columnNames= {"Bus ID","Make","Model","Top Speed","Registration Number","Hire Rate","No Of Seats","Status","CID","Bus Status"};
		DefaultTableModel tableModel=new DefaultTableModel(columnNames, 0);
		busTable.setModel(tableModel);
		contentPane.add(busTable);
		
		JScrollPane scrollPane = new JScrollPane(busTable);
		scrollPane.setBounds(10, 40, 749, 199);
		contentPane.add(scrollPane);
	}

}
