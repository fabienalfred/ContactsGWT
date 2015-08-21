package org.antislashn.contacts.client.views;

import org.antislashn.contacts.client.ContactsEntryPoint;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class Menu extends Composite{

	private static MenuUiBinder uiBinder = GWT.create(MenuUiBinder.class);
	private ContactsEntryPoint entryPoint;

	interface MenuUiBinder extends UiBinder<Widget, Menu> {
	}

	public Menu(ContactsEntryPoint contactsEntryPoint) {
		initWidget(uiBinder.createAndBindUi(this));
		this.entryPoint = contactsEntryPoint;
	}

	@UiField Button lister;
	@UiField Button ajouter;


	

}
