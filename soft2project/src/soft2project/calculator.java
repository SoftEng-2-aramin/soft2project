package soft2project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[97px][97px][5px][97px,grow][97px]", "[22px][25px][25px]"));
		
		textField = new JTextField();
		frame.getContentPane().add(textField, "cell 0 0,alignx right,aligny top");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		frame.getContentPane().add(textField_1, "cell 1 0,alignx left,aligny top");
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		frame.getContentPane().add(textField_2, "cell 3 0 2 1,growx");
		textField_2.setColumns(10);
		
		btnNewButton_1 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_1, "cell 0 1,alignx left,aligny top");
		
		btnNewButton_2 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_2, "cell 1 1,alignx left,aligny top");
		
		btnNewButton_3 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_3, "cell 3 1,alignx left,aligny top");
		
		btnNewButton = new JButton("New button");
		frame.getContentPane().add(btnNewButton, "cell 0 2,alignx left,aligny top");
		
		btnNewButton_5 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_5, "cell 1 2,alignx left,aligny top");
		
		btnNewButton_4 = new JButton("New button");
		frame.getContentPane().add(btnNewButton_4, "cell 3 2,alignx left,aligny top");
	}

}
