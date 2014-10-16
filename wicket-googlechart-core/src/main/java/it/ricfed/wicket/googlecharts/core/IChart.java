package it.ricfed.wicket.googlecharts.core;

import java.io.Serializable;

import it.ricfed.wicket.googlecharts.data.ChartData;
import it.ricfed.wicket.googlecharts.data.DataTable;
import it.ricfed.wicket.googlecharts.wrapper.ChartWrapper;

public interface IChart<C extends ChartWrapper<?>> extends Serializable{

	public  C getWrapper();

	public  void setDataTable(DataTable dataTable);

	public  void setDataTable(ChartData data);
	
	public DataTable getDataTable();
	
	public  boolean isInDashboard();

	public  void setInDashboard(boolean inDashboard);

	public  String getMarkupId();
	
	public  String getId();

}