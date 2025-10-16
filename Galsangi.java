package chapter02;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Galsangi extends JFrame implements ActionListener{
	
	String left_op;
	String right_op;
	String operator;
	
	
	String s;
	JPanel jp1,jp2,jp3;
	JTextField jtf;
	JButton back,c;
	JButton btn[][];
	String data[][]= {{"7","8","9","/","sqrt"},
					  {"4","5","6","*","%"},
					  {"1","2","3","-","1/x"},
					  {"0","+/-",".","+","="}};
	
	public Galsangi() {
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		
		jp1 = new JPanel(new GridLayout(1,1,5,5));
		jp2 = new JPanel(new GridLayout(1,2,5,5));
		jp3 = new JPanel(new GridLayout(4,5,5,5));
		
		jp1.setBorder(new TitledBorder("Box1"));
		jp2.setBorder(new TitledBorder("Box2"));
		jp3.setBorder(new TitledBorder("Box3"));
		
		
		jtf = new JTextField("123,332");
		jtf.setEditable(false);
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		jp1.add(jtf);
		
		
		back = new JButton("Backspace");
		c = new JButton("C");
		back.addActionListener(this);
		c.addActionListener(this);
		jp2.add(back);
		jp2.add(c);
		
		btn = new JButton[4][5];
		for (int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				btn[i][j] = new JButton(data[i][j]);
				btn[i][j].addActionListener(this);
				jp3.add(btn[i][j]);
			}
		}
		
		ct.add(jp1,BorderLayout.NORTH);
		ct.add(jp2,BorderLayout.CENTER);
		ct.add(jp3,BorderLayout.SOUTH);
		
		
		setTitle("Calculator Exam");
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Galsangi();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		s = s + e.getActionCommand();
		
		if(e.getActionCommand().equals("Backspace")) {
			s = jtf.getText();
			s = s.substring(0, s.length()-1);
			jtf.setText(s);
			s = "";
		}else if(e.getActionCommand().equals("C")) {
			s ="";
			jtf.setText(s);
		}else if(e.getActionCommand().equals("sqrt")) {
			String n = s.substring(0,s.length()-4);
			s = "";
			double val = Double.parseDouble(n);
			String c = String.valueOf(Math.sqrt(val));
			jtf.setText(c);
		}else if(e.getActionCommand().equals("+/-")) {
			String n = s.substring(0,s.length()-3);
			s = "";
			double val = Double.parseDouble(n);
			String c = String.valueOf(val * (-1));
			jtf.setText(c);
		}else if(e.getActionCommand().equals("1/x")) {
			String n = s.substring(0,s.length()-3);
			s = "";
			double val = Double.parseDouble(n);
			String c = String.valueOf(1.0 / val);
			jtf.setText(c);
		}else if(e.getActionCommand().equals("%")) {
			String n = s.substring(0,s.length()-1);
			s = "";
			double val = Double.parseDouble(n);
			String c = String.valueOf(val * 100);
			jtf.setText(c);
		}else if(e.getActionCommand().equals("+") || 
				e.getActionCommand().equals("-")  ||
				e.getActionCommand().equals("*")  ||
				e.getActionCommand().equals("/") ) {
			
			left_op =s.substring(0, s.length()-1);
			s="";
			operator = e.getActionCommand();
		}else if(e.getActionCommand().equals("=")) {
			right_op = s.substring(0, s.length()-1);
			s = "";
		
			if(operator.equals("+")) {
				int a = Integer.parseInt(left_op);
				int b = Integer.parseInt(right_op);
				String c = String.valueOf(a+b);
				jtf.setText(c);
			}else if(operator.equals("-")) {
				int a = Integer.parseInt(left_op);
				int b = Integer.parseInt(right_op);
				String c = String.valueOf(a-b);
				jtf.setText(c);
			}else if(operator.equals("*")) {
				int a = Integer.parseInt(left_op);
				int b = Integer.parseInt(right_op);
				String c = String.valueOf(a*b);
				jtf.setText(c);
			}if(operator.equals("/")) {
				double a = Double.parseDouble(left_op);
				double b = Double.parseDouble(right_op);
				String c = String.valueOf(a/b);
				jtf.setText(c);
			}
		}else {
			jtf.setText(s);
		}
	}  
}
