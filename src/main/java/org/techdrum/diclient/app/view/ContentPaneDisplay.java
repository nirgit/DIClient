package org.techdrum.diclient.app.view;

import java.awt.BorderLayout;
import java.awt.Label;

import javax.swing.JComponent;
import javax.swing.JPanel;

import org.techdrum.diclient.app.presenter.ContentPanePresenter;
import org.techdrum.diclient.app.presenter.ContentPanePresenter.IDisplay;

/**
 * an implementation for the {@link ContentPanePresenter.IDisplay} !
 * Note that you could implement different displays for that interface, so you could
 * write one display for Desktop users, one for mobile users, etc... 
 * @author nir moav
 */
public class ContentPaneDisplay extends JPanel implements IDisplay {

	/**
	 * C'tor
	 */
	public ContentPaneDisplay() {
		setLayout(new BorderLayout()) ;
		add(new Label("I am label in a display created by Guice"), BorderLayout.CENTER) ;
		add(new Label("I am another label in the display created by Guice"), BorderLayout.SOUTH) ;
	}

	public JComponent getAsComponent() {
		return this ;
	}

}
