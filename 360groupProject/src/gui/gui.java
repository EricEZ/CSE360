package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.util.*;

import node.Node;

import javax.swing.JTextArea;
import java.awt.Color;
/*import javax.swing.JPanel; 				Not needed imports
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec; 
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
*/

public class gui {

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
					gui window = new gui();
					window.frmMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Node input = new Node("",0,"");
	List<Node> x = new ArrayList<Node>();//					x is  new array node is object
	List<Node> visited = new ArrayList<Node>();//			new list of visited 
	List<String> subarray = Arrays.asList();
	
	
	int size_x = x.size();//								size_x is size of list
	int size_visited = visited.size();
	private JTextField report_name;
	private JTextField txtNameChnage;
	private JTextField NewDuration;
	

	/**
	 * Create the application.
	 */
	public gui() {
		String activity;// 				activity name is activity
		String duration; // 			duration name is duration
		String dependencies;//			dependencies name is dependencies
		int duration1;
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/*
	public void listPaths(Node First, Node Last)
	{
		String lastPred = Last.getPredecessor();
		int i = x.size();
		for(i = x.size(); i >= 0; i -- )
		{
			if(x.get(i).getActivity().equals(lastPred))
			{
				lastPred = x.get(i).getActivity();
				
			}
			if(lastPred.equals(First.getActivity()))
			{
				break;
			}
		}
		listPaths(Node First, Node x.get(i));
		
	}*/
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
		String dependencies = dependenciesText.getText(); // 	dependencies name is dependencie
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
			//Node node1 = new Node(activityNameText.getText(), Integer.parseInt(durationText.getText()), dependenciesText.getText());
				
				
				
				
				
				
				
					
					
				if(dependenciesText.getText().equals(activityNameText.getText()))
				{
					lblErrorPleaseReenter.setVisible(true);	// 	show error 
					activityNameText.setText("");
					durationText.setText("");
					dependenciesText.setText("");
				}
				else
				{
					lblErrorPleaseReenter.setVisible(false);
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
				
				
				//List<String> subarray = Arrays.asList(dependencies.split("\\s*,\\s*"));
				Node node1 = new Node(activityNameText.getText(), Integer.parseInt(durationText.getText()), 
						dependenciesText.getText());
				
				
				
				
				
				//subarray = Arrays.asList(dependenciesText.getText().split("\\s*,\\s*"));
				
				
				x.add(node1);
				
				for(int i = 0; i < x.size() ; i++)
				{
					if(activityNameText.getText().equals(x.get(i).getActivity() ) ) //	not good try again
					{
						lblErrorPleaseReenter.setVisible(true);	// 	show error
						activityNameText.setText("");
						durationText.setText("");
						dependenciesText.setText("");
						x.remove(node1);
						
					}
					else
					{
						lblErrorPleaseReenter.setVisible(false);
						
					}
					
					if(dependenciesText.getText().compareTo(x.get(i).getActivity())  != 0 )
					{
						lblErrorPleaseReenter.setVisible(true);	// 	show error 
						activityNameText.setText("");
						durationText.setText("");
						dependenciesText.setText("");
						x.remove(node1);
						
					}
					else
					{
						lblErrorPleaseReenter.setVisible(false);	// 	show error 
						
					}
					
				}
				
				
				
				
				
				
				
				
				
				/*
				Node temp1 = new Node(activityNameText.getText(), Integer.parseInt(durationText.getText()),
						dependenciesText.getText());
				Node temp2 = new Node(activityNameText.getText(), Integer.parseInt(durationText.getText()),
						dependenciesText.getText());
				
				
				for(int i = 0; i < size_x -1; i++)
				{
					if(x.get(i).getDuration() > x.get(i+1).getDuration())
					{
						
						temp1 = x.get(i);
						temp2 = x.get(i +1);
						
						x.get(i +1).setActivity(temp1.getActivity());
						x.get(i +1).setDuration(temp1.getDuration());
						x.get(i +1).setPredecessor(temp1.getPredecessor());
						
						x.get(i).setActivity(temp2.getActivity());
						x.get(i).setDuration(temp2.getDuration());
						x.get(i).setPredecessor(temp2.getPredecessor());
						
					}
							
						
				}
				/*input.setActivity(activity);
				input.setDuration(duration1);
				input.setPredecessor(dependencies);
				
				
					x.add(input);*/
				
				
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
		
		JButton btnhelp = new JButton("help");
		btnhelp.setBounds(86, 450, 82, 29);
		btnhelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frmMain.dispose();								// show help box
				help HP = new help();
				HP.setVisible(true);
			}
		});
		frmMain.getContentPane().add(btnhelp);
		
		JButton btnabout = new JButton("about");
		btnabout.setBounds(6, 450, 82, 29);
		btnabout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				frmMain.dispose();
				about AB = new about();							// show about box
				AB.setVisible(true);
			}
		});
		frmMain.getContentPane().add(btnabout);
		
		JLabel lblDuration = new JLabel("Duration:");
		lblDuration.setBounds(152, 6, 130, 16);
		frmMain.getContentPane().add(lblDuration);			// duration label
		
		JLabel lblDependencies = new JLabel("Dependencies:");
		lblDependencies.setBounds(290, 6, 130, 16);			//	Dependencies label
		frmMain.getContentPane().add(lblDependencies);
		
		
		
		
		JTextArea textArea = new JTextArea();		//output box
		textArea.setBounds(28, 100, 416, 154);
		frmMain.getContentPane().add(textArea);
		
		
		JButton btnShowOutput = new JButton("Show Output");	//	show output
		btnShowOutput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//System.out.print("button pressed");
				
				/*
				for(int i = 0; i < x.size(); i++ )
				{
					if(x.get(i).subarray.isEmpty())
					{
						//i
						Node start = x.get(i);
						return;
					}
					
				}
				*/
				
				
				
				// the compare must be .equals when sub arrays are done
				

				
				textArea.setText("");
				for(Node input: x)
				{
					textArea.append(input.toString() + "\n");
					
				}
				
			}
		});
		btnShowOutput.setBounds(456, 95, 157, 29);
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
		lblOutput.setBounds(28, 72, 61, 16);		// output panel
		frmMain.getContentPane().add(lblOutput);
		
		JButton btnShowCriticalPath = new JButton("Show Critical Path");
		btnShowCriticalPath.setBounds(456, 131, 157, 29);
		frmMain.getContentPane().add(btnShowCriticalPath);
		
		JLabel lblNewReportName = new JLabel("New Report Title:");
		lblNewReportName.setBounds(6, 355, 130, 16);
		frmMain.getContentPane().add(lblNewReportName);
		
		report_name = new JTextField();
		report_name.setColumns(10);
		report_name.setBounds(6, 383, 130, 26);
		frmMain.getContentPane().add(report_name);
		
		JButton btnCreateReport = new JButton("Create Report");
		btnCreateReport.setBounds(137, 383, 157, 29);
		frmMain.getContentPane().add(btnCreateReport);
		
		JLabel lblChangeDuration = new JLabel("Activity Name To Change Duration:");
		lblChangeDuration.setBounds(6, 267, 233, 16);
		frmMain.getContentPane().add(lblChangeDuration);
		
		txtNameChnage = new JTextField();
		txtNameChnage.setColumns(10);
		txtNameChnage.setBounds(6, 295, 130, 26);
		frmMain.getContentPane().add(txtNameChnage);
		
		JLabel lblNewDuration = new JLabel("New Duration:");
		lblNewDuration.setBounds(265, 267, 106, 16);
		frmMain.getContentPane().add(lblNewDuration);
		
		NewDuration = new JTextField();
		NewDuration.setColumns(10);
		NewDuration.setBounds(265, 295, 130, 26);
		frmMain.getContentPane().add(NewDuration);
		
		JButton btnChangeDuration = new JButton("Change Duration");
		btnChangeDuration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnChangeDuration.setBounds(432, 295, 157, 29);
		frmMain.getContentPane().add(btnChangeDuration);
		
		
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