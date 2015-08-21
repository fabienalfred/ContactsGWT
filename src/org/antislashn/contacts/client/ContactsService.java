package org.antislashn.contacts.client;

import java.util.ArrayList;
import java.util.List;

public class ContactsService {
	private List<String> liste = new ArrayList<>();
	
	public ContactsService() {
		liste.add("Gaston");
		liste.add("Adèle");
		liste.add("Fernand");
	}
	
	public List<String> getAllContacts(){
		return liste;
	}
	
	public void addContact(String name){
		liste.add(name);
	}
}
