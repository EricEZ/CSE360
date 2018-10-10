import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class add_activity extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_activity frame = new add_activity();
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
	public add_activity() {
		setTitle("Add a Activity");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblActivityName = new JLabel("Activity Name:");
		lblActivityName.setBounds(6, 18, 121, 16);
		contentPane.add(lblActivityName);
		
		JTextPane ActivityName_text = new JTextPane();
		ActivityName_text.setBounds(6, 46, 148, 28);
		contentPane.add(ActivityName_text);
		
		JLabel lblDuration = new JLabel("Duration:");
		lblDuration.setBounds(6, 86, 121, 16);
		contentPane.add(lblDuration);
		
		JTextPane Duration_text = new JTextPane();
		Duration_text.setBounds(6, 115, 148, 28);
		contentPane.add(Duration_text);
		
		JLabel lblListOfDepen = new JLabel("List of Dependencies:");
		lblListOfDepen.setBounds(6, 155, 173, 16);
		contentPane.add(lblListOfDepen);
		
		JTextPane ListofDependencies_text = new JTextPane();
		ListofDependencies_text.setBounds(6, 189, 148, 28);
		contentPane.add(ListofDependencies_text);
		
		JButton btnReturnToMain = new JButton("Return to Main Menu");
		btnReturnToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				contentPane.setVisible(false);
				dispose();
				GUI_360.main(null);
					
				
			}
		});
		btnReturnToMain.setBounds(282, 188, 162, 29);
		contentPane.add(btnReturnToMain);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Save functions
		
			}
		});
		btnSave.setBounds(166, 188, 117, 29);
		contentPane.add(btnSave);
	}
}
