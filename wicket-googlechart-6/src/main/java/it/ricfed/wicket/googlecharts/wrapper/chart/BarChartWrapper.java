package it.ricfed.wicket.googlecharts.wrapper.chart;

import it.ricfed.wicket.googlecharts.options.chart.BarChartOptions;
import it.ricfed.wicket.googlecharts.wrapper.ChartWrapper;

public class BarChartWrapper extends ChartWrapper<BarChartOptions> {

	private static final long serialVersionUID = -1413336423495057138L;

	public String getType() {
		return ChartWrapper.BAR_CHART;
	}

}
