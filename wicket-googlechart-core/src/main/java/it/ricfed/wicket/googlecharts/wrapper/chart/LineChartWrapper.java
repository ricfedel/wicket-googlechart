package it.ricfed.wicket.googlecharts.wrapper.chart;

import it.ricfed.wicket.googlecharts.options.chart.LineChartOptions;
import it.ricfed.wicket.googlecharts.wrapper.ChartWrapper;

public class LineChartWrapper extends ChartWrapper<LineChartOptions> {

	private static final long serialVersionUID = -1413336423495057138L;

	public String getType() {
		return ChartWrapper.LINE_CHART;
	}

}
