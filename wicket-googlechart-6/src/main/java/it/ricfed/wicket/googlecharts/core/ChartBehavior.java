package it.ricfed.wicket.googlecharts.core;

import it.ricfed.wicket.googlecharts.options.chart.ChartWrapperOptions;
import it.ricfed.wicket.googlecharts.utils.ScriptHelper;

import com.fasterxml.jackson.core.JsonProcessingException;

public class ChartBehavior extends BaseBehavior {

	private static final long serialVersionUID = 5935294904099227859L;

	@Override
	protected String toScript(IWrapperContainer component) {
		String ops = null;
		Chart<?> panel=(Chart<?>)component;
		String containerId=panel.getMarkupId();
		try {
			ChartWrapperOptions opt = panel.getWrapper().getWrapperOptions();
			opt.setContainerId(containerId);
			ops = getMapper().writeValueAsString(opt);
			ops= ScriptHelper.toFunctions(ops);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "var opt_" + containerId + "=" + ops + ";\nvar obj_" + containerId
				+ "=buildChart(opt_" + containerId + ")";
	}
}
