package vn.edu.vnuk.sep.view;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import vn.edu.vnuk.sep.view.define.Define;
import vn.edu.vnuk.sep.view.model.CasualWorker;
import vn.edu.vnuk.sep.view.model.Person;

@SuppressWarnings("serial")
public class Homepage extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearch;
	private JTable table;
	private static ArrayList<String> newItem = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
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
	public Homepage() {
		setTitle("Employee Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmAdd = new JMenuItem("Add");
		mntmAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChooseType chooseType = new ChooseType();
				chooseType.setVisible(true);
			}
		});
		mnFile.add(mntmAdd);
		
		JMenuItem mntmEdit = new JMenuItem("Edit");
		mnFile.add(mntmEdit);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		mnFile.add(mntmDelete);
		
		JMenu mnShow = new JMenu("Show");
		mnFile.add(mnShow);
		
		JMenuItem mntmShowInformation = new JMenuItem("Show information");
		mnShow.add(mntmShowInformation);
		
		JMenuItem mntmShowSalary = new JMenuItem("Show salary");
		mnShow.add(mntmShowSalary);
		
		JMenu mnTool = new JMenu("Tool");
		menuBar.add(mnTool);
		
		JMenuItem mntmUpdateSalary = new JMenuItem("Update salary");
		mnTool.add(mntmUpdateSalary);
		
		JMenuItem mntmSubscribeSalary = new JMenuItem("Subscribe salary");
		mnTool.add(mntmSubscribeSalary);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSearch = new JTextField();
		txtSearch.setToolTipText("");
		txtSearch.setBounds(45, 50, 630, 30);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(695, 50, 107, 30);
		contentPane.add(btnNewButton);
		
		//TABLE
		
		
			//Column names
				String[] columns ={ "ID", "Name", "YearOfBirth", "Hometown", "Department" }; 
				
				DefaultTableModel dtm = new DefaultTableModel(columns, 0);
		
				table = new JTable(dtm);
				
				String[] item= {"A", "B", "C", "D", "E"};
				dtm.addRow(item);
				
		
		table.setBackground(Color.WHITE);
		table.setBounds(45, 114, 757, 358);
		contentPane.add(table);
		
		JButton btnFilter = new JButton("Filter");
		btnFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnFilter.setBounds(722, 499, 80, 30);
		contentPane.add(btnFilter);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnEdit.setBounds(632, 499, 80, 30);
		contentPane.add(btnEdit);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChooseType chooseType = new ChooseType();
				chooseType.setVisible(true);
			}
		});
		btnAdd.setBounds(542, 499, 80, 30);
		contentPane.add(btnAdd);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Salary increasing");
		rdbtnNewRadioButton.setBounds(45, 503, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Alphabetical");
		rdbtnNewRadioButton_1.setBounds(156, 503, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JCheckBox chckbxTeacher = new JCheckBox("Lecturer");
		chckbxTeacher.setBounds(267, 503, 95, 23);
		contentPane.add(chckbxTeacher);
		
		JCheckBox chckbxStaff = new JCheckBox("Staff");
		chckbxStaff.setBounds(370, 503, 57, 23);
		contentPane.add(chckbxStaff);
		
		JCheckBox chckbxWorker = new JCheckBox("Worker");
		chckbxWorker.setBounds(455, 503, 81, 23);
		contentPane.add(chckbxWorker);
	}
	
	public static void addNewPerson(ArrayList<Person> persons) {
		int id = ((CasualWorker)persons.get(Define.latestId)).getId();
		String name = ((CasualWorker)persons.get(Define.latestId)).getName();
		int yearOfBirth = ((CasualWorker)persons.get(Define.latestId)).getYearOfBirth();
		int workDays = ((CasualWorker)persons.get(Define.latestId)).getWorkDay();
		float price = ((CasualWorker)persons.get(Define.latestId)).getEarningPerDay();
		
		System.out.println(id + " " + " " + name + " " + yearOfBirth + " " + workDays + " " + price);
		
	}
}
