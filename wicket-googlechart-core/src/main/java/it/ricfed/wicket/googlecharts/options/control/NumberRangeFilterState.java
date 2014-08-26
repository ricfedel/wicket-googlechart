package it.ricfed.wicket.googlecharts.options.control;

import it.ricfed.wicket.googlecharts.options.State;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class NumberRangeFilterState extends State {

	@JsonIgnore
	private static final long serialVersionUID = 48191195783624513L;

	private Number lowValue;/*
							 * none The lower extent of the selected range,
							 * inclusive.
							 */
	private Number highValue;/*
							 * number none The higher extent of the selected
							 * range, inclusive.
							 */
	private Boolean lowThumbAtMinimum;/*
									 * boolean none Whether the lower thumb of
									 * the slider is locked at the minimum
									 * allowed range. If set, overrides
									 * lowValue. private Boolean
									 */
	private Boolean highThumbAtMaximum;/*
										 * boolean none Whether the higher thumb
										 * of the slider is locked at the
										 * maximum allowed range. If set,
										 * overrides highValue.
										 */

	public Number getHighValue() {
		return highValue;
	}

	public Number getLowValue() {
		return lowValue;
	}

	public void setLowValue(Number lowValue) {
		this.lowValue = lowValue;
	}

	public void setHighValue(Number highValue) {
		this.highValue = highValue;
	}

	public Boolean getLowThumbAtMinimum() {
		return lowThumbAtMinimum;
	}

	public void setLowThumbAtMinimum(Boolean lowThumbAtMinimum) {
		this.lowThumbAtMinimum = lowThumbAtMinimum;
	}

	public Boolean getHighThumbAtMaximum() {
		return highThumbAtMaximum;
	}

	public void setHighThumbAtMaximum(Boolean highThumbAtMaximum) {
		this.highThumbAtMaximum = highThumbAtMaximum;
	}

}
