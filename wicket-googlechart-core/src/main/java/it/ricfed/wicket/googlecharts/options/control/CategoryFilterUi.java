package it.ricfed.wicket.googlecharts.options.control;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CategoryFilterUi implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = -2721056125142808401L;
	private String caption;/*
							 * string 'Choose a value...' The caption to display
							 * inside the value picker widget when no item is
							 * selected.
							 */
	private Boolean sortValues;/*
								 * boolean true Whether the values to choose
								 * from should be sorted.
								 */
	private String selectedValuesLayout;/*
										 * string 'aside' How to display
										 * selected values, when multiple
										 * selection is allowed. Possible values
										 * are: 'aside': selected values will
										 * display in a single text line next to
										 * the value picker widget, 'below':
										 * selected values will display in a
										 * single text line below the widget,
										 * 'belowWrapping': similar to below,
										 * but entries that cannot fit in the
										 * picker will wrap to a new line,
										 * 'belowStacked': selected values will
										 * be displayed in a column below the
										 * widget.
										 */
	private Boolean allowNone;/*
							 * boolean true Whether the user is allowed not to
							 * choose any value. If false the user must choose
							 * at least one value from the available ones.
							 * During control initialization, if the option is
							 * set to false and no selectedValues state is
							 * given, the first value from the avaiable ones is
							 * automatically seleted.
							 */
	private Boolean allowMultiple;/*
								 * boolean true Whether multiple values can be
								 * selected, rather than just one.
								 */
	private Boolean allowTyping;/*
								 * boolean true Whether the user is allowed to
								 * type in a text field to narrow down the list
								 * of possible choices (via an autocompleter),
								 * or not.
								 */
	private String label;/*
						 * string auto The label to display next to the category
						 * picker. If unspecified, the label of the column the
						 * control operates on will be used.
						 */
	private String labelSeparator;/*
								 * string none A separator string appended to
								 * the label, to visually separate the label
								 * from the category picker.
								 */
	private String labelStacking;/*
								 * string 'horizontal' Whether the label should
								 * display above (vertical stacking) or beside
								 * (horizontal stacking) the category picker.
								 * Use either 'vertical' or 'horizontal'.
								 */
	private String cssClass;/*
							 * string
							 * 'google-visualization-controls-categoryfilter'
							 * The CSS class to assign to the control, for
							 * custom styling.
							 */

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public Boolean getSortValues() {
		return sortValues;
	}

	public void setSortValues(Boolean sortValues) {
		this.sortValues = sortValues;
	}

	public String getSelectedValuesLayout() {
		return selectedValuesLayout;
	}

	public void setSelectedValuesLayout(String selectedValuesLayout) {
		this.selectedValuesLayout = selectedValuesLayout;
	}

	public Boolean getAllowNone() {
		return allowNone;
	}

	public void setAllowNone(Boolean allowNone) {
		this.allowNone = allowNone;
	}

	public Boolean getAllowMultiple() {
		return allowMultiple;
	}

	public void setAllowMultiple(Boolean allowMultiple) {
		this.allowMultiple = allowMultiple;
	}

	public Boolean getAllowTyping() {
		return allowTyping;
	}

	public void setAllowTyping(Boolean allowTyping) {
		this.allowTyping = allowTyping;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabelSeparator() {
		return labelSeparator;
	}

	public void setLabelSeparator(String labelSeparator) {
		this.labelSeparator = labelSeparator;
	}

	public String getLabelStacking() {
		return labelStacking;
	}

	public void setLabelStacking(String labelStacking) {
		this.labelStacking = labelStacking;
	}

	public String getCssClass() {
		return cssClass;
	}

	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}

}
