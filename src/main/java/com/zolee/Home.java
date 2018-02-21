package com.zolee;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;

@Theme("valo")
public class Home extends Composite implements View {

	public Home() {
		setCompositionRoot(new Label("This is DefaultView!"));
	}
}
