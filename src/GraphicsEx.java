import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsEx extends JFrame {
	
	public GraphicsEx() {
		
		setTitle("GraphicsEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyPanel panel=new MyPanel();
		
		setContentPane(panel);
		
		setSize(400,600);
		setVisible(true);
		
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.drawRect(10, 10, 50, 50);
			g.setFont(new Font("Consolas",Font.BOLD,20));
			g.drawString("graphical string", 50, 50);
			g.setFont(new Font("courier new",Font.BOLD,20));
			g.drawString("graphical string", 70, 70);
			g.setColor(new Color(0x0000000));
			g.drawLine(0,0,400,600);
			
			g.setColor(Color.red);
			g.drawOval(100, 150, 40, 40);
			g.setColor(Color.yellow);
			g.fillOval(150, 150, 40, 40);
			g.setColor(Color.red);
			g.drawOval(200, 150, 40, 40);
			g.setColor(Color.yellow);
			g.fillOval(200, 150, 40, 40);
			
			g.fillArc(100, 250, 200, 200, 0, 90);
			g.fillArc(100, 350, 200, 200, 90, -90);
			
			
			int[] x= {50,30,50,70};
			int[] y= {50,100,150,100};
			g.setColor(Color.green);
			g.fillPolygon(x, y, 4);
			
		}
	}
	
	public static void main(String[] args) {
		new GraphicsEx();
	}

}
