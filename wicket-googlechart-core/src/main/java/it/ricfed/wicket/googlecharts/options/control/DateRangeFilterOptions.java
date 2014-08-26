package it.ricfed.wicket.googlecharts.options.control;

import it.ricfed.wicket.googlecharts.utils.ScriptHelper;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DateRangeFilterOptions extends ControlOptions {
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
	private String minValue;/*
							 * Date auto Minimum allowed value for the range
							 * lower extent. If undefined, the value will be
							 * inferred from the contents of the DataTable
							 * managed by the control.
							 */
	private String maxValue;/*
							 * Date auto Maximum allowed value for the range
							 * higher extent. If undefined, the value will be
							 * inferred from the contents of the DataTable
							 * managed by the control.
							 */
	private DateRangeFilterUi ui;

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

	public String getMinValue() {
		return minValue;
	}

	@JsonIgnore
	public void setMinValue(Date date) {
		this.minValue = ScriptHelper.functionDate(date);
	}

	public void setMinValue(String minValue) {
		this.minValue = minValue;
	}

	public String getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(String maxValue) {
		this.maxValue = maxValue;
	}

	@JsonIgnore
	public void setMaxValue(Date date) {
		this.maxValue = ScriptHelper.functionDate(date);
	}

	public DateRangeFilterUi getUi() {
		return ui;
	}

	public void setUi(DateRangeFilterUi ui) {
		this.ui = ui;
	}

}
