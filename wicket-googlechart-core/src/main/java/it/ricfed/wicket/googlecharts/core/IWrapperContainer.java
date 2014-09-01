package it.ricfed.wicket.googlecharts.core;

import it.ricfed.wicket.googlecharts.wrapper.Wrapper;

import java.util.List;


public interface IWrapperContainer {
	public String getMarkupId();

	public boolean isInDashboard();

	public String getId();

	public IWrapperContainer getWrapperContainer(String id);

	public IBaseBehavior getBaseBehavior();

	public boolean isControl();

	public Wrapper getWrapper();
}
