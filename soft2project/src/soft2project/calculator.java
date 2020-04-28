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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class calculator {

	private JFrame frmCalculator;
	private JTextField txtInput1;
	private JTextField txtInput2;
	private JButton btnBin2Dec;
	private JButton btnDec2Bin;
	private JButton btnHex2Bin;
	private JButton btnBin2Hex;
	private JButton btnDec2Hex;
	private JButton btnHex2Dec;
	private JButton btnHexAdd;
	private JButton btnHexSub;
	private JTextField txtResult;
	private JButton btnBinAdd;
	private JButton btnBinSub;
	double output;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				calculator window = new calculator();
				window.frmCalculator.setVisible(true);
				
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
		frmCalculator = new JFrame();
		frmCalculator.setMinimumSize(new Dimension(825, 390));
		frmCalculator.setBackground(Color.WHITE);
		frmCalculator.setForeground(Color.WHITE);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 825, 390);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(new MigLayout("", "[97px,grow,fill][97px,grow,fill][97.00px,grow,fill][97px,grow,fill][grow,fill]", "[22px,grow,fill][25px,grow,fill][25px,grow,fill]"));
		
		txtInput1 = new JTextField();
		txtInput1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(txtInput1, "cell 0 0,grow");
		txtInput1.setColumns(10);
		
		txtInput2 = new JTextField();
		txtInput2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(txtInput2, "cell 1 0,grow");
		txtInput2.setColumns(10);
		
		txtResult = new JTextField();
		txtResult.setBackground(new Color(204, 255, 255));
		txtResult.setDisabledTextColor(Color.GREEN);
		txtResult.setEditable(false);
		txtResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(txtResult, "cell 2 0 3 1,grow");
		txtResult.setColumns(10);
		
		btnBin2Dec = new JButton("Bin2Dec");
		btnBin2Dec.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnBin2Dec, "cell 0 1,grow");
		
		btnBin2Dec.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// get input (as a Binary number) from the 1st text field and parse it into an Integer
				int input_one = Integer.parseInt(txtInput1.getText(), 2);
				String result = Binary_Hexadecimal.Bin2Dec(input_one);
				txtResult.setText(result);
			}
		});
		
		btnDec2Bin = new JButton("Dec2Bin");
		btnDec2Bin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDec2Bin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frmCalculator.getContentPane().add(btnDec2Bin, "cell 1 1,grow");
		
		btnDec2Bin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// get input (as a Decimal number) from the 1st text field and parse it into an Integer
				int input_one = Integer.parseInt(txtInput1.getText());
				String result = Binary_Hexadecimal.Dec2Bin(input_one);
				txtResult.setText(result);
			}
		});
		
		btnHex2Bin = new JButton("Hex2Bin");
		btnHex2Bin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnHex2Bin, "flowx,cell 2 1,grow");
		
		btnHex2Bin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// get input (as a Binary number) from the 1st text field and parse it into an Integer
				int input_one = Integer.parseInt(txtInput1.getText(), 16);
				String result = Binary_Hexadecimal.Hex2Bin(input_one);
				txtResult.setText(result);
			}
		});
		
		btnBinAdd = new JButton("Bin Addition");
		btnBinAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnBinAdd, "cell 3 1,grow");
		
		
		btnBinAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// get inputs (as Binary numbers) from text fields and parse them into Integers
				int input_one = Integer.parseInt(txtInput1.getText(), 2);
				int input_two = Integer.parseInt(txtInput2.getText(), 2);
				String result = Binary_Hexadecimal.BinAdd(input_one, input_two);
				txtResult.setText(result);
			}
		});
		
		btnHexAdd = new JButton("Hex Addition");
		btnHexAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnHexAdd, "cell 4 1,grow");
		
				btnHexAdd.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// get inputs (as Binary numbers) from text fields and parse them into Integers
						int input_one = Integer.parseInt(txtInput1.getText(), 16);
						int input_two = Integer.parseInt(txtInput2.getText(), 16);
						String result = Binary_Hexadecimal.HexAdd(input_one, input_two);
						txtResult.setText(result);
					}
				});
		
		btnDec2Hex = new JButton("Dec2Hex");
		btnDec2Hex.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDec2Hex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnBin2Hex = new JButton("Bin2Hex");
		btnBin2Hex.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnBin2Hex, "cell 0 2,grow");
		
		btnBin2Hex.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// get input (as a Binary number) from the 1st text field and parse it into an Integer
				int input_one = Integer.parseInt(txtInput1.getText(), 2);
				String result = Binary_Hexadecimal.Bin2Hex(input_one);
				txtResult.setText(result);
			}
		});
		frmCalculator.getContentPane().add(btnDec2Hex, "cell 1 2,grow");
		
		btnDec2Hex.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// get input (as a Decimal number) from the 1st text field and parse it into an Integer
				int input_one = Integer.parseInt(txtInput1.getText());
				String result = Binary_Hexadecimal.Dec2Hex(input_one);
				txtResult.setText(result);
			}
		});
		
		btnHex2Dec = new JButton("Hex2Dec");
		btnHex2Dec.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnHex2Dec, "flowx,cell 2 2,grow");
		
		btnHex2Dec.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// get input (as a Hex number) from the 1st text field and parse it into an Integer
				int input_one = Integer.parseInt(txtInput1.getText(), 16);
				String result = Binary_Hexadecimal.Hex2Dec(input_one);
				txtResult.setText(result);
			}
		});
		
		btnBinSub = new JButton("Bin Subtraction");
		btnBinSub.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnBinSub, "cell 3 2");
		
				btnBinSub.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// get inputs (as Binary numbers) from text fields and parse them into Integers
						int input_one = Integer.parseInt(txtInput1.getText(), 2);
						int input_two = Integer.parseInt(txtInput2.getText(), 2);
						String result = Binary_Hexadecimal.BinSub(input_one, input_two);
						txtResult.setText(result);
					}
				});
		
		btnHexSub = new JButton("Hex Subtraction");
		btnHexSub.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnHexSub, "cell 4 2,grow");
		
				btnHexSub.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// get inputs (as Binary numbers) from text fields and parse them into Integers
						int input_one = Integer.parseInt(txtInput1.getText(), 16);
						int input_two = Integer.parseInt(txtInput2.getText(), 16);
						String result = Binary_Hexadecimal.HexSub(input_one, input_two);
						txtResult.setText(result);
					}
				});

	}
	
	//Taking the String input from a text field and changing it to a Float
			public double GetSetDouble(JTextField in) {
				String input = in.getText();
				double dinput = Double.parseDouble(input);
				return dinput;
			}
			
			//Taking the Float output from a math function and changing it to a String
			public void StringOut(double out) {
				String Soutput = Double.toString(out);
				txtResult.setText(Soutput);
			}

}
