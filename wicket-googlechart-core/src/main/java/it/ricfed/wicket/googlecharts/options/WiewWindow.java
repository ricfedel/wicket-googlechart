package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class WiewWindow implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = 2952690664980183906L;
	private Integer max;/*
						 * number auto The maximum horizontal data value to
						 * render. Ignored when viewWindowMode is 'pretty' or
						 * 'maximized'.
						 */
	private Integer min;/*
						 * number auto The minimum horizontal data value to
						 * render. Ignored when viewWindowMode is 'pretty' or
						 * 'maximized'.
						 */

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

}
