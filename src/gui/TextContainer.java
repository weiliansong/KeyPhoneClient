package gui;

import javax.swing.JPanel;

public class TextContainer extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2448821272774629089L;
	
	public TextContainer(int width, int height) {
		setSize(width, height);
	}
	
	public void replaceWindow(TextWindow window) {
		removeAll();
		add(window);
	}
}
