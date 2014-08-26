package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Legend implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = -8980651558381315239L;
	public static final String POSITION_RIGHT = "right";
	public static final String POSITION_LEFT = "left";
	public static final String POSITION_BOTTOM = "bottom";
	public static final String POSITION_TOP = "top";
	public static final String POSITION_IN = "in";
	public static final String POSITION_NONE = "none";
	private String position; /*
							 * string 'right' Position of the legend Can be one
							 * of the following: 'bottom' - Below the chart.
							 * 'left' - To the left of the chart, provided the
							 * left axis has no series associated with it. So if
							 * you want the legend on the left, use the option
							 * targetAxisIndex: 1. 'in' - Inside the chart, by
							 * the top left corner. 'none' - No legend is
							 * displayed. 'right' - To the right of the chart.
							 * Incompatible with the vAxes option. 'top' - Above
							 * the chart.
							 */
	private String alignment; /*
							 * string automatic Alignment of the legend Can be
							 * one of the following: 'start' - Aligned to the
							 * start of the area allocated for the legend
							 * 'center' - Centered in the area allocated for the
							 * legend 'end' - Aligned to the end of the area
							 * allocated for the legend Start, center, and end
							 * are relative to the style -- vertical or
							 * horizontal -- of the legend For example, in a
							 * 'right' legend, 'start' and 'end' are at the top
							 * and bottom, respectively; for a 'top' legend,
							 * 'start' and 'end' would be at the left and right
							 * of the area, respectively.
							 * 
							 * The default value depends on the legend's
							 * position. For 'bottom' legends, the default is
							 * 'center'; other legends default to 'start'.
							 */
	private TextStyle textStyle; /*
								 * Object {color: 'black', fontName:
								 * <global-font-name>, fontSize:
								 * <global-font-size>} An object that specifies
								 * the legend text style. The object has this
								 * format:
								 * 
								 * { color: <string>, fontName: <string>,
								 * fontSize: <number>, bold: <boolean>, italic:
								 * <boolean> } The color can be any HTML color
								 * string, for example: 'red' or '#00cc00'. Also
								 * see fontName and fontSize.
								 */

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	public TextStyle getTextStyle() {
		return textStyle;
	}

	public void setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
	}

}
