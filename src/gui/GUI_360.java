package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import node.Node;

import javax.swing.JTextArea;
import java.awt.Color;
/*import javax.swing.JPanel; 				Not needed imports
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec; 
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
*/

public class GUI_360 {

	private JFrame frmMain;
	private JTextField activityNameText;
	private JTextField durationText;
	private JTextField dependenciesText;

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
	
	Node input = new Node("",0,"");
	List<Node> x = new ArrayList<Node>();//					x is  new array
	int size_x = x.size();//								size_x is size of list

	/**
	 * Create the application.
	 */
	public GUI_360() {
		String activity;// 				activity name is activity
		String duration; // 			duration name is duration
		String dependencies;//			dependencies name is dependencies
		int duration1;
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMain = new JFrame();
		frmMain.setTitle("Network Diagram Analyzing Tool");
		frmMain.setBounds(100, 100, 731, 507);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.getContentPane().setLayout(null);
		
		
		JLabel lblNewActivity = new JLabel("New activity name:");
		lblNewActivity.setBounds(6, 6, 130, 16);
		frmMain.getContentPane().add(lblNewActivity);
		
		activityNameText = new JTextField();
		String activity = activityNameText.getText(); // 		activity name is activity
		activityNameText.setBounds(6, 34, 130, 26);
		frmMain.getContentPane().add(activityNameText);
		activityNameText.setColumns(10);
		
		durationText = new JTextField();
		String duration = durationText.getText(); // 			duration name is duration
		durationText.setBounds(148, 34, 130, 26);
		frmMain.getContentPane().add(durationText);
		durationText.setColumns(10);
		
		dependenciesText = new JTextField();
		String dependencies = dependenciesText.getText(); // 	dependencies name is dependencies
		dependenciesText.setBounds(290, 34, 130, 26);
		frmMain.getContentPane().add(dependenciesText);
		dependenciesText.setColumns(10);
		
		JLabel lblErrorPleaseReenter = new JLabel("Error: Please re-enter");
		lblErrorPleaseReenter.setForeground(Color.RED);
		lblErrorPleaseReenter.setBounds(432, 6, 201, 16);
		frmMain.getContentPane().add(lblErrorPleaseReenter);
		lblErrorPleaseReenter.setVisible(false);//				Error not shown 
		
		
		
		
		JButton btnSave = new JButton("Save");	
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 	//		save button action
			{
				
				for(int i = 0; i < size_x -1; i++)
				{
					if(activity.equals(x.get(i).getActivity() ) ) //	not good try again
					{
						lblErrorPleaseReenter.setVisible(true);	// 	show error 
						return;
					}
					if(dependencies.compareTo(x.get(i).getActivity())  != 0 )
					{
						lblErrorPleaseReenter.setVisible(true);	// 	show error 
						return;
					}
					if(dependencies.equals(activity) )
					{
						lblErrorPleaseReenter.setVisible(true);	// 	show error 
						return;
					}
					
				}
				int duration1 =-1;
				String duration = durationText.getText(); // 	need this
				try
				{
					duration1 = Integer.parseInt(duration);
					lblErrorPleaseReenter.setVisible(false);	// hide error
				}
				catch(NumberFormatException a)
				{
					lblErrorPleaseReenter.setVisible(true);	// 	show error 
					return;
				}
				
				
				
				input.setActivity(activity);
				input.setDuration(duration1);
				input.setPredecessor(dependencies);
				
				
					x.add(input);
				
				
				activityNameText.setText("");
				durationText.setText("");
				dependenciesText.setText("");
				
				
				
			}
		});
		btnSave.setBounds(432, 34, 117, 29);
		frmMain.getContentPane().add(btnSave);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(165, 450, 117, 29);
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				 System.exit(0);								// close the program
				
			}
		});
		frmMain.getContentPane().add(btnQuit);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(86, 450, 82, 29);
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frmMain.dispose();								// show help box
				Help HP = new Help();
				HP.setVisible(true);
			}
		});
		frmMain.getContentPane().add(btnHelp);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setBounds(6, 450, 82, 29);
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frmMain.dispose();
				About AB = new About();							// show about box
				AB.setVisible(true);
			}
		});
		frmMain.getContentPane().add(btnAbout);
		
		JLabel lblDuration = new JLabel("Duration:");
		lblDuration.setBounds(152, 6, 130, 16);
		frmMain.getContentPane().add(lblDuration);			// duration label
		
		JLabel lblDependencies = new JLabel("Dependencies:");
		lblDependencies.setBounds(290, 6, 130, 16);			//	Dependencies label
		frmMain.getContentPane().add(lblDependencies);
		
		
		
		
		JTextArea textArea = new JTextArea();		//output box
		textArea.setBounds(28, 150, 416, 227);
		frmMain.getContentPane().add(textArea);
		
		JButton btnShowOutput = new JButton("Show Output");	//	show output
		btnShowOutput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textArea.setText("");
				for(Node input: x)
				{
					textArea.append(input.toString() + "\n");
				}
			}
		});
		btnShowOutput.setBounds(471, 247, 117, 29);
		frmMain.getContentPane().add(btnShowOutput);
		
		JButton btnResetDiagram = new JButton("Reset Diagram");	// reset diagram
		btnResetDiagram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				x.removeAll(x);
				textArea.setText("");
			}
		});
		btnResetDiagram.setBounds(561, 34, 117, 29);
		frmMain.getContentPane().add(btnResetDiagram);
		
		
		JLabel lblOutput = new JLabel("Output:");
		lblOutput.setBounds(28, 121, 61, 16);		// output panel
		frmMain.getContentPane().add(lblOutput);
		
		
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