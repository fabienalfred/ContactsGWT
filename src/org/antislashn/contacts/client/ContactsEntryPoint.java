package org.antislashn.contacts.client;

import org.antislashn.contacts.client.events.ShowAllContactsEvent;
import org.antislashn.contacts.client.events.ShowFormAddContactEvent;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.RootPanel;

public class ContactsEntryPoint implements EntryPoint {
	private static final ContactsService service = new ContactsService();
	
	@Override
	public void onModuleLoad() {
		HandlerManager eventBus = new HandlerManager(null);
		ContactsController controller = new ContactsController(eventBus, service, RootPanel.get("main"));
		eventBus.fireEvent(new ShowFormAddContactEvent());
	}


}
