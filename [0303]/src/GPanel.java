

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JPanel;

public class GPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private GMouseHandler mouseHandler;
	private GToolBar toolBar;
	private static String selectedButton = "rectButton";

	public GPanel() {
		this.mouseHandler = new GMouseHandler();

		this.addMouseListener(this.mouseHandler);
		this.addMouseMotionListener(this.mouseHandler);
		this.addMouseWheelListener(this.mouseHandler);
	}

	public void paint(Graphics graphics) {
//		graphics.drawRect(10, 10, 20, 20);
	}

	public void receive(String selectedButton) {
		this.selectedButton = selectedButton;

		this.mouseHandler = new GMouseHandler();
		this.mouseHandler.receive2(selectedButton);
	}

	private class GMouseHandler implements MouseListener, MouseMotionListener, MouseWheelListener {

		private int x0, x1, y0, y1;

		public void receive2(String selectedButton1) {
			selectedButton = selectedButton1;
		}

		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
		}

		@Override
		public void mouseDragged(MouseEvent e) {

			Graphics2D g2D = (Graphics2D) getGraphics();

			// exclusive or mode
			g2D.setXORMode(getBackground());

			// erase
			if (selectedButton.equals("rectButton")) {
				g2D.drawRect(x0, y0, x1 - x0, y1 - y0);

				// new point
				x1 = e.getX();
				y1 = e.getY();
				// darw
				g2D.drawRect(x0, y0, x1 - x0, y1 - y0);

			} else if (selectedButton.equals("ovalButton")) {
				g2D.drawOval(x0, y0, x1 - x0, y1 - y0);

				// new point
				x1 = e.getX();
				y1 = e.getY();

				// darw
				g2D.drawOval(x0, y0, x1 - x0, y1 - y0);
			} else if (selectedButton.equals("lineButton")) {
				g2D.drawLine(x0, y0, x1, y1);

				// new point
				x1 = e.getX();
				y1 = e.getY();

				// darw
				g2D.drawLine(x0, y0, x1, y1);
			}
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
