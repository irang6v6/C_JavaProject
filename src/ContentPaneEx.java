import java.awt.*;

import javax.swing.*;

public class ContentPaneEx extends JFrame {
	
	public ContentPaneEx() {
		
		setTitle("ContentPane°ú JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.yellow);
		contentPane.setLayout(new FlowLayout());
		
		JButton btn=new JButton("OK");
		contentPane.add(btn);
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));


		setSize(640,480);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ContentPaneEx frame=new ContentPaneEx();
	}

}
