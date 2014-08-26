package it.ricfed.wicket.googlecharts.core;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;

public abstract class WrapperContainer extends WebMarkupContainer implements IWrapperContainer{


	private static final long serialVersionUID = -7271543186688160876L;

	public WrapperContainer(String id, IModel<?> c) {
		super(id, c);
	}
	public WrapperContainer(String id) {
		super(id);
	}	
	
	@Override
	public abstract boolean isInDashboard();

}
