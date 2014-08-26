package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ChartArea implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = -8113424441895004176L;
	private Object backgroundColor; /*
									 * string or object 'white' Chart area
									 * background color. When a string is used,
									 * it can be either a hex string (e.g.,
									 * '#fdc') or an English color name. When an
									 * object is used, the following properties
									 * can be provided: stroke: the color,
									 * provided as a hex string or English color
									 * name. strokeWidth: if provided, draws a
									 * border around the chart area of the given
									 * width (and with the color of stroke).
									 */
	private Object left; /*
						 * number or string auto How far to draw the chart from
						 * the left border.
						 */
	private Object top;/*
						 * number or string auto How far to draw the chart from
						 * the top border.
						 */
	private Object width;/*
						 * number or string auto Chart area width.
						 */
	private Object height;/* number or string auto Chart area height. */

	public Object getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(Object backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public Object getLeft() {
		return left;
	}

	public void setLeft(Object left) {
		this.left = left;
	}

	public Object getTop() {
		return top;
	}

	public void setTop(Object top) {
		this.top = top;
	}

	public Object getWidth() {
		return width;
	}

	public void setWidth(Object width) {
		this.width = width;
	}

	public Object getHeight() {
		return height;
	}

	public void setHeight(Object height) {
		this.height = height;
	}

}
