package it.ricfed.wicket.googlecharts.chart;

import it.ricfed.wicket.googlecharts.core.Chart;
import it.ricfed.wicket.googlecharts.wrapper.chart.LineChartWrapper;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;


public class LineChart extends Chart<LineChartWrapper>{

	private static final long serialVersionUID = -7460695892808795726L;

	public LineChart(String id, IModel<LineChartWrapper> c) {
		super(id, c);
	}


	public LineChart(String id) {
		super(id,Model.of(new LineChartWrapper()));
	}


}
