package it.ricfed.wicket.googlecharts.wrapper.chart;

import it.ricfed.wicket.googlecharts.options.chart.ComboChartOptions;
import it.ricfed.wicket.googlecharts.wrapper.ChartWrapper;

public class ComboChartWrapper extends ChartWrapper<ComboChartOptions> {

	private static final long serialVersionUID = -1413336423495057138L;

	public String getType() {
		return ChartWrapper.COMBO_CHART;
	}

}
