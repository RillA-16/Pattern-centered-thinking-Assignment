

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class GToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;

	private JButton rectButton;
	private JButton ovalButton;
	private JButton lineButton;

	private String selectedButton;

	public GToolBar() {
		ActionHandler actionHandler = new ActionHandler();

		this.rectButton = new JButton(new ImageIcon("네모.png"));
		this.rectButton.setPressedIcon(new ImageIcon("네모눌림.png"));
		this.rectButton.addActionListener(actionHandler);
		this.add(this.rectButton);

		this.ovalButton = new JButton(new ImageIcon("동그라미.png"));
		this.ovalButton.setPressedIcon(new ImageIcon("동그눌림.png"));
		this.ovalButton.addActionListener(actionHandler);
		this.add(this.ovalButton);

		this.lineButton = new JButton(new ImageIcon("선.png"));
		this.lineButton.setPressedIcon(new ImageIcon("직선눌림.png"));
		this.lineButton.addActionListener(actionHandler);
		this.add(this.lineButton);
	}

	private class ActionHandler implements ActionListener {
		private GPanel panel = new GPanel();

		public void actionPerformed(ActionEvent event) {
			if (event.getSource().equals(rectButton)) {
				selectedButton = "rectBtutton";
				System.out.println(selectedButton);
				panel.receive(selectedButton);
			} else if (event.getSource().equals(ovalButton)) {
				selectedButton = "ovalButton";
				System.out.println(selectedButton);
				panel.receive(selectedButton);
			} else if (event.getSource().equals(lineButton)) {
				selectedButton = "lineButton";
				System.out.println(selectedButton);
				panel.receive(selectedButton);
			}
		}
	}
}
