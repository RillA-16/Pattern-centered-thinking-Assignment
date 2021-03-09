import javax.swing.JFrame;

public class GFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private GPanel panel;

	public GFrame() {
		// initialize attributes
		this.setLocation(200, 100);
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// initialize components
		this.panel = new GPanel();
		this.add(panel);
	}

}
