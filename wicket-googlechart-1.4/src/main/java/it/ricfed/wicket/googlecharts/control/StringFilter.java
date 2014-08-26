package it.ricfed.wicket.googlecharts.control;

import it.ricfed.wicket.googlecharts.core.ControlContainer;
import it.ricfed.wicket.googlecharts.wrapper.control.StringFilterWrapper;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class StringFilter extends ControlContainer<StringFilterWrapper> {

	private static final long serialVersionUID = -245537247692205392L;

	public StringFilter(String id, IModel<StringFilterWrapper> c) {
		super(id, c);
	}

	public StringFilter(String id) {
		super(id, Model.of(new StringFilterWrapper()));
	}

}
