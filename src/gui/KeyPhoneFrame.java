package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import networking.Server;

public class KeyPhoneFrame extends JFrame {

	private static final long serialVersionUID = -3576179975881750942L;
	private static final int WIDTH = 900;
	private static final int HEIGHT = 600;
	private static final int TEXT_WINDOW_WIDTH = 600;
	private static final int TEXT_WINDOW_LENGTH = 600;
	private static final int SIDE_BAR_WIDTH = 600;
	private static final int SIDE_BAR_LENGTH = 300;
	
	private SideBar side_bar;
	private static TextContainer text_container;
	
	public KeyPhoneFrame() {
		super("KeyPhone");
		
		setSize(WIDTH, HEIGHT);
		setMinimumSize(new Dimension(WIDTH, HEIGHT));
		setResizable(false);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setUpTextWindow();
		int[] test = {111, 111, 1111};
//		side_bar.addNewContact(new ContactButton("John Smith", test, TEXT_WINDOW_WIDTH, TEXT_WINDOW_LENGTH));
		
		setVisible(true);
		setLocationRelativeTo(null);
		
		try {
			(new Thread(new Server(10000))).start();	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void setUpTextWindow() {
		side_bar = new SideBar(SIDE_BAR_WIDTH, SIDE_BAR_LENGTH);
		text_container = new TextContainer(TEXT_WINDOW_WIDTH, TEXT_WINDOW_LENGTH);
		
		add(side_bar, BorderLayout.WEST);
		add(new JSeparator(SwingConstants.VERTICAL));
		add(text_container, BorderLayout.EAST);
	}
	
	public static void changeTextWindow(TextWindow window) {
		text_container.replaceWindow(window);
	}
	
//	private void windowListener() {
//		this.addWindowFocusListener(new WindowFocusListener() {
//
//			@Override
//			public void windowGainedFocus(WindowEvent arg0) {
//				text_area.append("Window gained focus\n");
//			}
//
//			@Override
//			public void windowLostFocus(WindowEvent arg0) {
//				text_area.append("Window lost focus\n");
//			}
//			
//		});
//	}
}
