package vn.edu.vnuk.sep;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class AddEditCasualWorker extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEditCasualWorker frame = new AddEditCasualWorker();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddEditCasualWorker() {
		setTitle("Add/Edit Staff's Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(50, 30, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(50, 60, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Year of birth:");
		lblNewLabel_2.setBounds(50, 90, 78, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Work days:");
		lblNewLabel_3.setBounds(50, 120, 66, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblDepartment = new JLabel("Price of work day:");
		lblDepartment.setBounds(50, 150, 92, 14);
		contentPane.add(lblDepartment);
		
		textField = new JTextField();
		textField.setBounds(200, 30, 213, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 60, 213, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(200, 90, 213, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(200, 120, 213, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(200, 150, 213, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
				
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(200, 210, 60, 23);
		contentPane.add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(270, 210, 60, 23);
		contentPane.add(btnEdit);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
		});
		btnClose.setBounds(340, 210, 73, 23);
		contentPane.add(btnClose);
	}

}
