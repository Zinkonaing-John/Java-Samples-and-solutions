package chapter02;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class GUI2 extends JFrame {
	

	
	public GUI2() {
		
		Container ct = getContentPane();
		
		ct.setLayout(new GridLayout(4, 5 ,10 ,10));
		
		JButton btn[][] = new JButton[4][5];
		
		for (int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				btn[i][j] = new JButton("Button"+ (i+1));
				ct.add(btn[i][j]);
			}
			
		}
		
		
		
//		for (int i=0; i<4; i++) {
//			for(int j=0; j<5; j++) {
//				ct.add(btn[i][j]);
//			}
//		}
		
//		setTitle("Second GUI");
//		setSize(400,300);
//		setVisible(true);
		
		
		
	}
	
}

public class GUI02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GUI2 g = new GUI2();
		g.setTitle("Second GUI");
		g.setSize(400,300);
		g.setVisible(true);
	}

}
