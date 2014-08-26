package it.ricfed.wicket.googlecharts.control;

import it.ricfed.wicket.googlecharts.core.ControlContainer;
import it.ricfed.wicket.googlecharts.wrapper.control.ChartRangeFilterWrapper;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class ChartRangeFilter extends ControlContainer<ChartRangeFilterWrapper> {

	private static final long serialVersionUID = -245537247692205392L;

	public ChartRangeFilter(String id, IModel<ChartRangeFilterWrapper> c) {
		super(id, c);
	}

	public ChartRangeFilter(String id) {
		super(id, Model.of(new ChartRangeFilterWrapper()));
	}

}
