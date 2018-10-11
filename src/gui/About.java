package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setTitle("About");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnThePurposeOf = new JTextPane();
		txtpnThePurposeOf.setText("The purpose of this tool is to allow the user to create, manage, and analyze a network diagram. Upon starting this program, the user will be greeted with a menu prompting them to create a network diagram. This will take input in the form of activity name, duration, and a list of dependencies (predecessors). Activity name must be multiple characters and the duration must be an integer. If there is an in the input provided, it will be displayed and prompt the user to re-enter before they can proceed. The processing will begin once all input is completed.\n\nWith the given input, the program will output a network diagram with the names of all activities as well as display every paths and duration listed. All of these features will be implemented through a fully functional GUI interface.");
		txtpnThePurposeOf.setBounds(6, 6, 438, 224);
		contentPane.add(txtpnThePurposeOf);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				contentPane.setVisible(false);
				dispose();
				GUI_360.main(null);
			}
		});
		btnBack.setBounds(152, 242, 117, 29);
		contentPane.add(btnBack);
	}
}