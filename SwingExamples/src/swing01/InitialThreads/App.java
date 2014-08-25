package swing01.InitialThreads;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {

		// Causes Runnable class's run() to be executed asynchronously on the
		// AWT event
		// dispatching thread.
		// Why does not the initial thread simply create the GUI itself? Because
		// almost all code that creates or interacts with Swing components must
		// run on the event dispatch thread.
		// Because the thread "main" started by VM is not the event dispatch
		// thread.
		// Some Swing component methods are labelled "thread safe" in the API
		// specification; these can be safely invoked from any thread. All other
		// Swing component methods must be invoked from the event dispatch
		// thread. Programs that ignore this rule may function correctly most of
		// the time, but are subject to unpredictable errors that are difficult
		// to reproduce.
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				JFrame frame = new JFrame("Hello World");

				// 设置窗口的大小
				frame.setSize(600, 500);
				// 设置点关闭的行为为程序退出
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				// 使JFrame可见
				frame.setVisible(true);
			}
		});

	}

}
