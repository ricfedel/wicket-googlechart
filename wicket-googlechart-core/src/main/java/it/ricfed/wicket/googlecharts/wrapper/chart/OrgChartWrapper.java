package it.ricfed.wicket.googlecharts.wrapper.chart;

import it.ricfed.wicket.googlecharts.options.chart.OrgChartOptions;
import it.ricfed.wicket.googlecharts.wrapper.ChartWrapper;

public class OrgChartWrapper extends ChartWrapper<OrgChartOptions> {

	private static final long serialVersionUID = -1413336423495057138L;

	public String getType() {
		return ChartWrapper.ORG_CHART;
	}

}
