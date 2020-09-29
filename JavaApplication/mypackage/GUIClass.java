package mypackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIClass {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	static public String textFieldValue1;
	static public String textFieldValue2;
	static public String textFieldValue3;
	static public String textFieldValue4;
	static public String inv;
	static public String flo;
	static public String asgn;
	static public String grd;
	static public int loc_no;
	static public int dm_no;
	static public int tr_no;
	static public int xm_no;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIClass window = new GUIClass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(600,450);
		frame.getContentPane().setFont(new Font("Dyuthi", Font.BOLD, 14));
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.getContentPane().setForeground(Color.RED);
		//frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNoOfLocation = new JLabel("Enter the number of Hybrid Automata locations :");
		lblNoOfLocation.setBounds(51, 64, 350, 21);
		frame.getContentPane().add(lblNoOfLocation);
		
		JLabel lblNoOfDimensions = new JLabel("Enter the number of Hybrid Automata dimensions :");
		lblNoOfDimensions.setBounds(52, 97, 372, 17);
		frame.getContentPane().add(lblNoOfDimensions);
		
		JLabel lblEnterNoOf = new JLabel("Enter the numebr of Hybrid Automata transitions :");
		lblEnterNoOf.setBounds(52, 126, 349, 21);
		frame.getContentPane().add(lblEnterNoOf);
		
		JLabel lblEnterTypeOf = new JLabel("Enter the type of flow :");
		lblEnterTypeOf.setBounds(52, 159, 196, 21);
		frame.getContentPane().add(lblEnterTypeOf);
		
		JLabel lblEnterTypeOf_1 = new JLabel("Enter the type of invaraint :");
		lblEnterTypeOf_1.setBounds(52, 194, 196, 17);
		frame.getContentPane().add(lblEnterTypeOf_1);
		
		JLabel lblEnterTypeOf_2 = new JLabel("Enter the type of assignment :");
		lblEnterTypeOf_2.setBounds(52, 232, 227, 17);
		frame.getContentPane().add(lblEnterTypeOf_2);
		
		JLabel lblEnterTypeOf_3 = new JLabel("Enter the type of gaurd :");
		lblEnterTypeOf_3.setBounds(52, 267, 186, 21);
		frame.getContentPane().add(lblEnterTypeOf_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Constant");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton.isSelected()) {
		            flo = "const";
		           
		        } 
			}
		});
		rdbtnNewRadioButton.setBounds(339, 161, 97, 17);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Affine");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_1.isSelected()) {
		            flo = "affine";
		           
		        }
			}
		});
		rdbtnNewRadioButton_1.setBounds(455, 161, 75, 17);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Polytope");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_2.isSelected()) {
		            inv = "polytope";
		           
		        } 
			}
		});
		rdbtnNewRadioButton_2.setBounds(339, 194, 89, 17);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Hyperbox");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_3.isSelected()) {
		            inv = "const";
		           
		        }
			}
		});
		rdbtnNewRadioButton_3.setBounds(439, 194, 91, 17);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Polytope");
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_4.isSelected()) {
		            asgn = "affine";
		           
		        }
			}
		});
		rdbtnNewRadioButton_4.setBounds(339, 232, 89, 17);
		frame.getContentPane().add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Hyberbox");
		rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_5.isSelected()) {
		            asgn = "const";
		           
		        }
			}
		});
		rdbtnNewRadioButton_5.setBounds(439, 232, 91, 17);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Polytope");
		rdbtnNewRadioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_6.isSelected()) {
		            grd = "polytope";
		           
		        } 
			}
			
		});
		rdbtnNewRadioButton_6.setBounds(331, 269, 89, 17);
		frame.getContentPane().add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Hyperplane");
		rdbtnNewRadioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_7.isSelected()) {
		            grd = "const";
		           
		        } 
			}
		});
		rdbtnNewRadioButton_7.setBounds(424, 269, 105, 17);
		frame.getContentPane().add(rdbtnNewRadioButton_7);
		
		textField = new JTextField();
		textField.setBounds(434, 65, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(434, 96, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(434, 127, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Generate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldValue1 = textField.getText();
				loc_no = Integer.parseInt(textFieldValue1);
				textFieldValue2 = textField_1.getText();
				dm_no = Integer.parseInt(textFieldValue2);
				textFieldValue3 = textField_2.getText();
				tr_no = Integer.parseInt(textFieldValue3);
				textFieldValue4 = textField_3.getText();
				xm_no = Integer.parseInt(textFieldValue4);
				TemplateGenerator.main(null);
				
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Manjari Bold", Font.BOLD, 12));
		btnNewButton.setBounds(254, 383, 106, 17);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblEnterNoOf_1 = new JLabel("Enter the number of Test-Cases :");
		lblEnterNoOf_1.setBounds(52, 312, 255, 17);
		frame.getContentPane().add(lblEnterNoOf_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(434, 311, 96, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAutomatedTestCase = new JLabel("Automated Test Case Generator for CPS Model-Checker");
		lblAutomatedTestCase.setForeground(Color.DARK_GRAY);
		lblAutomatedTestCase.setBackground(Color.WHITE);
		lblAutomatedTestCase.setFont(new Font("Kalimati", Font.BOLD | Font.ITALIC, 14));
		lblAutomatedTestCase.setBounds(84, 12, 415, 23);
		frame.getContentPane().add(lblAutomatedTestCase);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("None");
		rdbtnNewRadioButton_9.setBounds(262, 232, 67, 17);
		frame.getContentPane().add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("None");
		rdbtnNewRadioButton_10.setBounds(252, 269, 67, 17);
		frame.getContentPane().add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("None");
		rdbtnNewRadioButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		rdbtnNewRadioButton_11.setBounds(262, 194, 67, 17);
		frame.getContentPane().add(rdbtnNewRadioButton_11);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("None");
		rdbtnNewRadioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnNewRadioButton_8.isSelected()) {
		            flo = "none";
		           
		        }
			}
		});
		rdbtnNewRadioButton_8.setBounds(262, 161, 67, 17);
		frame.getContentPane().add(rdbtnNewRadioButton_8);
	}
}