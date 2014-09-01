package it.ricfed.wicket.googlecharts.core;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.behavior.IBehavior;
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
	
	@Override
	public abstract boolean isControl();

	@Override
	public IWrapperContainer getWrapperContainer(String id) {
		if (get(id) == null || !(get(id) instanceof IWrapperContainer))
			return null;
		return (IWrapperContainer) get(id);
	}

	@Override
	public IBaseBehavior getBaseBehavior() {
		if (getBehaviors() == null)
			return null;
		for (IBehavior b : getBehaviors()) {
			if (b instanceof IBaseBehavior) {
				return (IBaseBehavior) b;
			}
		}
		return null;
	}
}
