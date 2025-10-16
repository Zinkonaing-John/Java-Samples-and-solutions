package chapter02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Event interface 붙이기 
//컴포넌트에 리스너 등록
//이벤트 처리 

//(1) GUI class 에 리스너 인터페이스를 붙이기 
//(2) 이번트 처리 클레스를 

class EventProcess implements ActionListener {
	
	JLabel jl;
	
	public EventProcess( JLabel jl) {
		this.jl = jl;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Button")) {
		jl.setText("잘 했습니다!");
		}
	}

}
class EventTest1 extends JFrame  {
	JLabel jl;
	boolean isTextVisible = false;
	
	public EventTest1() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Button");
		 jl = new JLabel("");
		
		btn.addActionListener(new EventProcess(jl));
		
		ct.add(btn);
		ct.add(jl);
		
		
		setTitle("Event Test1");
		setSize(200,200);
		setVisible(true);
		
	}

}

public class ActionEvent01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventTest1();
		
	}

}
