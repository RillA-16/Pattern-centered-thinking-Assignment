

import javax.swing.JFrame;

public class GFrame0310 extends JFrame {
	private static final long serialVersionUID = 1L;

	private GPanel0310 panel;

	public GFrame0310() {
		// initialize attributes
		this.setLocation(200, 100);
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// initialize components
		this.panel = new GPanel0310();
		this.add(panel);
	}

}
