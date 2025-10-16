package chapter02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class EventTest2 extends JFrame implements ActionListener {
	JLabel jl;
	boolean isTextVisible = false;
	
	public EventTest2() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Love You");
		JButton btn2 = new JButton("Congrats");
		 jl = new JLabel("");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		ct.add(btn1);
		ct.add(btn2);
		ct.add(jl);
		
		
		setTitle("Event Test1");
		setSize(250,150);
		setVisible(true);
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Love You")) {
		jl.setText("Love You");
		}
		else{
			jl.setText("Congrats");
	}
}
}

public class ActonEvent02 {

	public static void main(String[] args) {
		
		new EventTest2();
	}
}




