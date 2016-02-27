package gui;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TextWindow extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8678840278065480426L;
	private ArrayList<String> received;
	private ArrayList<String> sent;
	private String contact_name;
	private int[] contact_number;
	private JPanel text_area;
	private JTextField text_field;
	private int msg_width;
	private int msg_length;
	
	public TextWindow(String name, int[] phone_number, int width, int length) {
		contact_name   = name;
		contact_number = phone_number;
		
		msg_width  = width;
		msg_length = length;
		
		received   = new ArrayList<String>();
		sent       = new ArrayList<String>();
		text_field = new JTextField(20);
		text_area  = new JPanel();
		
		setLayout(new BorderLayout());
		
		BoxLayout layout = new BoxLayout(text_area, BoxLayout.Y_AXIS);
		text_area.setLayout(layout);
		text_area.setSize(new Dimension(msg_width-10, msg_length-10));
		text_area.setAutoscrolls(true);
		text_area.add(new JTextArea("You can start typing now! :)"));
		//text_area.setLayout();
		
		JScrollPane scroll_pane = new JScrollPane();
		scroll_pane.setSize(new Dimension(msg_width, msg_length));
		scroll_pane.add(text_area);
		
		text_field.addActionListener(this);
		
		add(text_area, BorderLayout.NORTH);
		add(text_field, BorderLayout.SOUTH);
		
		validate();
		repaint();
	}
	
	public void addReceivedMsg(String msg) {
		
	}
	
	private void addSentMsg(String msg) {
		JTextArea curr_msg = new JTextArea(1, 60);
		curr_msg.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		curr_msg.append(msg);
		curr_msg.setSize(msg_width, msg_length);
		sent.add(msg);
		text_area.add(curr_msg);
		
		validate();
		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String curr_msg = text_field.getText();
		
		// Initiate socket connection, but maybe in TextContainer
		
		addSentMsg(curr_msg);
	}
}
