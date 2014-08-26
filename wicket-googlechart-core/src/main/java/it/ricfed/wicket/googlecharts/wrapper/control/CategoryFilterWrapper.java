package it.ricfed.wicket.googlecharts.wrapper.control;

import it.ricfed.wicket.googlecharts.options.control.CategoryFilterOptions;
import it.ricfed.wicket.googlecharts.options.control.CategoryFilterState;
import it.ricfed.wicket.googlecharts.wrapper.ControlWrapper;

public class CategoryFilterWrapper extends
		ControlWrapper<CategoryFilterState, CategoryFilterOptions> {

	private static final long serialVersionUID = -1413336423495057138L;

	public String getType() {
		return ControlWrapper.CATEGORY_FILTER;
	}

}
