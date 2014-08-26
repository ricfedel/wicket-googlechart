package it.ricfed.wicket.googlecharts.wrapper.chart;

import it.ricfed.wicket.googlecharts.options.chart.ColumnChartOptions;
import it.ricfed.wicket.googlecharts.wrapper.ChartWrapper;

public class ColumnChartWrapper extends ChartWrapper<ColumnChartOptions> {

	private static final long serialVersionUID = -1413336423495057138L;

	public String getType() {
		return ChartWrapper.COLUMN_CHART;
	}

}
