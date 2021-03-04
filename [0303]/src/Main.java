import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {

	Main() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		RectPanel panel = new RectPanel();

		this.add(panel, BorderLayout.CENTER);
		this.setLocationRelativeTo(null);
		this.setSize(500, 500);
		this.setVisible(true);
	}

	class RectPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.black);
			g.drawRect(50, 50, 100, 100);

		}
	}

	public static void main(String[] args) {
		new Main();
	}
}
