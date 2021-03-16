

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

		this.rectButton = new JButton(new ImageIcon("�׸�.png"));
		this.rectButton.setPressedIcon(new ImageIcon("�׸𴭸�.png"));
		this.rectButton.addActionListener(actionHandler);
		this.add(this.rectButton);

		this.ovalButton = new JButton(new ImageIcon("���׶��.png"));
		this.ovalButton.setPressedIcon(new ImageIcon("���״���.png"));
		this.ovalButton.addActionListener(actionHandler);
		this.add(this.ovalButton);

		this.lineButton = new JButton(new ImageIcon("��.png"));
		this.lineButton.setPressedIcon(new ImageIcon("��������.png"));
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
