import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class GPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	Point startP = null;
	Point endP = null;

	public GPanel() {
		this.addMouseListener(new MouseListener());
	}

	class MouseListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			startP = e.getPoint();
		}

		public void mouseReleased(MouseEvent e) {
			endP = e.getPoint(); 
			Graphics g = getGraphics();
			g.drawRect(startP.x, startP.y, endP.x, endP.y);
		}
	}

//	public void paint(Graphics graphics) {
//		graphics.drawRect(10, 10, 20, 20);
	
//	}
}
