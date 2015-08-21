package org.antislashn.contacts.client.views;

import java.util.List;

import org.antislashn.contacts.client.presenter.ShowAllContactsPresenter.Display;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class Liste extends Composite implements Display{

	private static ListeUiBinder uiBinder = GWT.create(ListeUiBinder.class);
	private List<String> liste;
	
	interface ListeUiBinder extends UiBinder<Widget, Liste> {
	}


	@UiField VerticalPanel table;
	@UiField Button addButton;

	public Liste() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void showContacts() {
		table.clear();
		for(String contact : liste){
			table.add(new Label(contact));
		}
		
	}

	@Override
	public void setContacts(List<String> contacts) {
		this.liste = contacts;
		showContacts();
	}

	@Override
	public HasClickHandlers getAddButton() {
		return addButton;
	}
	
	


}
