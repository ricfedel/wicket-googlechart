package it.ricfed.wicket.googlecharts.control;

import it.ricfed.wicket.googlecharts.core.ControlContainer;
import it.ricfed.wicket.googlecharts.wrapper.control.CategoryFilterWrapper;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;


public class CategoryFilter extends ControlContainer<CategoryFilterWrapper>{


	private static final long serialVersionUID = -245537247692205392L;


	public CategoryFilter(String id, IModel<CategoryFilterWrapper> c) {
		super(id, c);
	}


	public CategoryFilter(String id) {
		super(id,Model.of(new CategoryFilterWrapper()));
	}


}
