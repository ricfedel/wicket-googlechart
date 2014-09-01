package it.ricfed.wicket.googlecharts.core;

public class ChartBehavior extends BaseBehavior {

	public ChartBehavior(WrapperContainer container) {
		super(container);
	}

	private static final long serialVersionUID = 5935294904099227859L;

	@Override
	public String toScript(IWrapperContainer component) {
		return getResolver().toScriptChart(component);
	}
}
