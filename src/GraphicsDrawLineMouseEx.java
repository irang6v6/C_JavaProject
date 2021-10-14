import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawLineMouseEx extends JFrame {

	private MyPanel panel=new MyPanel();

	public GraphicsDrawLineMouseEx() {

		setTitle("GraphicsDrawImageEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyPanel panel=new MyPanel();

		setContentPane(panel);

		setSize(400,600);
		setVisible(true);

	}

	class MyPanel extends JPanel{

		private Vector<Point> vStart=new Vector<Point>();
		private Vector<Point> vEnd=new Vector<Point>();

		public MyPanel() {
			this.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					vStart.add(e.getPoint());
				}
				public void mouseReleased(MouseEvent e) {
					vEnd.add(e.getPoint());
					repaint();
				}
				public void mouseDragged(MouseEvent e) {
					vEnd.add(e.getPoint());
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {

			super.paintComponent(g);

			for(int i=0;i<vStart.size();i++) {
				vStart.elementAt(i).getX();
				g.drawLine((int) vStart.elementAt(i).getX(), 
						(int) vStart.elementAt(i).getY(), 
						(int) vEnd.elementAt(i).getX(), 
						(int) vEnd.elementAt(i).getY());
			}
		}
	}

	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}

}
