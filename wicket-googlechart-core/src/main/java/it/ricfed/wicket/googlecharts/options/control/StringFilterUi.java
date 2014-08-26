package it.ricfed.wicket.googlecharts.options.control;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class StringFilterUi implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = -2721056125142808401L;
	private Boolean realtimeTrigger;/*
									 * boolean true Whether the control should
									 * match any time a key is pressed or only
									 * when the input field 'changes' (loss of
									 * focus or pressing the Enter key).
									 */
	private String label;/*
						 * string auto The label to display next to the input
						 * field. If unspecified, the label of the column the
						 * control operates on will be used.
						 */
	private String labelSeparator;/*
								 * string none A separator string appended to
								 * the label, to visually separate the label
								 * from the input field.
								 */
	private String labelStacking;/*
								 * string 'horizontal' Whether the label should
								 * display above (vertical stacking) or beside
								 * (horizontal stacking) the input field. Use
								 * either 'vertical' or 'horizontal'.
								 */
	private String cssClass;/*
							 * string
							 * 'google-visualization-controls-stringfilter' The
							 * CSS class to assign to the control, for custom
							 * styling.
							 */

	public Boolean getRealtimeTrigger() {
		return realtimeTrigger;
	}

	public void setRealtimeTrigger(Boolean realtimeTrigger) {
		this.realtimeTrigger = realtimeTrigger;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabelSeparator() {
		return labelSeparator;
	}

	public void setLabelSeparator(String labelSeparator) {
		this.labelSeparator = labelSeparator;
	}

	public String getLabelStacking() {
		return labelStacking;
	}

	public void setLabelStacking(String labelStacking) {
		this.labelStacking = labelStacking;
	}

	public String getCssClass() {
		return cssClass;
	}

	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}

}
