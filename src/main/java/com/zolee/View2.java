package com.zolee;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;

@Theme("valo")
public class View2 extends Composite implements View {

	public View2() {
		setCompositionRoot(new Label("This is View 2!"));
	}
	
}
