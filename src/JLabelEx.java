import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class JLabelEx extends JFrame{
	public JLabelEx() {
		Container c=getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon normalIcon=new ImageIcon("images/normalIcon.gif");
		ImageIcon pressedIcon=new ImageIcon("images/pressedIcon.gif");
		ImageIcon rolloverIcon=new ImageIcon("images/rolloverIcon.gif");

		JLabel ja1=new JLabel("Love");
		JLabel ja2=new JLabel(new ImageIcon("images/beauty.jpg"));
		JLabel ja3=new JLabel("Call me call me",normalIcon,SwingConstants.CENTER);

		c.add(ja1);
		c.add(ja2);
		c.add(ja3);

		JButton btn=new JButton("call",normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);

		setTitle("스윙 프레임만들기");
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		JLabelEx frame=new JLabelEx();
	}

}
