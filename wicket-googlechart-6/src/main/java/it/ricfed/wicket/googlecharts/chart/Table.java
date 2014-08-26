package it.ricfed.wicket.googlecharts.chart;

import it.ricfed.wicket.googlecharts.core.Chart;
import it.ricfed.wicket.googlecharts.wrapper.chart.TableWrapper;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class Table extends Chart<TableWrapper> {

	private static final long serialVersionUID = -7460695892808795726L;

	public Table(String id, IModel<TableWrapper> c) {
		super(id, c);
	}

	public Table(String id) {
		super(id, Model.of(new TableWrapper()));
	}

}
