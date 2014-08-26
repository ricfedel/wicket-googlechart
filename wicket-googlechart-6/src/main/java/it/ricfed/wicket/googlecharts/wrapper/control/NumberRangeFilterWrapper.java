package it.ricfed.wicket.googlecharts.wrapper.control;

import it.ricfed.wicket.googlecharts.options.control.NumberRangeFilterOptions;
import it.ricfed.wicket.googlecharts.options.control.NumberRangeFilterState;
import it.ricfed.wicket.googlecharts.wrapper.ControlWrapper;


public class NumberRangeFilterWrapper extends ControlWrapper<NumberRangeFilterState,NumberRangeFilterOptions> {

	private static final long serialVersionUID = -1413336423495057138L;

	public String getType() {
		return ControlWrapper.NUMBER_RANGE__FILTER;
	}

}
