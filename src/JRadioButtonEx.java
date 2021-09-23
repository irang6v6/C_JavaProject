import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class JRadioButtonEx extends JFrame{
	public JRadioButtonEx() {
		Container c=getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon icon=new ImageIcon("images/cherry.jpg");
		ImageIcon selectedIcon=new ImageIcon("images/selectedcherry.jpg");
		
		JRadioButton rb1=new JRadioButton("���");
		JRadioButton rb2=new JRadioButton("��");
		JRadioButton rb3=new JRadioButton("ü��",icon);
		rb3.setSelectedIcon(selectedIcon);
		rb3.setBorderPainted(true);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		
		c.add(rb1);
		c.add(rb2);
		c.add(rb3);

		
		setTitle("���� �����Ӹ����");
		setSize(320,240);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		JRadioButtonEx frame=new JRadioButtonEx();
	}

}
