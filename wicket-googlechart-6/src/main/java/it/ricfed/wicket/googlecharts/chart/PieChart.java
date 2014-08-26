package it.ricfed.wicket.googlecharts.chart;

import it.ricfed.wicket.googlecharts.core.Chart;
import it.ricfed.wicket.googlecharts.wrapper.chart.PieChartWrapper;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class PieChart extends Chart<PieChartWrapper>{

	private static final long serialVersionUID = 5774793986142044409L;


	public PieChart(String id, IModel<PieChartWrapper> c) {
		super(id, c);
	}


	public PieChart(String id) {
		super(id,Model.of(new PieChartWrapper()));
	}


}
