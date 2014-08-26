package it.ricfed.wicket.googlecharts.wrapper.control;

import it.ricfed.wicket.googlecharts.options.control.StringFilterOptions;
import it.ricfed.wicket.googlecharts.options.control.StringFilterState;
import it.ricfed.wicket.googlecharts.wrapper.ControlWrapper;


public class StringFilterWrapper extends ControlWrapper<StringFilterState,StringFilterOptions> {

	private static final long serialVersionUID = -1413336423495057138L;

	public String getType() {
		return ControlWrapper.STRING_FILTER;
	}

}
