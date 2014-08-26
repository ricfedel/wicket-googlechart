package it.ricfed.wicket.googlecharts.wrapper.control;

import it.ricfed.wicket.googlecharts.options.control.ChartRangeFilterOptions;
import it.ricfed.wicket.googlecharts.options.control.ChartRangeFilterState;
import it.ricfed.wicket.googlecharts.wrapper.ControlWrapper;


public class ChartRangeFilterWrapper extends ControlWrapper<ChartRangeFilterState,ChartRangeFilterOptions> {

	private static final long serialVersionUID = -1413336423495057138L;

	public String getType() {
		return ControlWrapper.CHART_RANGE_FILTER;
	}

}
