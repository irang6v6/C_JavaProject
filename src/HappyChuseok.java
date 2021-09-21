import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class HappyChuseok extends JFrame {
	JPanel contentPane=new JPanel();
	JPanel panel=new JPanel();
	JButton btn1;
	JButton btn2;
	JButton btn3;

	JLabel la;
	JLabel la2;

	HappyChuseok(){
		setTitle("해피추석");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(contentPane);
//		contentPane.setLayout(null);
		contentPane.addMouseListener(new MyMouseAdapter());
		
		btn1=new JButton("행복한");
		contentPane.add(btn1);
		btn1.setLocation(250,100);
		btn1.setSize(100,30);
		
		btn2=new JButton("한가위");
		contentPane.add(btn2);
		btn2.setLocation(350,100);
		btn2.setSize(100,30);
		
		btn3=new JButton("보내세요");
		contentPane.add(btn3);
		btn3.setLocation(450,100);
		btn3.setSize(100,30);
		
		JPanel panel =new JPanel();
		
		la = new JLabel("<html>|￣￣￣￣￣￣￣|\r<br>"
				+ "| 달토끼 입니다      |\r<br>"
				+ "|＿＿＿＿＿＿＿| \r<br>"
				+ "(\\__/) || \r<br>"
				+ "(ovo).|| \r<br>"
				+ "/ . . . .づ</html>");
		la.setSize(200,200);
		la.setLocation(30,30);
		la.setBackground(Color.yellow);
		contentPane.add(la);
		//panel.setBackground(Color.yellow);
		
		//contentPane.add(panel);
		

		setSize(400,300);
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
		new HappyChuseok();
	}

}


