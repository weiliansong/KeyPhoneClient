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
	
	public ContactButton(String name, int[] phone_number) {
		contact_name = name;
		contact_number = phone_number;
		window = new TextWindow(name, phone_number);
		setText(contact_name + '\n' + contact_number);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
}
