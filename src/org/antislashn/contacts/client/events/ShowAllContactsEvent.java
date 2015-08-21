package org.antislashn.contacts.client.events;

import com.google.gwt.event.shared.GwtEvent;

public class ShowAllContactsEvent extends GwtEvent<ShowAllContactsEventHandler> {
	public static Type<ShowAllContactsEventHandler> TYPE = new Type<>();
	
	@Override
	public Type<ShowAllContactsEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ShowAllContactsEventHandler handler) {
		handler.showAllContacts(this);
		
	}

}
