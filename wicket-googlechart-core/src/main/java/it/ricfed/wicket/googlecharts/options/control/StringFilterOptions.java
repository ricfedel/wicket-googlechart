package it.ricfed.wicket.googlecharts.options.control;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class StringFilterOptions extends ControlOptions {
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
	private String matchType;/*
							 * string 'prefix' Whether the control should match
							 * exact values only ('exact'), prefixes starting
							 * from the beginning of the value ('prefix') or any
							 * substring ('any').
							 */
	private Boolean caseSensitive;/*
								 * boolean false Whether matching should be case
								 * sensitive or not.
								 */
	private Boolean useFormattedValue;/*
									 * boolean false Whether the control should
									 * match against cell formatted values or
									 * againt actual values.
									 */
	private StringFilterUi ui;

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

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public Boolean getCaseSensitive() {
		return caseSensitive;
	}

	public void setCaseSensitive(Boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
	}

	public Boolean getUseFormattedValue() {
		return useFormattedValue;
	}

	public void setUseFormattedValue(Boolean useFormattedValue) {
		this.useFormattedValue = useFormattedValue;
	}

	public StringFilterUi getUi() {
		return ui;
	}

	public void setUi(StringFilterUi ui) {
		this.ui = ui;
	}

}
