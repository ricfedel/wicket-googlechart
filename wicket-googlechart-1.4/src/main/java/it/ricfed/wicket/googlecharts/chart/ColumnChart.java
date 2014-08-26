package it.ricfed.wicket.googlecharts.chart;

import it.ricfed.wicket.googlecharts.core.Chart;
import it.ricfed.wicket.googlecharts.wrapper.chart.ColumnChartWrapper;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;


public class ColumnChart extends Chart<ColumnChartWrapper> {

	private static final long serialVersionUID = -7460695892808795726L;

	public ColumnChart(String id, IModel<ColumnChartWrapper> c) {
		super(id, c);
	}

	public ColumnChart(String id) {
		super(id, Model.of(new ColumnChartWrapper()));
	}
}
