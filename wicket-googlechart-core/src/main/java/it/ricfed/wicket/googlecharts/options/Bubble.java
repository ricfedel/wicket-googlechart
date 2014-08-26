package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Bubble implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = 4906289590488744915L;
	private Number opacity;/*
							 * number, 0.0–1.0 0.8 The opacity of the bubbles,
							 * where 0 is fully transparent and 1 is fully
							 * opaque.
							 */
	private String stroke;/*
						 * string '#ccc' The color of the bubbles' stroke.
						 */
	private TextStyle textStyle;/*
								 * Object {color: 'black', fontName:
								 * <global-font-name>, fontSize:
								 * <global-font-size>} An object that specifies
								 * the bubble text style. The object has this
								 * format:
								 * 
								 * {color: <string>, fontName: <string>,
								 * fontSize: <number>} The color can be any HTML
								 * color string, for example: 'red' or
								 * '#00cc00'. Also see fontName and fontSize.
								 */

	public Number getOpacity() {
		return opacity;
	}

	public void setOpacity(Number opacity) {
		this.opacity = opacity;
	}

	public String getStroke() {
		return stroke;
	}

	public void setStroke(String stroke) {
		this.stroke = stroke;
	}

	public TextStyle getTextStyle() {
		return textStyle;
	}

	public void setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
	}

}
