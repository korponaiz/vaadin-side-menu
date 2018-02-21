package com.zolee;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;

@Theme("valo")
public class View1 extends Composite implements View {

	public View1() {
		setCompositionRoot(new Label("This is View 1!"));
	}
	
}
