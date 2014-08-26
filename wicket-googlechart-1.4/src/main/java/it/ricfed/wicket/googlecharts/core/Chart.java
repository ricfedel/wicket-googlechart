package it.ricfed.wicket.googlecharts.core;

import it.ricfed.wicket.googlecharts.data.ChartData;
import it.ricfed.wicket.googlecharts.data.DataTable;
import it.ricfed.wicket.googlecharts.wrapper.ChartWrapper;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;

public abstract class Chart<C extends ChartWrapper<?>> extends
		WrapperContainer {

	private static final long serialVersionUID = -5882448897795445250L;

	private boolean inDashboard;

	private IModel<C> wrapper;

	public Chart(String id, IModel<C> c) {
		super(id, c);
		this.wrapper = c;
	}

	public C getWrapper() {
		return wrapper.getObject();
	}

	public void setDataTable(DataTable dataTable){
		getWrapper().setDataTable(dataTable);
	}
	public void setDataTable(ChartData data){
		getWrapper().setDataTable(data);
	}	
	
	@Override
	protected void onInitialize() {
		super.onInitialize();
		setOutputMarkupId(true);
		add(new ChartBehavior(this));
	}

	public WebMarkupContainer getDiv() {
		return this;
	}

	public boolean isInDashboard() {
		return inDashboard;
	}

	public void setInDashboard(boolean inDashboard) {
		this.inDashboard = inDashboard;
	}


}
