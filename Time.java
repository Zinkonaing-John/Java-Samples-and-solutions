package chapter02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Time extends JFrame implements ActionListener {
	
	JButton bb,bb1;
	JTextArea aa,aa1;
	JTextField jtl;
	Time(){
		
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		JPanel pt1 = new JPanel();
		
		JPanel pt2 = new JPanel();
		
		JPanel pt3 = new JPanel();
		
		JPanel pt4 = new JPanel();
		pt4.setLayout(new GridLayout(2,1,5,5));
		
		JLabel jl = new JLabel("당진의 생일을 공백으로 구분하여 입력(예:2000 02 11)");
		jtl = new JTextField(15);
		pt1.setLayout(new FlowLayout());
		pt1.add(jl);
		pt1.add(jtl);
		ct.add(pt1);
		
		
		
		bb = new JButton("현재");
		bb.addActionListener(this);
		aa = new JTextArea(4,30);
		pt2.add(bb);
		pt2.add(aa);
		
		
		bb1 = new JButton("100살");
		bb1.addActionListener(this);
		aa1 = new JTextArea(4,30);
		pt3.add(bb1);
		pt3.add(aa1);
		
		pt4.add(pt2);
		pt4.add(pt3);
		ct.add(pt4);
		
		
		setTitle("Date and Time");
		setVisible(true);
		setSize(400,300);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Time();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String input = jtl.getText();
		StringTokenizer st = new StringTokenizer(input);
		int first = Integer.parseInt(st.nextToken());
		int sec = Integer.parseInt(st.nextToken());
		int thir = Integer.parseInt(st.nextToken());
		
		
		if(e.getActionCommand().equals("현재")) {

		LocalDate date = LocalDate.of(first,sec, thir);
		aa.setText("당신의 생일 :"+date+"\n");
		aa.append("오늘 날짜는 :"+date.now()+"\n");
		aa.append("생일부터 오늘까지의 일 :"+date.until(date.now(),ChronoUnit.DAYS)+"\n");
		aa.append("생일부터 오늘까지의 년 : "+date.until(date.now(),ChronoUnit.YEARS)+"\n");
	}
		else if(e.getActionCommand().equals("100살")) {

			LocalDate date = LocalDate.of(first,sec,thir);
			aa1.setText("당신이 100이 되는 날른 :"+date.plusYears(100)+"\n");
			aa1.append("100산까지 남은 주(weeks)수 :"+date.now().until(date.plusYears(100), ChronoUnit.WEEKS)+"\n");
			aa1.append("100산까지 남은 일(days)수 :"+date.now().until(date.plusYears(100), ChronoUnit.DAYS)+"\n");
		}
	}
}