package it.ricfed.wicket.googlecharts.chart;

import it.ricfed.wicket.googlecharts.core.Chart;
import it.ricfed.wicket.googlecharts.wrapper.chart.ComboChartWrapper;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;


public class ComboChart extends Chart<ComboChartWrapper>{

	private static final long serialVersionUID = -7460695892808795726L;

	public ComboChart(String id, IModel<ComboChartWrapper> c) {
		super(id, c);
	}


	public ComboChart(String id) {
		super(id,Model.of(new ComboChartWrapper()));
	}


}
