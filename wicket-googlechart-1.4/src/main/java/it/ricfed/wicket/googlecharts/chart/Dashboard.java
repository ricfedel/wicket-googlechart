package it.ricfed.wicket.googlecharts.chart;

import it.ricfed.wicket.googlecharts.core.Binding;
import it.ricfed.wicket.googlecharts.core.DashboardBehavior;
import it.ricfed.wicket.googlecharts.core.IChart;
import it.ricfed.wicket.googlecharts.core.IDashboard;
import it.ricfed.wicket.googlecharts.core.IWrapperContainer;
import it.ricfed.wicket.googlecharts.core.WrapperContainer;
import it.ricfed.wicket.googlecharts.data.ChartData;
import it.ricfed.wicket.googlecharts.data.DataTable;
import it.ricfed.wicket.googlecharts.utils.DataTableHelper;
import it.ricfed.wicket.googlecharts.wrapper.Wrapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.Component;


public class Dashboard extends WrapperContainer implements IDashboard{

	private static final long serialVersionUID = -5882448897795445250L;


	private List<Binding> binding;

	private DataTable dataTable;

	public Dashboard(String id) {
		super(id);
	}


	@Override
	protected void onInitialize() {
		super.onInitialize();
		setOutputMarkupId(true);
		add(new DashboardBehavior(this));
	}

	@Override
	public void add(IChart<?> chart){
		chart.setInDashboard(true);
		chart.getWrapper().getWrapperOptions().setDataTable((DataTable)null);
		super.add((Component)chart);
	}

	
	@Override
	public boolean isInDashboard() {
		return false;
	}

	@Override
	public List<IWrapperContainer> getElements() {
		 List<IWrapperContainer> items=new ArrayList<IWrapperContainer>();
		 int n=size();
		 for (int i = 0; i < n; i++) {
			 Component c=get(i);
			 if(c instanceof IWrapperContainer)
				 items.add((IWrapperContainer)c);
		}
		return items;
	}
	
	@Override
	public List<Binding> getBinding() {
		return binding;
	}


	@Override
	public void setBinding(List<Binding> binding) {
		this.binding = binding;
	}

	@Override
	public DataTable getDataTable() {
		return dataTable;
	}

	@Override
	public void setDataTable(DataTable dataTable) {
		this.dataTable = dataTable;
	}

	@Override
	public void setDataTable(ChartData data) {
		this.dataTable = DataTableHelper.makeDataTable(data);
	}

	@Override
	public boolean isControl() {
		return false;
	}


	@Override
	public Wrapper getWrapper() {
		return null;
	}

}
