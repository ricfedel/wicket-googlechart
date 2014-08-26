package it.ricfed.wicket.googlecharts.options.control;

import it.ricfed.wicket.googlecharts.options.State;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CategoryFilterState extends State {

	@JsonIgnore
	private static final long serialVersionUID = 5845306187380132229L;

	private Object[] selectedValues;

	public Object[] getSelectedValues() {
		return selectedValues;
	}

	public void setSelectedValues(Object[] selectedValues) {
		this.selectedValues = selectedValues;
	}

}
