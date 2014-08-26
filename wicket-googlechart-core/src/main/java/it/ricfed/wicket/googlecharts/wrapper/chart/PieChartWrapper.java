package it.ricfed.wicket.googlecharts.wrapper.chart;

import it.ricfed.wicket.googlecharts.options.chart.PieChartOptions;
import it.ricfed.wicket.googlecharts.wrapper.ChartWrapper;

public class PieChartWrapper extends ChartWrapper<PieChartOptions> {

	private static final long serialVersionUID = -1413336423495057138L;

	public String getType() {
		return ChartWrapper.PIE_CHART;
	}

}
