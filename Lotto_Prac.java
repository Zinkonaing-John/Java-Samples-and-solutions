package chapter02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lotto_Prac extends JFrame implements ActionListener{
	
	JButton btn;
	JLabel jl;
	
	public Lotto_Prac() {
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		btn = new JButton("Lotto Clicker");
		jl = new JLabel("Click here SPP!");
		btn.addActionListener(this);
		
		ct.add(btn);
		ct.add(jl);
		
		
		setTitle("Lotto Generator");
		setSize(200,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lotto_Prac();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int lotto[] = new int[6];
		int i=0;
		a: while (i<6) {
			int rr = r.nextInt(45)+1;
			for(int j =0; j<=i; j++) {
				if(lotto[j]==rr) {
					continue a;
				}
			}
			lotto[i] = rr;
			i++;
		}
		Arrays.sort(lotto);
		jl.setText(Arrays.toString(lotto));
	}
}
