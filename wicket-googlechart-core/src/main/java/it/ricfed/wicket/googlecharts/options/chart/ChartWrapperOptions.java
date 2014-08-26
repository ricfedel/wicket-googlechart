package it.ricfed.wicket.googlecharts.options.chart;

import it.ricfed.wicket.googlecharts.data.ChartData;
import it.ricfed.wicket.googlecharts.data.DataTable;
import it.ricfed.wicket.googlecharts.utils.DataTableHelper;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ChartWrapperOptions implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = -4402800788520330294L;

	private DataTable dataTable;
	private String chartType; /*
							 * String Required none The class name of the
							 * visualization. The google.visualization package
							 * name can be omitted for Google charts. If the
							 * appropriate visualization library has not already
							 * been loaded, this method will load the library
							 * for you if this is a Google visualization; you
							 * must load third party visualizations explicitly.
							 * Examples: Table, PieChart,
							 * example.com.CrazyChart.
							 */
	private String containerId; /*
								 * String Required none The ID of the DOM
								 * element on your page that will host the
								 * visualization.
								 */
	private AbstractChartOptions options; /*
										 * Object Optional none An object
										 * describing the options for the
										 * visualization. You can use either
										 * JavaScript literal notation, or
										 * provide a handle to the object.
										 * Example: "options": {"width": 400,
										 * "height": 240, "is3D": true, "title":
										 * "Company Performance"}
										 */
	private String dataSourceUrl; /*
								 * String Optional None A data source query to
								 * populate the chart data (for example, a
								 * Google Spreadsheet). You must specify either
								 * this property or the dataTable property.
								 */
	private String query; /*
						 * String Optional None If specifying dataSourceUrl, you
						 * can optionally specify a SQL-like query string using
						 * the Visualization query language to filter or
						 * manipulate the data.
						 */
	private Integer refreshInterval;
	/*
	 * Number Optional None How often, in seconds, the visualization should
	 * refresh its query source. Use this only when specifying dataSourceUrl.
	 */
	private Object view; /*
						 * Object OR Array Optional None Sets a DataView
						 * initializer object, which acts as a filter over the
						 * underlying data, as defined by either the dataTable
						 * or dataSourceUrl parameter. You can pass in either a
						 * string or DataView initializer object, like that
						 * returned by dataview.toJSON(). Example: "view":
						 * {"columns": [1, 2]} You can also pass in an array of
						 * DataView initializer objects, in which case the first
						 * DataView in the array is applied to the underlying
						 * data to create a new data table, and the second
						 * DataView is applied to the data table resulting from
						 * application of the first DataView, and so on.
						 */

	public DataTable getDataTable() {
		return dataTable;
	}

	public void setDataTable(DataTable dataTable) {
		this.dataTable = dataTable;
	}

	public void setDataTable(ChartData data) {
		this.dataTable = DataTableHelper.makeDataTable(data);
	}

	public String getChartType() {
		return chartType;
	}

	public void setChartType(String chartType) {
		this.chartType = chartType;
	}

	public String getContainerId() {
		return containerId;
	}

	public void setContainerId(String containerId) {
		this.containerId = containerId;
	}

	public AbstractChartOptions getOptions() {
		return options;
	}

	public void setOptions(AbstractChartOptions options) {
		this.options = options;
	}

	public String getDataSourceUrl() {
		return dataSourceUrl;
	}

	public void setDataSourceUrl(String dataSourceUrl) {
		this.dataSourceUrl = dataSourceUrl;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public Integer getRefreshInterval() {
		return refreshInterval;
	}

	public void setRefreshInterval(Integer refreshInterval) {
		this.refreshInterval = refreshInterval;
	}

	public Object getView() {
		return view;
	}

	public void setView(Object view) {
		this.view = view;
	}

}
