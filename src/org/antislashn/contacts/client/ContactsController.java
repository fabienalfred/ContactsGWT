package org.antislashn.contacts.client;

import org.antislashn.contacts.client.events.ShowAllContactsEvent;
import org.antislashn.contacts.client.events.ShowAllContactsEventHandler;
import org.antislashn.contacts.client.events.ShowFormAddContactEvent;
import org.antislashn.contacts.client.events.ShowFormAddContactEventHandler;
import org.antislashn.contacts.client.presenter.AddContactFormPresenter;
import org.antislashn.contacts.client.presenter.Presenter;
import org.antislashn.contacts.client.presenter.ShowAllContactsPresenter;
import org.antislashn.contacts.client.views.Form;
import org.antislashn.contacts.client.views.Liste;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

public class ContactsController {
	private final HandlerManager eventBus;
	private HasWidgets container;
	private ContactsService service;
	
	public ContactsController(HandlerManager handlerManager, ContactsService service, HasWidgets container) {
		eventBus = handlerManager;
		this.container = container;
		this.service = service;
		bind();
	}

	private void bind() {
		eventBus.addHandler(ShowFormAddContactEvent.TYPE, new ShowFormAddContactEventHandler() {
			
			@Override
			public void showAddForm(ShowFormAddContactEvent event) {
				Presenter presenter = new AddContactFormPresenter(eventBus,service, new Form());
				presenter.go(container);				
			}
		});
		
		eventBus.addHandler(ShowAllContactsEvent.TYPE, new ShowAllContactsEventHandler() {
			
			@Override
			public void showAllContacts(ShowAllContactsEvent showAllContactsEvent) {
				Presenter presenter = new ShowAllContactsPresenter(eventBus,service,new Liste());
				presenter.go(container);
			}
		});
		
	}
	
	
}
