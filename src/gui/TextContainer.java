package gui;

import java.awt.Dimension;

import javax.swing.JPanel;

public class TextContainer extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2448821272774629089L;
	
	public TextContainer(int width, int height) {
		setMinimumSize(new Dimension(WIDTH, HEIGHT));

		setVisible(true);
	}
	
	public void replaceWindow(TextWindow window) {
		removeAll();
		add(window);
		
		validate();
		repaint();
	}
}
