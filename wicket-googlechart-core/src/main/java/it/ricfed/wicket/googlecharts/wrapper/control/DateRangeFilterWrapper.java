package it.ricfed.wicket.googlecharts.wrapper.control;

import it.ricfed.wicket.googlecharts.options.control.DateRangeFilterOptions;
import it.ricfed.wicket.googlecharts.options.control.DateRangeFilterState;
import it.ricfed.wicket.googlecharts.wrapper.ControlWrapper;

public class DateRangeFilterWrapper extends
		ControlWrapper<DateRangeFilterState, DateRangeFilterOptions> {

	private static final long serialVersionUID = -1413336423495057138L;

	public String getType() {
		return ControlWrapper.DATE_RANGE__FILTER;
	}

}
