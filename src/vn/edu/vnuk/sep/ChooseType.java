package vn.edu.vnuk.sep;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ChooseType extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseType frame = new ChooseType();
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
	public ChooseType() {
		setTitle("Choose type of employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Lecturer");
		rdbtnNewRadioButton.setBounds(155, 47, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Staff");
		rdbtnNewRadioButton_1.setBounds(155, 73, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Casual Worker");
		rdbtnNewRadioButton_2.setBounds(155, 99, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.setBounds(124, 175, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton.isSelected()) {
					AddEditLecturer addEditLecturer = new AddEditLecturer();
					addEditLecturer.setVisible(true);
				}
				
				if (rdbtnNewRadioButton_1.isSelected()) {
					AddEditStaff addEditStaff = new AddEditStaff();
					addEditStaff.setVisible(true);
				}
				
				if (rdbtnNewRadioButton_2.isSelected()) {
					AddEditCasualWorker addEditCasualWorker = new AddEditCasualWorker();
					addEditCasualWorker.setVisible(true);
				}
				
				
			}
		});
		btnNewButton_1.setBounds(223, 175, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
