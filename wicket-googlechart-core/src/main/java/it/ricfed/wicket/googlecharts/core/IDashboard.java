package it.ricfed.wicket.googlecharts.core;

import it.ricfed.wicket.googlecharts.data.ChartData;
import it.ricfed.wicket.googlecharts.data.DataTable;

import java.io.Serializable;
import java.util.List;

public interface IDashboard extends Serializable{

	public  void add(IChart<?> chart);

	public  boolean isInDashboard();

	public  List<IWrapperContainer> getElements();

	public  List<Binding> getBinding();

	public  void setBinding(List<Binding> binding);

	public  DataTable getDataTable();

	public  void setDataTable(DataTable dataTable);

	public  void setDataTable(ChartData data);

}