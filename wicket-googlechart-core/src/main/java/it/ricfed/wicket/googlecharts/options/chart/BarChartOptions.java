package it.ricfed.wicket.googlecharts.options.chart;

import it.ricfed.wicket.googlecharts.options.Axis;
import it.ricfed.wicket.googlecharts.options.Serie;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class BarChartOptions provides options, that are available for
 * {@link Bar}.
 * 
 * @author ricfed
 */
@JsonInclude(Include.NON_NULL)
public class BarChartOptions extends ChartOptions {

	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	@JsonProperty(value = "bar.groupWidth")
	private Object barGroupWidth; /*
								 * number or string The golden ratio,
								 * approximately '61.8%'. The width of a group
								 * of bars, specified in either of these
								 * formats: Pixels (e.g. 50). Percentage of the
								 * available width for each group (e.g. '20%'),
								 * where '100%' means that groups have no space
								 * between them.
								 */
	private Boolean isStacked;/*
							 * boolean false If set to true, series elements are
							 * stacked.
							 */

	private Axis[] hAxes;
	private Serie[] series;

	public Object getBarGroupWidth() {
		return barGroupWidth;
	}

	public void setBarGroupWidth(Object barGroupWidth) {
		this.barGroupWidth = barGroupWidth;
	}

	public Boolean getIsStacked() {
		return isStacked;
	}

	public void setIsStacked(Boolean isStacked) {
		this.isStacked = isStacked;
	}

	@JsonProperty("hAxes")
	public Axis[] getHAxes() {
		return hAxes;
	}

	public void setHAxes(Axis[] hAxes) {
		this.hAxes = hAxes;
	}

	public Serie[] getSeries() {
		return series;
	}

	public void setSeries(Serie[] series) {
		this.series = series;
	}

}
