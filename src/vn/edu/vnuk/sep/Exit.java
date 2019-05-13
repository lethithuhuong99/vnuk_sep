package vn.edu.vnuk.sep;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class Exit extends JPanel {

	/**
	 * Create the panel.
	 */
	public Exit() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Exit");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 100, 25);
		add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 47, 380, 17);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 143, 380, 17);
		add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Do you really want to Exit?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 75, 200, 25);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("No");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(320, 159, 70, 30);
		add(btnNewButton);
		
		JButton button = new JButton("Yes");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage homepage = new Homepage();
				homepage.setVisible(false);
			}
		});
		button.setForeground(Color.BLACK);
		button.setBackground(Color.GRAY);
		button.setBounds(239, 159, 70, 30);
		add(button);

	}

}
