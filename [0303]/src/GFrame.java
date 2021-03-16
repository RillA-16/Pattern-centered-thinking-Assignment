

import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public class GFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private GPanel panel;
	private GToolBar toolBar;

	public GFrame() {
		// initialize attributes
		this.setLocation(200, 100);
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// initialize components
		BorderLayout layoutManager = new BorderLayout();
		this.getContentPane().setLayout(layoutManager);

		this.toolBar = new GToolBar();
		this.getContentPane().add(this.toolBar, BorderLayout.NORTH);
		this.panel = new GPanel();
		this.getContentPane().add(panel, BorderLayout.CENTER);
	}

}
