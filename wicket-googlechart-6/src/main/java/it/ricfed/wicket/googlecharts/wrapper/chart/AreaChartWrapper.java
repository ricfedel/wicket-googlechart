package it.ricfed.wicket.googlecharts.wrapper.chart;

import it.ricfed.wicket.googlecharts.options.chart.AreaChartOptions;
import it.ricfed.wicket.googlecharts.wrapper.ChartWrapper;


public class AreaChartWrapper extends ChartWrapper<AreaChartOptions> {

	private static final long serialVersionUID = -1413336423495057138L;

	public String getType() {
		return ChartWrapper.AREA_CHART;
	}

}
