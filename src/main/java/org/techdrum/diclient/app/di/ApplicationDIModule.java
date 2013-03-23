package org.techdrum.diclient.app.di;

import org.techdrum.diclient.app.model.presenter.IContentPanePresenter;
import org.techdrum.diclient.app.presenter.ContentPanePresenter;
import org.techdrum.diclient.app.view.ContentPaneDisplay;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

/**
 * Think of this class as defining a DI "container". 
 * You configure here all the classes you wish to be
 * used with the DI framework (Guice).   
 * @author nir
 */
public class ApplicationDIModule extends AbstractModule {

	@Override
	protected void configure() {
		// Lets configure some stuff !
		bind(IContentPanePresenter.class).to(ContentPanePresenter.class).in(Singleton.class) ;
		bind(ContentPanePresenter.IDisplay.class).to(ContentPaneDisplay.class).in(Singleton.class) ;
	}

}
