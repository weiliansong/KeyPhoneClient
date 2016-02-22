package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextWindow extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8678840278065480426L;
	private String[] received;
	private String[] sent;
	private String contact_name;
	private int[] contact_number;
	private JTextArea text_area;
	private JTextField text_field;
	
	public TextWindow(String name, int[] phone_number) {
		contact_name = name;
		contact_number = phone_number;
		
		setLayout(new BorderLayout());
		
		text_area = new JTextArea();
		text_area.setEditable(false);
		text_area.setLineWrap(true);
		text_area.setAutoscrolls(true);
		
		text_field.addActionListener(this);
		
		add(text_area, BorderLayout.NORTH);
		add(text_field, BorderLayout.SOUTH);
	}
	
	public void addReceivedMsg(String msg) {
		
	}
	
	private void addSentMsg(String msg) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String curr_msg = text_field.getText();
		
		// Initiate socket connection, but maybe in TextContainer
		
		addSentMsg(curr_msg);
	}
}
