package it.ricfed.wicket.googlecharts.options.control;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class NumberRangeFilterOptions extends ControlOptions {
	@JsonIgnore
	private static final long serialVersionUID = 907716259284683680L;
	private Integer filterColumnIndex;/*
									 * number none The column of the datatable
									 * the filter should operate upon. It is
									 * mandatory to provide either this option
									 * or filterColumnLabel. If both present,
									 * this option takes precedence.
									 */
	private String filterColumnLabel;/*
									 * string none The label of the column the
									 * filter should operate upon. It is
									 * mandatory to provide either this option
									 * or filterColumnIndex. If both present,
									 * filterColumnIndex takes precedence.
									 */
	private Number minValue;/*
							 * Date auto Minimum allowed value for the range
							 * lower extent. If undefined, the value will be
							 * inferred from the contents of the DataTable
							 * managed by the control.
							 */
	private Number maxValue;/*
							 * Date auto Maximum allowed value for the range
							 * higher extent. If undefined, the value will be
							 * inferred from the contents of the DataTable
							 * managed by the control.
							 */
	private NumberRangeFilterUi ui;

	public Integer getFilterColumnIndex() {
		return filterColumnIndex;
	}

	public void setFilterColumnIndex(Integer filterColumnIndex) {
		this.filterColumnIndex = filterColumnIndex;
	}

	public String getFilterColumnLabel() {
		return filterColumnLabel;
	}

	public void setFilterColumnLabel(String filterColumnLabel) {
		this.filterColumnLabel = filterColumnLabel;
	}

	public Number getMinValue() {
		return minValue;
	}

	public void setMinValue(Number minValue) {
		this.minValue = minValue;
	}

	public Number getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(Number maxValue) {
		this.maxValue = maxValue;
	}

	public NumberRangeFilterUi getUi() {
		return ui;
	}

	public void setUi(NumberRangeFilterUi ui) {
		this.ui = ui;
	}

}
