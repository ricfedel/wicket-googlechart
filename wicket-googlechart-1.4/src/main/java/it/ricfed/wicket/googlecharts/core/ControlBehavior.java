package it.ricfed.wicket.googlecharts.core;




public class ControlBehavior extends BaseBehavior {


	public ControlBehavior(WrapperContainer container) {
		super(container);
	}

	private static final long serialVersionUID = 4796145312655641610L;

	@Override
	public String toScript(final IWrapperContainer component) {
		return getResolver().toScriptControl(component);
	}

}
