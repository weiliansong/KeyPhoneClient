package gui;

import java.util.ArrayList;
import javax.swing.JPanel;

public class TextContainer extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2448821272774629089L;
	private ArrayList<TextWindow> windows;
	
	public TextContainer(int width, int height) {
		setSize(width, height);
		windows = new ArrayList<TextWindow>();
		int[] test_num = {111,111,1111};
		windows.add(new TextWindow("Flo", test_num));
	}
}
