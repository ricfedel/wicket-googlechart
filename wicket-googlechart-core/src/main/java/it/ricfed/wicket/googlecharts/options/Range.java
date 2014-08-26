package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Range implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = -8723656265436816927L;

	private Object start;/*
						 * number, date, datetime or timeofday Range start value
						 * The start of the selected range, inclusive.
						 */
	private Object end;/*
						 * number, date, datetime or timeofday Range end value
						 * The end of the selected range, inclusive.
						 */

	public Object getStart() {
		return start;
	}

	public void setStart(Object start) {
		this.start = start;
	}

	public Object getEnd() {
		return end;
	}

	public void setEnd(Object end) {
		this.end = end;
	}

}
