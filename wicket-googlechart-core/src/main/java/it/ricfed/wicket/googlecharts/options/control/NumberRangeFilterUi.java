package it.ricfed.wicket.googlecharts.options.control;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class NumberRangeFilterUi implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = -2721056125142808401L;
	private Object format;/*
						 * How to represent the number as a string. Accepts any
						 * valid number format.
						 */
	private Number step;/*
						 * The minimum possible change when dragging the slider
						 * thumbs.
						 */
	private Number ticks;/*
						 * number auto The number of ticks (fixed positions in
						 * the range bar) the slider thumbs can occupy.
						 */
	private Number unitIncrement;/*
								 * string '1' The amount to increment for unit
								 * increments of the range extents. A unit
								 * increment is equivalent to using the arrow
								 * keys to move a slider thumb.
								 */
	private Number blockIncrement;/*
								 * number 10 The amount to increment for block
								 * increments of the range extents. A block
								 * increment is equivalent to using the pgUp and
								 * pgDown keys to move the slider thumbs.
								 */
	private Boolean showRangeValues;/*
									 * boolean true Whether to have labels next
									 * to the slider displaying extents of the
									 * selected range.
									 */
	private String orientation;/*
								 * string 'horizontal' The slider orientation.
								 * Either 'horizontal' or 'vertical'.
								 */
	private String label;/*
						 * string auto The label to display next to the slider.
						 * If unspecified, the label of the column the control
						 * operates on will be used.
						 */
	private String labelSeparator;/*
								 * string none A separator string appended to
								 * the label, to visually separate the label
								 * from the slider.
								 */
	private String labelStacking;/*
								 * string 'horizontal' Whether the label should
								 * display above (vertical stacking) or beside
								 * (horizontal stacking) the slider. Use either
								 * 'vertical' or 'horizontal'.
								 */
	private String cssClass;/*
							 * string
							 * 'google-visualization-controls-rangefilter' The
							 * CSS class to assign to the control, for custom
							 * styling.
							 */

	public Object getFormat() {
		return format;
	}

	public void setFormat(Object format) {
		this.format = format;
	}

	public Number getStep() {
		return step;
	}

	public void setStep(Number step) {
		this.step = step;
	}

	public Number getTicks() {
		return ticks;
	}

	public void setTicks(Number ticks) {
		this.ticks = ticks;
	}

	public Number getUnitIncrement() {
		return unitIncrement;
	}

	public void setUnitIncrement(Number unitIncrement) {
		this.unitIncrement = unitIncrement;
	}

	public Number getBlockIncrement() {
		return blockIncrement;
	}

	public void setBlockIncrement(Number blockIncrement) {
		this.blockIncrement = blockIncrement;
	}

	public Boolean getShowRangeValues() {
		return showRangeValues;
	}

	public void setShowRangeValues(Boolean showRangeValues) {
		this.showRangeValues = showRangeValues;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
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
