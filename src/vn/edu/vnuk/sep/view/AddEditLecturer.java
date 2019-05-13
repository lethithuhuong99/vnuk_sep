package vn.edu.vnuk.sep.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class AddEditLecturer extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldId;
	private JTextField textFieldName;
	private JTextField textFieldYearOfBirth;
	private JTextField textFieldHometown;
	private JTextField textFieldDepartment;
	private JTextField textFieldAllowance;
	private JTextField textFieldPeriodsInMonth;
	private JTextField textFieldSalaryRatio;
	private JTextField textFieldYearOfWork;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEditLecturer frame = new AddEditLecturer();
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
	@SuppressWarnings("unchecked")
	public AddEditLecturer() {
		setTitle("Add/Edit Lecturer's Information");
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
		
		JLabel lblNewLabel_3 = new JLabel("Hometown:");
		lblNewLabel_3.setBounds(50, 120, 66, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(50, 150, 66, 14);
		contentPane.add(lblDepartment);
		
		JLabel lblNewLabel_4 = new JLabel("Qualification:");
		lblNewLabel_4.setBounds(50, 180, 66, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Allowance:");
		lblNewLabel_5.setBounds(50, 210, 66, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Periods in month:");
		lblNewLabel_6.setBounds(50, 240, 89, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Salary ratio:");
		lblNewLabel_7.setBounds(50, 270, 66, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Years of work:");
		lblNewLabel_8.setBounds(50, 300, 78, 14);
		contentPane.add(lblNewLabel_8);
		
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
		
		textFieldHometown = new JTextField();
		textFieldHometown.setBounds(200, 120, 213, 20);
		contentPane.add(textFieldHometown);
		textFieldHometown.setColumns(10);
		
		textFieldDepartment = new JTextField();
		textFieldDepartment.setBounds(200, 150, 213, 20);
		contentPane.add(textFieldDepartment);
		textFieldDepartment.setColumns(10);
		
		textFieldAllowance = new JTextField();
		textFieldAllowance.setBounds(200, 210, 213, 20);
		contentPane.add(textFieldAllowance);
		textFieldAllowance.setColumns(10);
		
		textFieldPeriodsInMonth = new JTextField();
		textFieldPeriodsInMonth.setBounds(200, 240, 213, 20);
		contentPane.add(textFieldPeriodsInMonth);
		textFieldPeriodsInMonth.setColumns(10);
		
		textFieldSalaryRatio = new JTextField();
		textFieldSalaryRatio.setBounds(200, 270, 213, 20);
		contentPane.add(textFieldSalaryRatio);
		textFieldSalaryRatio.setColumns(10);
		
		textFieldYearOfWork = new JTextField();
		textFieldYearOfWork.setBounds(200, 300, 213, 20);
		contentPane.add(textFieldYearOfWork);
		textFieldYearOfWork.setColumns(10);
		
		JComboBox comboBoxQualification = new JComboBox();
		comboBoxQualification.setModel(new DefaultComboBoxModel(new String[] {"Bachelor", "Master", "Doctor"}));
		comboBoxQualification.setBounds(200, 180, 213, 20);
		contentPane.add(comboBoxQualification);
		
		JButton btnAdd = new JButton("Submit");
		btnAdd.setBounds(50, 343, 363, 23);
		contentPane.add(btnAdd);
	}
}
