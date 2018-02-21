package com.zolee;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.PushStateNavigation;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;

@SpringUI
@Theme("valo")
@PushStateNavigation
public class MainUI extends UI{

	@Override
	protected void init(VaadinRequest request) {
		Label title = new Label("Menu");
		title.addStyleName(ValoTheme.MENU_TITLE);
		
		Button homeButton = new Button("Home", e -> getNavigator().navigateTo("home"));
		homeButton.addStyleNames(ValoTheme.BUTTON_LINK, ValoTheme.MENU_ITEM);
		Button view1 = new Button("View 1", e -> getNavigator().navigateTo("view1"));
		view1.addStyleNames(ValoTheme.BUTTON_LINK,  ValoTheme.MENU_ITEM);
		Button view2 = new Button("View 2", e -> getNavigator().navigateTo("view2"));
		view2.addStyleNames(ValoTheme.BUTTON_LINK, ValoTheme.MENU_ITEM);
		
		CssLayout menu = new CssLayout(title, homeButton, view1, view2);
		menu.addStyleName(ValoTheme.MENU_ROOT);
		
		CssLayout viewContainer = new CssLayout();
		HorizontalLayout mainLayout = new HorizontalLayout(menu, viewContainer);
		
		mainLayout.setSizeFull();
		setContent(mainLayout);
		
		Navigator navigator = new Navigator(this, viewContainer);
		navigator.addView("", DefaultView.class);
		navigator.addView("home", Home.class);
		navigator.addView("view1", View1.class);
		navigator.addView("view2", View2.class);
	}

}
