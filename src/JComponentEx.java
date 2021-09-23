import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class JComponentEx extends JFrame{
	public JComponentEx() {
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton b1=new JButton("btn1");
		JButton b2=new JButton("btn2");
		JButton b3=new JButton("btn3");
		
		b1.setBackground(Color.YELLOW);
		b1.setForeground(Color.RED);
		
		b2.setEnabled(false);
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JButton b=(JButton) e.getSource();
				JComponentEx frame=(JComponentEx) b.getTopLevelAncestor();
				frame.setTitle(b.getX()+","+b.getY());
			}
			
		});
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		
		setTitle("스윙 프레임만들기");
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		JComponentEx frame=new JComponentEx();
	}

}
