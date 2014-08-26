package it.ricfed.wicket.googlecharts.options.control;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CategoryFilterOptions extends ControlOptions {
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
	private Object[] values;/*
							 * Array auto List of values to choose from. If an
							 * array of Objects is used, they should have a
							 * suitable toString() representation for display to
							 * the user. If null or undefined, the list of
							 * values will be automatically computed from the
							 * values present in the DataTable column this
							 * control operates on.
							 */
	private Boolean useFormattedValue;/*
									 * boolean false When populating the list of
									 * selectable values automatically from the
									 * DataTable column this filter operates on,
									 * whether to use the actual cell values or
									 * their formatted values.
									 */
	private CategoryFilterUi ui;

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

	public Object[] getValues() {
		return values;
	}

	public void setValues(Object[] values) {
		this.values = values;
	}

	public Boolean getUseFormattedValue() {
		return useFormattedValue;
	}

	public void setUseFormattedValue(Boolean useFormattedValue) {
		this.useFormattedValue = useFormattedValue;
	}

	public CategoryFilterUi getUi() {
		return ui;
	}

	public void setUi(CategoryFilterUi ui) {
		this.ui = ui;
	}

}
