package gui;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SideBar extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8544722276131365812L;
	private ArrayList<ContactButton> contacts;
	
	public SideBar(int width, int length) {
		contacts = new ArrayList<ContactButton>();
		setSize(width, length);
		setLayout(new FlowLayout());
	}
	
	public void addNewContact(ContactButton contact) {
		contacts.add(contact);
		updateContact();
	}
	
	private void updateContact() {
		for(ContactButton contact : contacts) {
			add(contact);
		}
	}
}
