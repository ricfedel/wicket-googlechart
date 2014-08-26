package it.ricfed.wicket.googlecharts.chart;

import it.ricfed.wicket.googlecharts.core.Chart;
import it.ricfed.wicket.googlecharts.wrapper.chart.BarChartWrapper;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;


public class BarChart extends Chart<BarChartWrapper>{

	private static final long serialVersionUID = -7460695892808795726L;

	public BarChart(String id, IModel<BarChartWrapper> c) {
		super(id, c);
	}


	public BarChart(String id) {
		super(id,Model.of(new BarChartWrapper()));
	}


}
