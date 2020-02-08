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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frmCalculator.setVisible(true);
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
		frmCalculator = new JFrame();
		frmCalculator.setMinimumSize(new Dimension(825, 390));
		frmCalculator.setBackground(Color.WHITE);
		frmCalculator.setForeground(Color.WHITE);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 825, 390);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(new MigLayout("", "[97px,grow,fill][97px,grow,fill][97.00px,grow,fill][97px,grow,fill][grow,fill]", "[22px,grow,fill][25px,grow,fill][25px,grow,fill][25px,grow,fill][grow,fill][grow,fill]"));
		
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
		
		btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmCalculator.getContentPane().add(btnMinus, "cell 1 1,grow");
		
		btnMultiply = new JButton("\u00D7");
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmCalculator.getContentPane().add(btnMultiply, "flowx,cell 2 1,grow");
		
		btnDivide = new JButton("\u00F7");
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		frmCalculator.getContentPane().add(btnDivide, "cell 3 1,grow");
		
		btnAbs = new JButton("|X|");
		btnAbs.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAbs.setAlignmentY(Component.TOP_ALIGNMENT);
		frmCalculator.getContentPane().add(btnAbs, "cell 4 1,grow");
		
		btnPow = new JButton("X\u00B2");
		btnPow.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnPow, "cell 0 2,grow");
		
		btnPowN = new JButton("X\u207F");
		btnPowN.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnPowN, "cell 1 2,grow");
		
		btnExponent = new JButton("10\u207F");
		btnExponent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExponent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmCalculator.getContentPane().add(btnExponent, "flowx,cell 2 2,grow");
		
		btnLog10 = new JButton("log(X)");
		btnLog10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnLog10, "cell 3 2,grow");
		
		btnLoge = new JButton("ln(X)");
		btnLoge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnLoge, "cell 4 2,grow");
		
		btnSine = new JButton("sin(X)");
		btnSine.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnSine, "cell 0 3,grow");
		
		btnCosine = new JButton("cos(X)");
		btnCosine.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnCosine, "cell 1 3,grow");
		
		btnTangent = new JButton("tan(X)");
		btnTangent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnTangent, "flowx,cell 2 3,grow");
		
		btn2Root = new JButton("\u221AX");
		btn2Root.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btn2Root, "cell 3 3,grow");
		
		btnNroot = new JButton("\u207F\u221AX");
		btnNroot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnNroot, "flowx,cell 4 3,grow");
		
		btnBin2Dec = new JButton("Bin2Dec");
		btnBin2Dec.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnBin2Dec, "cell 0 4,grow");
		
		btnDec2Bin = new JButton("Dec2Bin");
		btnDec2Bin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDec2Bin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frmCalculator.getContentPane().add(btnDec2Bin, "cell 1 4,grow");
		
		btnHex2Bin = new JButton("Hex2Bin");
		btnHex2Bin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnHex2Bin, "flowx,cell 2 4,grow");
		
		btnBinAdd = new JButton("Bin Addition");
		btnBinAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnBinAdd, "cell 3 4,grow");
		
		btnHexAdd = new JButton("Hex Addition");
		btnHexAdd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnHexAdd, "cell 4 4,grow");
		
		btnBin2Hex = new JButton("Bin2Hex");
		btnBin2Hex.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnBin2Hex, "cell 0 5,grow");
		
		btnDec2Hex = new JButton("Dec2Hex");
		btnDec2Hex.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDec2Hex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmCalculator.getContentPane().add(btnDec2Hex, "cell 1 5,grow");
		
		btnHex2Dec = new JButton("Hex2Dec");
		btnHex2Dec.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnHex2Dec, "flowx,cell 2 5,grow");
		
		btnBinSub = new JButton("Bin Subtraction");
		btnBinSub.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnBinSub, "cell 3 5");
		
		btnHexSub = new JButton("Hex Subtraction");
		btnHexSub.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmCalculator.getContentPane().add(btnHexSub, "cell 4 5,grow");
	}

}
