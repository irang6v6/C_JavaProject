import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AnonymousClassListenerEx extends JFrame {
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			JButton b=(JButton) e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else 
				b.setText("Action");
			AnonymousClassListenerEx.this.setTitle("내부 클래스");
		}
		
	}
	
	public AnonymousClassListenerEx() {
		
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.yellow);
		contentPane.setLayout(new FlowLayout());
		
		JButton btn=new JButton("Action");
		btn.addActionListener(new MyActionListener());
		contentPane.add(btn);
		
		JButton btn2=new JButton("Action");
		btn2.addActionListener(new MyActionListener());
		contentPane.add(btn2);


		setSize(640,480);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		AnonymousClassListenerEx frame=new AnonymousClassListenerEx();
	}

}


