package it.ricfed.wicket.googlecharts.core;

import it.ricfed.wicket.googlecharts.wrapper.ControlWrapper;

import org.apache.wicket.model.IModel;

/**
 * The Class AbstractChartPanel provides the base panel holding the chart
 * rendering canvas element.
 * 
 * @param <C>
 *            the generic type of the chart
 */
public abstract class ControlContainer<C extends ControlWrapper<?,?>> extends WrapperContainer {

	private static final long serialVersionUID = -5882448897795445250L;

	private IModel<C> wrapper;

	public ControlContainer(String id, IModel<C> c) {
		super(id, c);
		this.wrapper = c;
	}


	public C getWrapper() {
		return wrapper.getObject();
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();
		setOutputMarkupId(true);
		add(new ControlBehavior(this));
	}

	@Override
	public boolean isInDashboard() {
		return true;
	}
	@Override
	public  boolean isControl(){
		return true;
	}

}
