package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Gridlines implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = -2624939379160868131L;
	private String color;/*
						 * string '#CCC' The color of the horizontal gridlines
						 * inside the chart area. Specify a valid HTML color
						 * string.
						 */
	private Integer count;/*
						 * number 5 The number of horizontal gridlines inside
						 * the chart area. Minimum value is 2. Specify -1 to
						 * automatically compute the number of gridlines.
						 */

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
