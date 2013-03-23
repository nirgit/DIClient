package org.techdrum.diclient.app;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.techdrum.diclient.app.di.ApplicationDIModule;
import org.techdrum.diclient.app.model.presenter.IContentPanePresenter;

import com.google.inject.Guice;
import com.google.inject.Injector;


/**
 * the Entry point class to the application. 
 * @author nir moav
 */
public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			public void run() {
				createAndShowGUI() ;
			}
		}) ;
	}
	
	
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("DI Guice Swing App") ;
		frame.setPreferredSize(new Dimension(500, 200)) ;
		// the important line 
		go(frame.getContentPane()) ;
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		frame.setVisible(true) ;
		frame.pack() ;
	}
	
	/**
	 * @param container 
	 * @return a panel to serve as a content pane. Check below "how" it's done.
	 */
	private static void go(Container container) {
		// Guice.createInjector() takes your Modules, and returns a new Injector instance. 
	    Injector injector = Guice.createInjector(new ApplicationDIModule());
		// lets get the 'Main' Presenter !!
	    IContentPanePresenter contentPanePresenter = injector.getInstance(IContentPanePresenter.class) ;
		
		contentPanePresenter.go(container) ;
	}
}
