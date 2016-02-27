package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ContactButton extends JButton implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4095320169927157015L;
	private TextWindow window;
	private String contact_name;
	private int[] contact_number;
	
	public ContactButton(String name, int[] phone_number, int width, int length) {
		contact_name = name;
		contact_number = phone_number;
		window = new TextWindow(name, phone_number, width, length);
		setText(contact_name + " " + contact_number[0] + "-" + contact_number[1] + "-" + contact_number[2]);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		KeyPhoneFrame.changeTextWindow(window);
	}
}
