package chapter02;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class GUI extends JFrame { //window 
	
	public GUI() {
		
		Container ct = getContentPane();
		
		ct.setLayout(new BorderLayout(10 , 10));
		
		JButton btn1 = new JButton("Up ");
		JButton btn2 = new JButton("Down");
		JButton btn3 = new JButton("Middle");
		JButton btn4 = new JButton("Right");
		JButton btn5 = new JButton("Left");
		
		JRadioButton rb = new JRadioButton("버튼 3");
		
		ct.add(btn1, BorderLayout.NORTH);
		ct.add(btn2, BorderLayout.SOUTH);
		ct.add(btn3, BorderLayout.CENTER);
		ct.add(btn4, BorderLayout.EAST);
		ct.add(btn5, BorderLayout.WEST);
		
		
		
		
		
		
		setTitle("First GUI Programme");
		setSize(400,300);
		setVisible(true);
		
	}
	
}

public class GUI01 {

	public static void main(String[] args) {
		
		GUI g = new GUI();

	}

}
