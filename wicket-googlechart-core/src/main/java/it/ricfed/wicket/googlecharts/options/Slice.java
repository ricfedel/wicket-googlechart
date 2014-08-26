package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Slice implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = -5436873821200621216L;
	private String color;/*
						 * - The color to use for this slice. Specify a valid
						 * HTML color string.
						 */
	private Number offset;/*
						 * - How far to separate the slice from the rest of the
						 * pie, from 0.0 (not at all) to 1.0 (the pie's radius).
						 */
	private TextStyle textStyle;/*
								 * - Overrides the global pieSliceTextSlice for
								 * this slice.
								 */

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Number getOffset() {
		return offset;
	}

	public void setOffset(Number offset) {
		this.offset = offset;
	}

	public TextStyle getTextStyle() {
		return textStyle;
	}

	public void setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
	}

}
