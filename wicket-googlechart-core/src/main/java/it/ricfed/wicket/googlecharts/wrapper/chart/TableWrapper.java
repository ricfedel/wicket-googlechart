package it.ricfed.wicket.googlecharts.wrapper.chart;

import it.ricfed.wicket.googlecharts.options.chart.TableOptions;
import it.ricfed.wicket.googlecharts.wrapper.ChartWrapper;

public class TableWrapper extends ChartWrapper<TableOptions> {

	private static final long serialVersionUID = -1413336423495057138L;

	public String getType() {
		return ChartWrapper.TABLE;
	}

}
