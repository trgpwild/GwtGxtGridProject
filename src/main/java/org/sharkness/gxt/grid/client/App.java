package org.sharkness.gxt.grid.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.sencha.gxt.widget.core.client.Resizable;
import com.sencha.gxt.widget.core.client.Resizable.Dir;

public class App implements EntryPoint {

	public void onModuleLoad() {
		
		ContentPanel root = new ContentPanel();
		 
        root.setHeadingText("Contacts");
        root.setPixelSize(550, 250);
        root.addStyleName("margin-10");
 
        Resizable r = new Resizable(root, Dir.E, Dir.SE, Dir.S);
        r.setMinHeight(200);
        r.setMinWidth(300);
 
        root.setWidget(new ContactGrid());
 
        RootPanel.get().add(root);
        
	}

}
