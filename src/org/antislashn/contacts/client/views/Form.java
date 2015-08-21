package org.antislashn.contacts.client.views;

import org.antislashn.contacts.client.ContactsEntryPoint;
import org.antislashn.contacts.client.presenter.AddContactFormPresenter.Display;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class Form extends Composite implements 	Display {

	private static FormUiBinder uiBinder = GWT.create(FormUiBinder.class);

	interface FormUiBinder extends UiBinder<Widget, Form> {
	}

	
	@UiField Button button;
	@UiField TextBox nom;

	public Form(ContactsEntryPoint contactsEntryPoint) {
		initWidget(uiBinder.createAndBindUi(this));

	}

	public Form() {
		initWidget(uiBinder.createAndBindUi(this));
	}


	@Override
	public HasClickHandlers getEnregistrementButton() {
		return button;
	}

	@Override
	public String getName() {
		return nom.getText();
	}

}
