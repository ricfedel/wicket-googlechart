package it.ricfed.wicket.googlecharts.control;

import it.ricfed.wicket.googlecharts.core.ControlContainer;
import it.ricfed.wicket.googlecharts.wrapper.control.DateRangeFilterWrapper;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class DateRangeFilter extends ControlContainer<DateRangeFilterWrapper> {

	private static final long serialVersionUID = -245537247692205392L;

	public DateRangeFilter(String id, IModel<DateRangeFilterWrapper> c) {
		super(id, c);
	}

	public DateRangeFilter(String id) {
		super(id, Model.of(new DateRangeFilterWrapper()));
	}

}
