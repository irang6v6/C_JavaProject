import java.awt.*;
import javax.swing.*;

import javax.swing.*;

public class FlowLayoutEx extends JFrame {

	public FlowLayoutEx() {

		setTitle("GridLayoutEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel("나이"));
		c.add(new JTextField(""));
		c.add(new JLabel("학과"));
		c.add(new JTextField(""));
		c.add(new JLabel("학번"));
		c.add(new JTextField(""));

		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		FlowLayoutEx frame=new FlowLayoutEx();
	}

}
