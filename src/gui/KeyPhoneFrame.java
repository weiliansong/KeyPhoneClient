package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyPhoneFrame extends JFrame {

	private static final long serialVersionUID = -3576179975881750942L;
	private static final int WIDTH = 400;
	private static final int HEIGHT = 200;
	private static final int CONSOLE_WIDTH = 200;
	private static final int CONSOLE_LENGTH = 400;
	private static final int TEXT_WIDTH = 200;
	private static final int TEXT_LENGTH = 400;
	
	private static JPanel text_panel;
	private static JTextField text_field;
	private static JButton connect_button;
	private static JTextArea text_area;
	private static Console console;
	
	public KeyPhoneFrame() {
		super("KeyPhone");
		
		setSize(WIDTH, HEIGHT);
		setMinimumSize(new Dimension(WIDTH, HEIGHT));
		setResizable(false);
		setLayout(new GridLayout(1, 2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setUpTextWindow();
		setUpConsoleWindow();
		
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	private void setUpTextWindow() {
		text_panel = new JPanel();
		text_panel.setLayout(new BorderLayout());
		connect_button = new JButton("Connect");
		text_field = new JTextField(15);
		text_area = new JTextArea();
		text_area.setEditable(false);
		text_area.setLineWrap(false);
		
		text_panel.add(text_area, BorderLayout.NORTH);
		text_panel.add(text_field, BorderLayout.CENTER);
		text_panel.add(connect_button, BorderLayout.SOUTH);
	
		add(text_panel);
	}
	
	private void setUpConsoleWindow() {
		console = new Console(CONSOLE_WIDTH, CONSOLE_LENGTH);
		
		add(console);
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
