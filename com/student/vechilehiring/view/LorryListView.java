package com.student.vechilehiring.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class LorryListView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable lorryTable;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LorryListView frame = new LorryListView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LorryListView() {
		setTitle("Lorry List Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(826, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lorryTable = new JTable();
		String[] columnNames = { "Lorry ID", "Make", "Model", "Top Speed", "Registration Number", "Hire Rate",
				"Loading Capacity", "Status", "CID", "Lorry Status" };
		DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
		lorryTable.setModel(tableModel);
		contentPane.add(lorryTable);
		
		JScrollPane scrollPane = new JScrollPane(lorryTable);
		scrollPane.setBounds(10, 35, 790, 177);
		contentPane.add(scrollPane);
	}

}
