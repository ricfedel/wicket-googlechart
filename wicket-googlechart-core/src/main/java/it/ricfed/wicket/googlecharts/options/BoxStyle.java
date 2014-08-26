package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class BoxStyle implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = -2821102547347727110L;

	private String stroke; /* : '#888', // Color of the box outline. */
	private Integer strokeWidth; /* : 1, // Thickness of the box outline. */
	private Integer rx;/* : 10, // x-radius of the corner curvature. */
	private Integer ry; /* : 10, // y-radius of the corner curvature. */
	private Gradient gradient;

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

	public Integer getRx() {
		return rx;
	}

	public void setRx(Integer rx) {
		this.rx = rx;
	}

	public Integer getRy() {
		return ry;
	}

	public void setRy(Integer ry) {
		this.ry = ry;
	}

	public Gradient getGradient() {
		return gradient;
	}

	public void setGradient(Gradient gradient) {
		this.gradient = gradient;
	}

}
