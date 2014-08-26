package it.ricfed.wicket.googlecharts.control;

import it.ricfed.wicket.googlecharts.core.ControlContainer;
import it.ricfed.wicket.googlecharts.wrapper.control.NumberRangeFilterWrapper;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class NumberRangeFilter extends ControlContainer<NumberRangeFilterWrapper> {

	private static final long serialVersionUID = -245537247692205392L;

	public NumberRangeFilter(String id, IModel<NumberRangeFilterWrapper> c) {
		super(id, c);
	}

	public NumberRangeFilter(String id) {
		super(id, Model.of(new NumberRangeFilterWrapper()));
	}

}
