package org.antislashn.contacts.client.presenter;

import org.antislashn.contacts.client.ContactsService;
import org.antislashn.contacts.client.events.ShowAllContactsEvent;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public class AddContactFormPresenter implements Presenter{
	public interface Display{
		HasClickHandlers getEnregistrementButton();
		String getName();
		Widget asWidget();
	}
	
	private Display display;
	private HandlerManager eventBus;
	ContactsService service;
	
	public AddContactFormPresenter(HandlerManager eventBus, ContactsService service, Display form) {
		this.eventBus = eventBus;
		display = form;
		this.service = service;
	}

	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(display.asWidget());
		bind();
	}

	private void bind() {
		display.getEnregistrementButton().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				String nom = display.getName();
				service.addContact(nom);
				eventBus.fireEvent(new ShowAllContactsEvent());
			}
		});
		
	}

}
