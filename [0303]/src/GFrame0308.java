import javax.swing.JFrame;

public class GFrame0308 extends JFrame {
	private static final long serialVersionUID = 1L;

	private GPanel0308 panel;

	public GFrame0308() {
		// initialize attributes
		this.setLocation(200, 100);
		this.setSize(400, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// initialize components
		this.panel = new GPanel0308();
		this.add(panel);
	}

}
