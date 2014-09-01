package it.ricfed.wicket.googlecharts.chart;

import it.ricfed.wicket.googlecharts.core.Chart;
import it.ricfed.wicket.googlecharts.wrapper.chart.AreaChartWrapper;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;


public class AreaChart extends Chart<AreaChartWrapper>{

	private static final long serialVersionUID = -7460695892808795726L;

	public AreaChart(String id, IModel<AreaChartWrapper> c) {
		super(id, c);
	}


	public AreaChart(String id) {
		super(id,Model.of(new AreaChartWrapper()));
	}




}
