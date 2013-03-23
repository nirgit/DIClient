package org.techdrum.diclient.app.model.presenter;

import java.awt.Container;

/**
 * A high level presenter interface.
 * @author nir moav
 */
public interface IPresenter {

	/**
	 * A method of all implementing presenters for presenting themselves on a given container.
	 * @param c
	 */
	void go(Container c) ;
	
}
