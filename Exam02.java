package chapter02;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Exam02 extends JFrame implements ActionListener{
	
	JLabel jl1, jl2 ;
	JButton btn1,btn2;
	JTextArea jta;
	JPanel jp1,jp2,jp3;
	
	public Exam02() {
		
		Container ct= getContentPane();
		ct.setLayout(new BorderLayout());
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		
		jl1 = new JLabel("date : 2023-04-21");
		jl1.setEnabled(false);
		jp1.add(jl1);
		
		
		btn1 = new JButton("Print");
		jta = new JTextArea(11,30);
		btn1.addActionListener(this);
		jp2.add(btn1);
		jp2.add(jta);
		
		
		btn2 = new JButton("Save");
		jl2 = new JLabel("Heee");
		btn2.addActionListener(this);
		jp3.add(btn2);
		jp3.add(jl2);
		
		
		ct.add(jp1, BorderLayout.NORTH);
		ct.add(jp2, BorderLayout.CENTER);
		ct.add(jp3, BorderLayout.SOUTH);
		
		
		
		setTitle("Lotto Number Generator");
		setSize(500,400);
		setVisible(true);
		
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
			new Exam02 ();
	}

	@Override
	public void actionPerformed(ActionEvent e){
		// TODO Auto-generated method stub
		
		if(e.getActionCommand().equals("Print")) {
			
			int i=0;
			
			Random r = new Random();
			
			int number[] = new int[6];
			
				a: while(i<6) {
					
					int tempNo = r.nextInt(45) +1;
					
					for(int j=0; j<i; j++) {
						
						if(number[j]== tempNo) {
							continue a;
						}
						
						
					}
					number[i] = tempNo;
					i++;
					
					
				}
				Arrays.sort(number);
				
				jta.append(Arrays.toString(number)+"\n");
      }
				
				
		 
			
		
		if(e.getActionCommand().equals("Save")) {
			
			
			String s = jta.getText();
			try {
				FileOutputStream fos = new FileOutputStream(s);
				DataOutputStream dos = new DataOutputStream(fos);
				
				try {
					dos.writeUTF(jta.getText());
					
					dos.close();
					fos.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
