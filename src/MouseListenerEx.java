import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class MouseListenerEx extends JFrame {
	JPanel contentPane=new JPanel();
	JLabel la;
	
	MouseListenerEx(){
		setTitle("마우스 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.addMouseListener(new MyMouseAdapter());
		
		la = new JLabel("Hello");
		la.setSize(50,20);
		la.setLocation(30,30);
		contentPane.add(la);
		setSize(200,200);
		setVisible(true);
	}
	
	class MyMouseAdapter extends MouseAdapterEx{
		public void mousePressed(MouseEvent e) {
			int x=e.getX();
			int y=e.getY();
			la.setLocation(x, y);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new MouseListenerEx();
	}
	
}


