import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawingEx extends JFrame {
	
	public GraphicsDrawingEx() {
		
		setTitle("GraphicsDrawImageEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel panel=new MyPanel();
		
		setContentPane(panel);
		
		setSize(400,600);
		setVisible(true);
		
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			ImageIcon icon=new ImageIcon("images/mango.jpg");
			Image image=icon.getImage();
			g.setClip(100,20,150,150);
			g.drawImage(image, 0,0,this.getWidth(),this.getHeight(), this);
			
		}
	}
	
	public static void main(String[] args) {
		new GraphicsDrawingEx();
	}

}
