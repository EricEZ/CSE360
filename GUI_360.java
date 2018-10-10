import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

public class GUI_360 {

	private JFrame frmMain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_360 window = new GUI_360();
					window.frmMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_360() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMain = new JFrame();
		frmMain.setTitle("Network Diagram Analyzing Tool");
		frmMain.setBounds(100, 100, 450, 300);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnAddActvity = new JButton("Add Actvity");
		btnAddActvity.setBounds(19, 25, 192, 29);
		btnAddActvity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frmMain.dispose();
				add_activity ad_act = new add_activity();
				ad_act.setVisible(true);
			}
		});
		frmMain.getContentPane().setLayout(null);
		frmMain.getContentPane().add(btnAddActvity);
		
		JButton btnRestartNetworkDiagram = new JButton("Restart Network Diagram");
		btnRestartNetworkDiagram.setBounds(19, 64, 192, 29);
		btnRestartNetworkDiagram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//TODO reset network diagram
			}
		});
		frmMain.getContentPane().add(btnRestartNetworkDiagram);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(281, 25, 117, 29);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//TODO save functions 
			}
		});
		frmMain.getContentPane().add(btnSave);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(281, 64, 117, 29);
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				 System.exit(0);
				
			}
		});
		frmMain.getContentPane().add(btnQuit);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(19, 156, 82, 29);
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frmMain.dispose();
				Help HP = new Help();
				HP.setVisible(true);
			}
		});
		frmMain.getContentPane().add(btnHelp);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setBounds(19, 210, 82, 29);
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frmMain.dispose();
				About AB = new About();
				AB.setVisible(true);
			}
		});
		frmMain.getContentPane().add(btnAbout);
	}

	public void setVisible(boolean b) 
	{
		if(b = true)
		{
			frmMain.setVisible(true);
		}
		else
		{
			frmMain.setVisible(false);
		}
		
	}
}
