import java.awt.*;
import javax.swing.*;

import javax.swing.*;

public class NullContainerEx extends JFrame {

	public NullContainerEx() {

		setTitle("NullContainerEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		
		JLabel la=new JLabel("Hello");
		la.setLocation(150,10);
		la.setSize(200,50);
		c.add(la);
	
		//�迭 ó���ϸ� ��ư �ϴϾ� ���������� ���� ���� 
		for(int i=0;i<10;i++) {
			JButton b=new JButton(Integer.toString(i));
		b.setLocation(15*i,15*i);
		b.setSize(50,20);
		c.add(b);
		}
		

		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		NullContainerEx frame=new NullContainerEx();
	}

}
