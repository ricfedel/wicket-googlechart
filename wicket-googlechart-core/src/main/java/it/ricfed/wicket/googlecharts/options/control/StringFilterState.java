package it.ricfed.wicket.googlecharts.options.control;

import it.ricfed.wicket.googlecharts.options.State;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class StringFilterState extends State {

	@JsonIgnore
	private static final long serialVersionUID = 7174419309421322345L;

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
