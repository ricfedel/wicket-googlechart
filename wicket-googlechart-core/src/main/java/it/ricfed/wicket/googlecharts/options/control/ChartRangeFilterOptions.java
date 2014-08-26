package it.ricfed.wicket.googlecharts.options.control;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ChartRangeFilterOptions extends ControlOptions {
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
	private ChartRangeFilterUi ui;

	public String getFilterColumnLabel() {
		return filterColumnLabel;
	}

	public void setFilterColumnLabel(String filterColumnLabel) {
		this.filterColumnLabel = filterColumnLabel;
	}

	public Integer getFilterColumnIndex() {
		return filterColumnIndex;
	}

	public void setFilterColumnIndex(Integer filterColumnIndex) {
		this.filterColumnIndex = filterColumnIndex;
	}

	public ChartRangeFilterUi getUi() {
		return ui;
	}

	public void setUi(ChartRangeFilterUi ui) {
		this.ui = ui;
	}

}
