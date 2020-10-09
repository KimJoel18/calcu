/**
*Arellano Kim Joel O.
*ITCC A2
*October 9, 2020
*/

import javax.swing.*;
import java.awt.*;
 class Calc{
	
	private JFrame frame;
	private JPanel MainPanel;
	private JPanel BPanel;
	private GridLayout grid;
	private JTextField Text;
	private BorderLayout layout;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
    private JButton nine;
	private JButton zero;
	private JButton clear;
	private JButton plus;
	private JButton minus;
	private JButton divide;
	private JButton multiply;
	private JButton decimal;
	
			/*Constructor */
	public Calc (){
	
	frame = new JFrame("My Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Text = new JTextField(20);
	layout = new BorderLayout();
	grid =	new GridLayout(4,4);
	
	
	MainPanel = new JPanel(layout);
	BPanel = new JPanel(grid);
	
	one = new JButton("1");
	two = new JButton("2");
	three = new JButton("3");
	four = new JButton("4");
	five = new JButton("5");
	six = new JButton("6");
	seven = new JButton("7");
	eight = new JButton("8");
	nine = new JButton("9");
	zero = new JButton("0");
	clear = new JButton("Clear");
	plus = new JButton("+");
	minus = new JButton("-");
	divide = new JButton("/");
	multiply = new JButton("*");
	decimal = new JButton(".");
	
	BPanel.add(one);
	BPanel.add(two);
	BPanel.add(three);
	BPanel.add(plus);
	
	BPanel.add(four);
	BPanel.add(five);
	BPanel.add(six);
	BPanel.add(minus);
	
	BPanel.add(seven);
	BPanel.add(eight);
	BPanel.add(nine);
	BPanel.add(multiply);
	
	
	BPanel.add(zero);
	BPanel.add(decimal);
	BPanel.add(clear);
	BPanel.add(divide);
	
	
	MainPanel.add(Text, BorderLayout.PAGE_START);
	MainPanel.add(BPanel,BorderLayout.CENTER);
	frame.add(MainPanel);
	frame.pack();
	
	frame.setVisible(true);
	 }
	}