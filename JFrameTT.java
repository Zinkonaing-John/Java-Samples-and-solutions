package chapter02;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
 public class JFrameTT extends JFrame {
    public JFrameTT() {
        JPanel pt, pb;
        JPanel pt1, pt2, pt3;
        JPanel pb1, pb2;

        getContentPane().setLayout(new GridLayout(2, 1));

      
        pt = new JPanel();
        pt.setLayout(new GridLayout(1, 3));

       
        pt1 = new JPanel();
        pt1.setLayout(new GridLayout(3, 1));
        JCheckBox red = new JCheckBox("Red", true);
        JCheckBox green = new JCheckBox("Green", false);
        JCheckBox blue = new JCheckBox("Blue", false);
        pt1.add(red);
        pt1.add(green);
        pt1.add(blue);

       
        pt2 = new JPanel();
        pt2.setLayout(new GridLayout(3, 1));
        JRadioButton jr1 = new JRadioButton("A형");
        JRadioButton jr2 = new JRadioButton("B형");
        JRadioButton jr3 = new JRadioButton("O형");

      
        ButtonGroup group = new ButtonGroup();
        group.add(jr1);
        group.add(jr2);
        group.add(jr3);

        pt2.add(jr1);
        pt2.add(jr2);
        pt2.add(jr3);

       
        pt3 = new JPanel();
        pt3.setLayout(new FlowLayout());
        JButton bt1 = new JButton("선  택");
        JButton bt2 = new JButton("취  소");
        pt3.add(bt1);
        pt3.add(bt2);

        pt.add(pt1);
        pt.add(pt2);
        pt.add(pt3);

       
        pb = new JPanel();
        pb.setLayout(new GridLayout(1, 2));

        pb1 = new JPanel();
        JTextArea ta = new JTextArea("자료입력공간", 5, 30);
        pb1.add(ta);

        pb2 = new JPanel();
        JComboBox jcb = new JComboBox();
        jcb.addItem("1구간 지역");
        jcb.addItem("2구간 지역");
        jcb.addItem("3구간 지역");
        jcb.addItem("4구간 지역");
        jcb.addItem("5구간 지역");
        pb2.add(jcb);

        pb.add(pb1);
        pb.add(pb2);

       
        add(pt);
        add(pb);
    }

    public static void main(String[] args) {
        JFrameTT jpt = new JFrameTT();
        jpt.setTitle("Panel Test");
        jpt.setSize(480, 280);
        jpt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jpt.setVisible(true);
    }
}
