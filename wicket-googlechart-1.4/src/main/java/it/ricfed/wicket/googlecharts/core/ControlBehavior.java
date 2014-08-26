package it.ricfed.wicket.googlecharts.core;

import it.ricfed.wicket.googlecharts.options.control.ControlWrapperOptions;
import it.ricfed.wicket.googlecharts.utils.ScriptHelper;

import com.fasterxml.jackson.core.JsonProcessingException;



public class ControlBehavior extends BaseBehavior {


	public ControlBehavior(WrapperContainer container) {
		super(container);
	}

	private static final long serialVersionUID = 4796145312655641610L;

	@Override
	protected String toScript(final IWrapperContainer component) {
		String ops=null;
		final ControlContainer<?> panel=(ControlContainer<?>)component;
		final String containerId=panel.getMarkupId();
		try {
			ControlWrapperOptions o = panel.getWrapper().getWrapperOptions();
			if(o==null)o=new ControlWrapperOptions();
			o.setContainerId(containerId);
			ops=getMapper().writeValueAsString(panel.getWrapper().getWrapperOptions());
			ops=ScriptHelper.toFunctions(ops);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "var opt_"+containerId+"="+ops+";\nvar obj_" + containerId+ "=buildControl(opt_"+containerId+");\n";
	}

}
