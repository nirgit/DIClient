package org.techdrum.diclient.app.presenter;

import java.awt.Container;

import javax.swing.JComponent;

import org.techdrum.diclient.app.model.presenter.IContentPanePresenter;

import com.google.inject.Inject;

/**
 * An actual content pane presenter!
 * @author nir moav
 */
public class ContentPanePresenter implements IContentPanePresenter {
	
	public static interface IDisplay {
		JComponent getAsComponent() ;
	}
	
	private final IDisplay display ;
	
	
	/**
	 * C'tor
	 * This is where DI takes place!!!
	 * Guice will instantiate and provide this presenter with a matching display!
	 * @param display
	 */
	@Inject
	public ContentPanePresenter(IDisplay display) {
		this.display = display ;
		// bind listeners to the display...
		bind() ;
		// add listeners to the event bus...
		registerOnEvents() ;
	}

	private void registerOnEvents() {
		// TODO Auto-generated method stub
	}

	private void bind() {
		// TODO Auto-generated method stub
	}

	public void go(Container c) {
		if(c == null) return ;
			c.add(display.getAsComponent()) ;
	}

}
