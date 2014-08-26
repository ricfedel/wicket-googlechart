package it.ricfed.wicket.googlecharts.wrapper;

import it.ricfed.wicket.googlecharts.options.State;
import it.ricfed.wicket.googlecharts.options.control.ControlOptions;
import it.ricfed.wicket.googlecharts.options.control.ControlWrapperOptions;
import it.ricfed.wicket.googlecharts.utils.ClassHelper;

import java.io.Serializable;

public  abstract class ControlWrapper<S extends State,O extends ControlOptions> extends
		Wrapper implements Serializable {

	private static final long serialVersionUID = 4054134008352228006L;

	public static final String CATEGORY_FILTER = "CategoryFilter";
	public static final String CHART_RANGE_FILTER = "ChartRangeFilter";
	public static final String DATE_RANGE__FILTER = "DateRangeFilter";
	public static final String NUMBER_RANGE__FILTER = "NumberRangeFilter";
	public static final String STRING_FILTER = "StringFilter";

	/** The options. */
	private ControlWrapperOptions wrapperOptions;

	private Class<O> classOptions;

	private Class<S> classState;


	public ControlWrapper() {
		super();
	}


	public ControlWrapperOptions getWrapperOptions() {
		if (wrapperOptions == null) {
			wrapperOptions = new ControlWrapperOptions();
		}
		if (wrapperOptions.getOptions() == null) {
			try {
				wrapperOptions.setState(getClassState().newInstance());
				wrapperOptions.setOptions(getClassOptions().newInstance());
			} catch (Throwable t) {
				System.err.println(t.getMessage());
			}
		}		
        wrapperOptions.setControlType(getType());
		return wrapperOptions;
	}

	protected Class<O> getClassOptions() {
		if (classOptions == null) {
			classOptions = (Class<O>) ClassHelper
					.findGenericClass(getClass(),1);
		}
		return classOptions;
	}
	protected Class<S> getClassState() {
		if (classState == null) {
			classState = (Class<S>) ClassHelper
					.findGenericClass(getClass(),0);
		}
		return classState;
	}
	public O getOptions() {
		return (O) getWrapperOptions().getOptions();
	}
	public S getState() {
		return (S) getWrapperOptions().getState();
	}
	public void setWrapperOptions(ControlWrapperOptions wrapperOptions) {
		this.wrapperOptions = wrapperOptions;
	}


}
