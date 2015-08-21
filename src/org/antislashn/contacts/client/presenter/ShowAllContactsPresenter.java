package org.antislashn.contacts.client.presenter;

import java.util.List;

import org.antislashn.contacts.client.ContactsService;
import org.antislashn.contacts.client.events.ShowFormAddContactEvent;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public class ShowAllContactsPresenter implements Presenter {
	
	public interface Display{
		void setContacts(List<String> contacts);
		HasClickHandlers getAddButton();
		Widget asWidget();
	}
	
	private Display display;
	private HandlerManager eventBus;
	private ContactsService service;
	
	public ShowAllContactsPresenter(HandlerManager eventBus,ContactsService service,Display display){
		this.display = display;
		this.eventBus = eventBus;
		this.service = service;
		bind();
	}
	
	private void bind() {
		display.getAddButton().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new ShowFormAddContactEvent());
				
			}
		});
		
	}

	@Override
	public void go(HasWidgets container) {
		display.setContacts(service.getAllContacts());
		container.clear();
		container.add(display.asWidget());
	}

}
