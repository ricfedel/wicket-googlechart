package it.ricfed.wicket.googlecharts.chart;

import it.ricfed.wicket.googlecharts.core.Chart;
import it.ricfed.wicket.googlecharts.wrapper.chart.OrgChartWrapper;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class OrgChart extends Chart<OrgChartWrapper> {

	private static final long serialVersionUID = 5774793986142044409L;

	public OrgChart(String id, IModel<OrgChartWrapper> c) {
		super(id, c);
	}

	public OrgChart(String id) {
		super(id, Model.of(new OrgChartWrapper()));
	}

}
