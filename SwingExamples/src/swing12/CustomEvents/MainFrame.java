package swing12.CustomEvents;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private TextPanel textPanel;
	private Toolbar toolbar;
	private FormPanel formPanel;

	public MainFrame() {
		super("Hello World");

		setLayout(new BorderLayout());

		toolbar = new Toolbar();
		textPanel = new TextPanel();
		formPanel = new FormPanel();

		toolbar.setStringListener(new StringListener() {
			public void textEmitted(String text) {
				textPanel.appendText(text);
			}
		});

		formPanel.setFormListener(new FormListener() {
			public void formEventOccurred(FormEvent e) {
				String name = e.getName();
				String occupation = e.getOccupation();

				textPanel.appendText(name + ": " + occupation + "\n");
			}
		});

		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(formPanel, BorderLayout.WEST);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
