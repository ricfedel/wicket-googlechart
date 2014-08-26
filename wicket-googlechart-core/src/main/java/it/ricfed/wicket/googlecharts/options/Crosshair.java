package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Crosshair implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = -7362821792076902883L;
	private String color;/*
						 * string default The crosshair color, expressed as
						 * either a color name (e.g., "blue") or an RGB value
						 * (e.g., "#adf").
						 */
	private Object focused;/*
							 * object default An object containing the crosshair
							 * properties upon focus. Example: crosshair: {
							 * focused: { color: '#3bc', opacity: 0.8 } }
							 */
	private Number opacity;/*
							 * 1.0 The crosshair opacity, with 0.0 being fully
							 * transparent and 1.0 fully opaque.
							 */
	private String orientation;/*
								 * string 'both' The crosshair orientation,
								 * which can be 'vertical' for vertical hairs
								 * only, 'horizontal' for horizontal hairs only,
								 * or 'both' for traditional crosshairs.
								 */
	private Crosshair selected;/*
								 * object default An object containing the
								 * crosshair properties upon selection. Example:
								 * crosshair: { selected: { color: '#3bc',
								 * opacity: 0.8 } }
								 */
	private String trigger;/*
							 * string 'both' When to display crosshairs: on
							 * 'focus', 'selection', or 'both'.
							 */

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Object getFocused() {
		return focused;
	}

	public void setFocused(Object focused) {
		this.focused = focused;
	}

	public Number getOpacity() {
		return opacity;
	}

	public void setOpacity(Number opacity) {
		this.opacity = opacity;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public Crosshair getSelected() {
		return selected;
	}

	public void setSelected(Crosshair selected) {
		this.selected = selected;
	}

	public String getTrigger() {
		return trigger;
	}

	public void setTrigger(String trigger) {
		this.trigger = trigger;
	}

}
