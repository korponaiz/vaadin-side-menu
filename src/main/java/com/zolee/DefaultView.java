package com.zolee;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;

@Theme("valo")
public class DefaultView extends Composite implements View {

	public DefaultView() {
		setCompositionRoot(new Label("This is DefaultView!"));
	}

}
