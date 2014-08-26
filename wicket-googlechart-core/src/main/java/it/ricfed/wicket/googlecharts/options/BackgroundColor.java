package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BackgroundColor implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = -5407234914553764936L;

	private String stroke; /*
							 * string '#666' The color of the chart border, as
							 * an HTML color string.
							 */
	private Integer strokeWidth; /* number 0 The border width, in pixels. */
	private String fill; /*
						 * string 'white' The chart fill color, as an HTML color
						 * string.
						 */

	public String getStroke() {
		return stroke;
	}

	public void setStroke(String stroke) {
		this.stroke = stroke;
	}

	public Integer getStrokeWidth() {
		return strokeWidth;
	}

	public void setStrokeWidth(Integer strokeWidth) {
		this.strokeWidth = strokeWidth;
	}

	public String getFill() {
		return fill;
	}

	public void setFill(String fill) {
		this.fill = fill;
	}

}
