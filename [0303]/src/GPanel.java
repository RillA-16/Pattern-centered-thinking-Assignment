

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JPanel;

public class GPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private GMouseHandler mouseHandler;

	public GPanel() {
		this.mouseHandler = new GMouseHandler();
		this.addMouseListener(this.mouseHandler);
		this.addMouseMotionListener(this.mouseHandler);
		this.addMouseWheelListener(this.mouseHandler);
	}

	public void paint(Graphics graphics) {
//		graphics.drawRect(10, 10, 20, 20);
	}

	private class GMouseHandler implements MouseListener, MouseMotionListener, MouseWheelListener {

		private int x0, x1, x2, y0, y1, y2;

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseDragged(MouseEvent e) {
			Graphics g = getGraphics();
			x2 = e.getX();
			y2 = e.getY();

			g.drawRect(x0, y0, x2 - x0, y2 - y0);
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			x0 = e.getX();
			y0 = e.getY();
			x1 = x0;
			y1 = y0;
			x2 = x1;
			y2 = y1;

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}
}
