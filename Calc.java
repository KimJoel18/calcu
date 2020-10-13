/**
*Arellano Kim Joel O.
*ITCC A2
*October 13, 2020
*/

								/** Modified*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class Calc{
	
	private JFrame frame;
	private JPanel MainPanel;
	private JPanel BPanel;
	private GridLayout grid;
	private JTextField Text;
	private BorderLayout layout;
	private MyActionListener ButtonActionListener;
	private Font font;
	
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
	private JButton equals;
	private JButton backspace;
	private BackSpaceListener backSpaceListener;
	
			/*Constructor */
	public Calc (){
	
	frame = new JFrame("My Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	Text = new JTextField(10);
	Text.setHorizontalAlignment(JTextField.RIGHT);
	layout = new BorderLayout();
	grid =	new GridLayout(4,5);
	
	MainPanel = new JPanel(layout);
	BPanel = new JPanel(grid);
	ButtonActionListener = new MyActionListener();
	backSpaceListener = new BackSpaceListener();
	
	one = new JButton("1");
	one.addActionListener(ButtonActionListener);
	two = new JButton("2");
	two.addActionListener(ButtonActionListener);
	three = new JButton("3");
	three.addActionListener(ButtonActionListener);
	four = new JButton("4");
	four.addActionListener(ButtonActionListener);
	five = new JButton("5");
	five.addActionListener(ButtonActionListener);
	six = new JButton("6");
	six.addActionListener(ButtonActionListener);
	seven = new JButton("7");
	seven.addActionListener(ButtonActionListener);
	eight = new JButton("8");
	eight.addActionListener(ButtonActionListener);
	nine = new JButton("9");
	nine.addActionListener(ButtonActionListener);
	zero = new JButton("0");
	zero.addActionListener(ButtonActionListener);
	clear = new JButton("Clear");
	clear.addActionListener(ButtonActionListener);
	plus = new JButton("+");
	plus.addActionListener(ButtonActionListener);
	minus = new JButton("-");
	minus.addActionListener(ButtonActionListener);
	divide = new JButton("/");
	divide.addActionListener(ButtonActionListener);
	multiply = new JButton("*");
	multiply.addActionListener(ButtonActionListener);
	equals = new JButton("=");
	equals.addActionListener(ButtonActionListener);
	backspace= new JButton("<=");
	backspace.addActionListener(backSpaceListener);
	 
	BPanel.add(one);
	BPanel.add(two);
	BPanel.add(three);
	BPanel.add(plus);
	BPanel.add(minus);
	
	BPanel.add(four);
	BPanel.add(five);
	BPanel.add(six);
	BPanel.add(multiply);
	BPanel.add(divide);
	
	BPanel.add(seven);
	BPanel.add(eight);
	BPanel.add(nine);
	BPanel.add(equals);
	BPanel.add(backspace);
		
	BPanel.add(zero);
	BPanel.add(clear);
	
	
	
	
	MainPanel.add(Text, BorderLayout.PAGE_START);
	MainPanel.add(BPanel,BorderLayout.CENTER);
	frame.add(MainPanel);
	frame.pack();
	
	frame.setVisible(true);
	 }
		class MyActionListener implements ActionListener{
			
			public void actionPerformed(ActionEvent e){
			
			if (e.getActionCommand() == "Clear"){
				
				Text.setText("");
			} else{
			
			
			String tmpStr = Text.getText();
			tmpStr = tmpStr + e.getActionCommand();
			Text.setText(tmpStr);
			
			
			}
		}
			}
			
			class BackSpaceListener implements ActionListener{
			
				public void actionPerformed(ActionEvent e) {
				
				
				
				String a = Text.getText();
				int s = a.length();
				String tmpStr = "";
				for (int x = 0; x < s-1; x++){
				tmpStr = tmpStr + a.charAt(x);
				}
				 Text.setText(tmpStr);
				}
			}		
	}