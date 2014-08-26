package it.ricfed.wicket.googlecharts.options.chart;

import it.ricfed.wicket.googlecharts.options.Annotations;
import it.ricfed.wicket.googlecharts.options.Axis;

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
public class ChartOptions extends ChartBaseOptions {

	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	private Annotations annotations;
	private String axisTitlesPosition; /*
										 * string 'out' Where to place the axis
										 * titles, compared to the chart area.
										 * Supported values:
										 * 
										 * in - Draw the axis titles inside the
										 * the chart area. out - Draw the axis
										 * titles outside the chart area. none -
										 * Omit the axis titles.
										 */
	private Float dataOpacity;/*
							 * number 1.0 The transparency of data points, with
							 * 1.0 being completely opaque and 0.0 fully
							 * transparent. In scatter, histogram, bar, and
							 * column charts, this refers to the visible data:
							 * dots in the scatter chart and rectangles in the
							 * others. In charts where selecting data creates a
							 * dot, such as the line and area charts, this
							 * refers to the circles that appear upon hover or
							 * selection. The combo chart exhibits both
							 * behaviors, and this option has no effect on other
							 * charts. (To change the opacity of a trendline,
							 * see trendline opacity.)
							 */

	private String focusTarget;/*
								 * string 'datum' The type of the entity that
								 * receives focus on mouse hover. Also affects
								 * which entity is selected by mouse click, and
								 * which data table element is associated with
								 * events. Can be one of the following:
								 * 
								 * 'datum' - Focus on a single data point.
								 * Correlates to a cell in the data table.
								 * 'category' - Focus on a grouping of all data
								 * points along the major axis. Correlates to a
								 * row in the data table. In focusTarget
								 * 'category' the tooltip displays all the
								 * category values. This may be useful for
								 * comparing values of different series.
								 */
	private Axis hAxis;

	private String theme;/*
						 * string null A theme is a set of predefined option
						 * values that work together to achieve a specific chart
						 * behavior or visual effect. Currently only one theme
						 * is available: 'maximized' - Maximizes the area of the
						 * chart, and draws the legend and all of the labels
						 * inside the chart area. Sets the following options:
						 * chartArea: {width: '100%', height: '100%'}, legend:
						 * {position: 'in'}, titlePosition: 'in',
						 * axisTitlesPosition: 'in', hAxis: {textPosition:
						 * 'in'}, vAxis: {textPosition: 'in'}
						 */
	private Axis vAxis;/*
						 * Object null An object with members to configure
						 * various vertical axis elements. To specify properties
						 * of this object, you can use object literal notation,
						 * as shown here:
						 * 
						 * {title: 'Hello', titleTextStyle: {color: '#FF0000'}}
						 */

	public Annotations getAnnotations() {
		return annotations;
	}

	public void setAnnotations(Annotations annotations) {
		this.annotations = annotations;
	}

	public String getAxisTitlesPosition() {
		return axisTitlesPosition;
	}

	public void setAxisTitlesPosition(String axisTitlesPosition) {
		this.axisTitlesPosition = axisTitlesPosition;
	}

	public Float getDataOpacity() {
		return dataOpacity;
	}

	public void setDataOpacity(Float dataOpacity) {
		this.dataOpacity = dataOpacity;
	}

	public String getFocusTarget() {
		return focusTarget;
	}

	public void setFocusTarget(String focusTarget) {
		this.focusTarget = focusTarget;
	}

	@JsonProperty("hAxis")
	public Axis getHAxis() {
		return hAxis;
	}

	public void setHAxis(Axis hAxis) {
		this.hAxis = hAxis;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	@JsonProperty("vAxis")
	public Axis getVAxis() {
		return vAxis;
	}

	public void setVAxis(Axis vAxis) {
		this.vAxis = vAxis;
	}

}
