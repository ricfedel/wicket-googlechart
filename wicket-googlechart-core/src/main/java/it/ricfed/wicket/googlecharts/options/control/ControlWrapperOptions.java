package it.ricfed.wicket.googlecharts.options.control;

import it.ricfed.wicket.googlecharts.options.State;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ControlWrapperOptions implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = 7219292430688261881L;
	private String controlType; /*
								 * CategoryFilter, ChartRangeFilter,
								 * DateRangeFilter, NumberRangeFilter, and
								 * StringFilter.
								 */
	private String containerId; /*
								 * String Required none The ID of the DOM
								 * element on your page that will host the
								 * control.
								 */
	private ControlOptions options;/*
									 * Object Optional none An object describing
									 * the options for the control. You can use
									 * either JavaScript literal notation, or
									 * provide a handle to the object. Example:
									 * "options": {"filterColumnLabel": "Age",
									 * "minValue": 10, "maxValue": 80}
									 */
	private State state;/*
						 * Object Optional none An object describing the state
						 * of the control. The state collects all the variables
						 * that the user operating the control can affect. For
						 * example, a range slider state can be described in
						 * term of the positions that the low and high thumb of
						 * the slider occupy. You can use either Javascript
						 * literal notation, or provide a handle to the object.
						 * Example: "state": {"lowValue": 20, "highValue": 50}
						 */

	public String getControlType() {
		return controlType;
	}

	public void setControlType(String controlType) {
		this.controlType = controlType;
	}

	public String getContainerId() {
		return containerId;
	}

	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}

	public ControlOptions getOptions() {
		return options;
	}

	public void setOptions(ControlOptions options) {
		this.options = options;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
