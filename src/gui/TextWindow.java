package gui;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextWindow extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8678840278065480426L;
	private ArrayList<String> received;
	private ArrayList<String> sent;
	private String contact_name;
	private int[] contact_number;
	private JScrollPane text_area;
	private JTextField text_field;
	
	public TextWindow(String name, int[] phone_number, int width, int length) {
		contact_name = name;
		contact_number = phone_number;
		
		received = new ArrayList<String>();
		sent = new ArrayList<String>();
		
		setLayout(new BorderLayout());
		
		text_area = new JScrollPane();
		text_area.setSize(width, length);
		text_area.setAutoscrolls(true);
		
		text_field = new JTextField();
		text_field.addActionListener(this);
		
		add(text_area, BorderLayout.NORTH);
		add(text_field, BorderLayout.SOUTH);
	}
	
	public void addReceivedMsg(String msg) {
		
	}
	
	private void addSentMsg(String msg) {
		JTextArea curr_msg = new JTextArea();
		curr_msg.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		sent.add(msg);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String curr_msg = text_field.getText();
		
		// Initiate socket connection, but maybe in TextContainer
		
		addSentMsg(curr_msg);
	}
}
