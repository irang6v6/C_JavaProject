import javax.swing.*;
public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("스윙 프레임만들기");
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MyFrame frame=new MyFrame();
	}

}
