package it.ricfed.wicket.googlecharts.wrapper;

import it.ricfed.wicket.googlecharts.data.ChartData;
import it.ricfed.wicket.googlecharts.data.DataTable;
import it.ricfed.wicket.googlecharts.options.chart.AbstractChartOptions;
import it.ricfed.wicket.googlecharts.options.chart.ChartWrapperOptions;
import it.ricfed.wicket.googlecharts.utils.ClassHelper;

import java.io.Serializable;

public abstract class ChartWrapper<O extends AbstractChartOptions> extends
		Wrapper implements Serializable {

	private static final long serialVersionUID = 4054134008352228006L;

	public static final String BAR_CHART = "BarChart";

	public static final String COLUMN_CHART = "ColumnChart";

	public static final String PIE_CHART = "PieChart";

	public static final String AREA_CHART = "AreaChart";

	public static final String TABLE = "Table";

	public static final String LINE_CHART = "LineChart";

	public static final String COMBO_CHART = "ComboChart";

	public static final String ORG_CHART = "OrgChart";

	/** The options. */
	private ChartWrapperOptions wrapperOptions;
	private Class<O> classOptions;

	public void setDataTable(ChartData data) {
		getWrapperOptions().setDataTable(data);
	}

	public ChartWrapper() {
		super();
	}

	protected Class<O> getClassOptions() {
		if (classOptions == null) {
			classOptions = (Class<O>) ClassHelper.findGenericClass(getClass());
		}
		return classOptions;
	}

	public O getOptions() {
		return (O) getWrapperOptions().getOptions();
	}

	public ChartWrapperOptions getWrapperOptions() {
		if (wrapperOptions == null) {
			wrapperOptions = new ChartWrapperOptions();
		}
		if (wrapperOptions.getOptions() == null) {
			try {
				wrapperOptions.setOptions(getClassOptions().newInstance());
			} catch (Throwable t) {
				System.err.println(t.getMessage());
			}
		}
		wrapperOptions.setChartType(getType());
		return wrapperOptions;
	}

	public void setWrapperOptions(ChartWrapperOptions wrapperOptions) {
		this.wrapperOptions = wrapperOptions;
	}

	public DataTable getDataTable() {
		return getWrapperOptions().getDataTable();
	}

	public void setDataTable(DataTable dataTable) {
		getWrapperOptions().setDataTable(dataTable);
	}

}
