import java.awt.*;
import javax.swing.*;

import javax.swing.*;

public class FlowLayoutEx extends JFrame {

	public FlowLayoutEx() {

		setTitle("GridLayoutEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel("����"));
		c.add(new JTextField(""));
		c.add(new JLabel("�а�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�й�"));
		c.add(new JTextField(""));

		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		FlowLayoutEx frame=new FlowLayoutEx();
	}

}
