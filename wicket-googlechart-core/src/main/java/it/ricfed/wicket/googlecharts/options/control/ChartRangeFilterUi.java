package it.ricfed.wicket.googlecharts.options.control;

import it.ricfed.wicket.googlecharts.options.chart.ChartOptions;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ChartRangeFilterUi implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = -2721056125142808401L;
	private String chartType;/*
							 * string 'ComboChart' The type of the chart drawn
							 * inside the control. Can be one of: 'AreaChart',
							 * 'LineChart', 'ComboChart' or 'ScatterChart'.
							 */
	private ChartOptions chartOptions;/*
									 * Object { 'enableInteractivity': false,
									 * 'chartArea': {'height': '100%'},
									 * 'legend': {'position': 'none'}, 'hAxis':
									 * {'textPosition': 'in'}, 'vAxis': {
									 * 'textPosition': 'none', 'gridlines':
									 * {'color': 'none'} } }
									 * 
									 * The configuration options of the chart
									 * drawn inside the control. Allows the same
									 * level of configuration as any chart in
									 * the dashboard, and complies with the same
									 * format as accepted by
									 * ChartWrapper.setOptions(). You can
									 * specify additional options or override
									 * the default ones (note that the defaults
									 * have been carefully chosen for optimal
									 * appearance, though).
									 */
	private Object chartView;/*
							 * Object or string (serialized Object) null
							 * Specification of the view to apply to the data
							 * table used to draw the chart inside the control.
							 * Allows the same level of configuration as any
							 * chart in the dashboard, and complies with the
							 * same format as accepted by
							 * ChartWrapper.setView(). If not specified, the
							 * data table itself is used to draw the chart.
							 * Please note that the horizontal axis of the drawn
							 * chart must be continuous, so be careful to
							 * specify ui.chartView accordingly.
							 */
	private Number minRangeSize;/*
								 * number Data value difference interpreted as 1
								 * pixel The minimum selectable range size
								 * (range.end - range.start), specified in data
								 * value units. For a numeric axis, it is a
								 * number (not necessarily an integer). For a
								 * date, datetime or timeofday axis, it is an
								 * integer that specifies the difference in
								 * milliseconds.
								 */
	private Boolean snapToData;/*
								 * boolean false If true, range thumbs are
								 * snapped to the nearest data points. In this
								 * case, the end points of the range returned by
								 * getState() are necessarily values in the data
								 * table.
								 */

	public String getChartType() {
		return chartType;
	}

	public void setChartType(String chartType) {
		this.chartType = chartType;
	}

	public ChartOptions getChartOptions() {
		return chartOptions;
	}

	public void setChartOptions(ChartOptions chartOptions) {
		this.chartOptions = chartOptions;
	}

	public Object getChartView() {
		return chartView;
	}

	public void setChartView(Object chartView) {
		this.chartView = chartView;
	}

	public Number getMinRangeSize() {
		return minRangeSize;
	}

	public void setMinRangeSize(Number minRangeSize) {
		this.minRangeSize = minRangeSize;
	}

	public Boolean getSnapToData() {
		return snapToData;
	}

	public void setSnapToData(Boolean snapToData) {
		this.snapToData = snapToData;
	}

}
