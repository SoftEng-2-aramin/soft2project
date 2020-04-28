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
	private JButton btnPow;
	private JButton btnAdd;
	private JButton btnMinus;
	private JButton btnBin2Dec;
	private JButton btnMultiply;
	private JButton btnPowN;
	private JButton btnSine;
	private JButton btnCosine;
	private JButton btnDec2Bin;
	private JButton btnExponent;
	private JButton btnTangent;
	private JButton btnHex2Bin;
	private JButton btnBin2Hex;
	private JButton btnDec2Hex;
	private JButton btnHex2Dec;
	private JButton btnAbs;
	private JButton btnLoge;
	private JButton btnHexAdd;
	private JButton btnHexSub;
	private JTextField txtResult;
	private JButton btnNroot;
	private JButton btnLog10;
	private JButton btn2Root;
	private JButton btnBinAdd;
	private JButton btnDivide;
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
		frmCalculator.getContentPane().setLayout(new MigLayout("", "[97px,grow,fill][97px,grow,fill][97.00px,grow,fill][97px,grow,fill][grow,fill]", "[22px,grow,fill][25px,grow,fill]"));
		
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
		
		btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmCalculator.getContentPane().add(btnAdd, "cell 0 1,grow");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output = StdCalc.add(GetSetDouble(txtInput1),GetSetDouble(txtInput2));
				StringOut(output);
			}
		});
		
		btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmCalculator.getContentPane().add(btnMinus, "cell 1 1,grow");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output = StdCalc.subtract(GetSetDouble(txtInput1),GetSetDouble(txtInput2));
				StringOut(output);
			}
		});
		
		btnMultiply = new JButton("\u00D7");
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmCalculator.getContentPane().add(btnMultiply, "flowx,cell 2 1,grow");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output = StdCalc.mulitiply(GetSetDouble(txtInput1),GetSetDouble(txtInput2));
				StringOut(output);
			}
		});
		
		
		btnDivide = new JButton("\u00F7");
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmCalculator.getContentPane().add(btnDivide, "cell 3 1,grow");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output = StdCalc.divide(GetSetDouble(txtInput1),GetSetDouble(txtInput2));
				StringOut(output);
			}
		});
		
		
		btnAbs = new JButton("|X|");
		btnAbs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAbs.setAlignmentY(Component.TOP_ALIGNMENT);
		frmCalculator.getContentPane().add(btnAbs, "cell 4 1,grow");
		btnAbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output = StdCalc.absolute(GetSetDouble(txtInput1));
				StringOut(output);
			}
		});}
		
		
	
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
