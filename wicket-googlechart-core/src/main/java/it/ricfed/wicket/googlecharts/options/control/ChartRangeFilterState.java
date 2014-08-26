package it.ricfed.wicket.googlecharts.options.control;

import it.ricfed.wicket.googlecharts.options.Range;
import it.ricfed.wicket.googlecharts.options.State;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ChartRangeFilterState extends State {

	@JsonIgnore
	private static final long serialVersionUID = 7174419309421322345L;

	private Range range;

	public Range getRange() {
		return range;
	}

	public void setRange(Range range) {
		this.range = range;
	}

}
