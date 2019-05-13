package vn.edu.vnuk.sep.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import vn.edu.vnuk.sep.view.define.Define;
import vn.edu.vnuk.sep.view.model.CasualWorker;

@SuppressWarnings("serial")
public class AddEditCasualWorker extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldId;
	private JTextField textFieldName;
	private JTextField textFieldYearOfBirth;
	private JTextField textFieldWorkDays;
	private JTextField textFieldPrice;
	private ArrayList<CasualWorker> casualWorkers = new ArrayList<CasualWorker>();


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
		
		textFieldId = new JTextField();
		textFieldId.setBounds(200, 30, 213, 20);
		contentPane.add(textFieldId);
		textFieldId.setColumns(10);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(200, 60, 213, 20);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldYearOfBirth = new JTextField();
		textFieldYearOfBirth.setBounds(200, 90, 213, 20);
		contentPane.add(textFieldYearOfBirth);
		textFieldYearOfBirth.setColumns(10);
		
		textFieldWorkDays = new JTextField();
		textFieldWorkDays.setBounds(200, 120, 213, 20);
		contentPane.add(textFieldWorkDays);
		textFieldWorkDays.setColumns(10);
		
		textFieldPrice = new JTextField();
		textFieldPrice.setBounds(200, 150, 213, 20);
		contentPane.add(textFieldPrice);
		textFieldPrice.setColumns(10);
				
		JButton btnAdd = new JButton("Submit");
		btnAdd.setBounds(50, 194, 363, 23);
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addCasualWorker();
			}
		});
		contentPane.add(btnAdd);
	}
	
	public void addCasualWorker() {
		int id = Integer.parseInt(textFieldId.getText().toString());
		String name = textFieldName.getText().toString();
		int yearOfBirth = Integer.parseInt(textFieldYearOfBirth.getText().toString());
		int workDays = Integer.parseInt(textFieldWorkDays.getText().toString());
		float price = Float.parseFloat(textFieldPrice.getText().toString());
		
		CasualWorker casualWorker = new CasualWorker.CasualWorkerBuilder(Define.latestId, Define.TYPE_OF_CASUAL_WORKER)
				.setName(name)
				.setYearOfBirth(yearOfBirth)
				.setWorkDay(workDays)
				.setEarningPerDay(price)
				.build();
		
		Define.persons.add(casualWorker);
		casualWorkers.add(casualWorker);
		
		System.out.println(id + " " + name + " " + yearOfBirth + " " + workDays + " " + price);
		
	}
	

}
