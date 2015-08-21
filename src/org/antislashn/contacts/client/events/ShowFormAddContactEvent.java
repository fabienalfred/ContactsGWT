package org.antislashn.contacts.client.events;

import com.google.gwt.event.shared.GwtEvent;

public class ShowFormAddContactEvent extends GwtEvent<ShowFormAddContactEventHandler> {
	public static Type<ShowFormAddContactEventHandler> TYPE = new Type<>();
	
	@Override
	public Type<ShowFormAddContactEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ShowFormAddContactEventHandler handler) {
		handler.showAddForm(this);
		
	}

}
