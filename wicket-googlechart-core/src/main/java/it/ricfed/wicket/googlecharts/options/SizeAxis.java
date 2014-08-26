package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SizeAxis implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = 4850371042666028457L;
	private Number maxSize;/*
							 * number 30 Maximum radius of the largest possible
							 * bubble, in pixels.
							 */
	private Number maxValue;/*
							 * number Maximum value of size column in chart data
							 * The size value (as appears in the chart data) to
							 * be mapped to sizeAxis.maxSize. Larger values will
							 * be cropped to this value.
							 */
	private Number minSize;/*
							 * number 5 Mininum radius of the smallest possible
							 * bubble, in pixels.
							 */
	private Number minValue;/*
							 * number Minimum value of size column in chart data
							 * The size value (as appears in the chart data) to
							 * be mapped to sizeAxis.minSize. Smaller values
							 * will be cropped to this value.
							 */

	public Number getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(Number maxSize) {
		this.maxSize = maxSize;
	}

	public Number getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(Number maxValue) {
		this.maxValue = maxValue;
	}

	public Number getMinSize() {
		return minSize;
	}

	public void setMinSize(Number minSize) {
		this.minSize = minSize;
	}

	public Number getMinValue() {
		return minValue;
	}

	public void setMinValue(Number minValue) {
		this.minValue = minValue;
	}

}
