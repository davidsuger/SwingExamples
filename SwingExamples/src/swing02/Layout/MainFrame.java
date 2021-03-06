package swing02.Layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MainFrame extends JFrame {

	private JButton btn;
	private JTextArea textArea;

	public MainFrame() {
		super("Hello World");

		setLayout(new BorderLayout());

		btn = new JButton("Click Me");
		textArea = new JTextArea();

		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
