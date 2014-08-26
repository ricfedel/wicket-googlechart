package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Gradient implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = -7465512624446758076L;
	// Attributes for linear gradient fill.
	private String color1; /* : '#fbf6a7', // Start color for gradient. */
	private String color2; /* : '#33b679', // Finish color for gradient. */
	private String x1; /* : '0%', */
	private String y1; /* : '0%', */// Where on the boundary to start and end
										// the
	private String x2; /* : '100%' */
	private String y2; /* : '100%' */// color1/color2 gradient, relative to the
	// upper left corner of the boundary.
	private Boolean useObjectBoundingBoxUnits;/*
											 * true // If true, the boundary for
											 * x1, y1, // x2, and y2 is the box.
											 * If false, // it's the entire
											 * chart.
											 */

	public String getColor1() {
		return color1;
	}

	public void setColor1(String color1) {
		this.color1 = color1;
	}

	public String getColor2() {
		return color2;
	}

	public void setColor2(String color2) {
		this.color2 = color2;
	}

	public String getX1() {
		return x1;
	}

	public void setX1(String x1) {
		this.x1 = x1;
	}

	public String getY1() {
		return y1;
	}

	public void setY1(String y1) {
		this.y1 = y1;
	}

	public String getX2() {
		return x2;
	}

	public void setX2(String x2) {
		this.x2 = x2;
	}

	public String getY2() {
		return y2;
	}

	public void setY2(String y2) {
		this.y2 = y2;
	}

	public Boolean getUseObjectBoundingBoxUnits() {
		return useObjectBoundingBoxUnits;
	}

	public void setUseObjectBoundingBoxUnits(Boolean useObjectBoundingBoxUnits) {
		this.useObjectBoundingBoxUnits = useObjectBoundingBoxUnits;
	}

}
