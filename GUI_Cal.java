package chapter02;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

class GUICalculator extends JFrame {
	
	public GUICalculator() {
		
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout(5,5));
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(1,1,5,5));
		JTextField jtf = new JTextField();
		jtf.setText("61,755.0");
		jtf.setEditable(false);
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		jp1.setBorder(new TitledBorder("Calculator"));
		jp1.add(jtf);
		ct.add(jp1, BorderLayout.NORTH);
		
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(1,2,5,5));
		jp2.setBorder(new TitledBorder("Delete Button"));
		JButton bt1 = new JButton("Backspace");
        JButton bt2 = new JButton("C");
       
        jp2.add(bt1);
        jp2.add(bt2);
        ct.add(jp2, BorderLayout.CENTER);
        
        
        
        
		JPanel jp3 = new JPanel();
        jp3.setLayout(new GridLayout(4,5,5,5));
        jp3.setBorder(new TitledBorder("Enter Button"));
        
        JButton btn[][] =new JButton[4][5];
    	String data[][] = {
    		    {"7", "8", "9", "/", "sqrt"},
    		    {"4", "5", "6", "*", "%"},
    		    {"1", "2", "3", "-", "1/x"},
    		    {"0", "+/-", ".", "+", "="}
    		};
        for(int i=0; i<4; i++) {
        	for(int j=0; j<5; j++) {
        		btn[i][j] = new JButton(data[i][j]);
        		jp3.add(btn[i][j]);
        	}
        }
        
        ct.add(jp3, BorderLayout.SOUTH);
		
	}
}

public class GUI_Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GUICalculator gc = new GUICalculator();
		 gc.setTitle("Panel Test");
	     gc.setSize(480, 280);
	     gc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     gc.setVisible(true);
	}

}
