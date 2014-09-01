package it.ricfed.wicket.googlecharts.core;

public class DashboardBehavior extends BaseBehavior {


	public DashboardBehavior(WrapperContainer container) {
		super(container);
	}

	private static final long serialVersionUID = -9167469119665044503L;

	@Override
	public String toScript(IWrapperContainer component) {
		return getResolver().toScriptDashboard(component);
	}

}
