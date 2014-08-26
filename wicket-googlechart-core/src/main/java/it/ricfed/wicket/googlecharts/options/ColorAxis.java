package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ColorAxis implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = 8043299712554590178L;
	private Number minValue;/*
							 * number Minimum value of color column in chart
							 * data. If present, specifies a minimum value for
							 * chart color data. Color data values of this value
							 * and lower will be rendered as the first color in
							 * the colorAxis.colors range.
							 */
	private Number maxValue;/*
							 * number Maximum value of color column in chart
							 * data If present, specifies a maximum value for
							 * chart color data. Color data values of this value
							 * and higher will be rendered as the last color in
							 * the colorAxis.colors range.
							 */
	private Number[] values;/*
							 * array of numbers null If present, controls how
							 * values are associated with colors. Each value is
							 * associated with the corresponding color in the
							 * colorAxis.colors array. These values apply to the
							 * chart color data. Coloring is done according to a
							 * gradient of the values specified here. Not
							 * specifying a value for this option is equivalent
							 * to specifying [minValue, maxValue].
							 */
	private String[] colors;/*
							 * array of color strings null Colors to assign to
							 * values in the visualization. An array of strings,
							 * where each element is an HTML color string, for
							 * example: colorAxis: {colors:['red','#004411']}.
							 * You must have at least two values; the gradient
							 * will include all your values, plus calculated
							 * intermediary values, with the first color as the
							 * smallest value, and the last color as the
							 * highest.
							 */
	private Legend legend;/*
						 * Object null An object that specifies the style of the
						 * gradient color legend. colorAxis.legend.position
						 * Object 'top' Position of the legend. Can be one of
						 * the following: 'top' - Above the chart. 'bottom' -
						 * Below the chart. 'in' - Inside the chart, at the top.
						 * 'none' - No legend is displayed.
						 * colorAxis.legend.textStyle Object {color: 'black',
						 * fontName: <global-font-name>, fontSize:
						 * <global-font-size>} An object that specifies the
						 * legend text style. The object has this format:
						 * 
						 * {color: <string>, fontName: <string>, fontSize:
						 * <number>} The color can be any HTML color string, for
						 * example: 'red' or '#00cc00'. Also see fontName and
						 * fontSize.
						 * 
						 * colorAxis.legend.numberFormat string auto A format
						 * string for numeric labels. This is a subset of the
						 * ICU pattern set. For instance, {numberFormat:'.##'}
						 * will display values "10.66", "10.6", and "10.0" for
						 * values 10.666, 10.6, and 10.
						 */

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

	public Number[] getValues() {
		return values;
	}

	public void setValues(Number[] values) {
		this.values = values;
	}

	public String[] getColors() {
		return colors;
	}

	public void setColors(String[] colors) {
		this.colors = colors;
	}

	public Legend getLegend() {
		return legend;
	}

	public void setLegend(Legend legend) {
		this.legend = legend;
	}

}
