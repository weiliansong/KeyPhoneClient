package gui;

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
	}
	
	public void addNewContact(ContactButton contact) {
		contacts.add(contact);
	}
}
