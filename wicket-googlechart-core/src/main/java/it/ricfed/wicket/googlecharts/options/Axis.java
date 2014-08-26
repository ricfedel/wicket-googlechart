package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Axis implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = -4293614152158978580L;

	private Integer baseline; /*
							 * number automatic The baseline for the horizontal
							 * axis.
							 */
	private String baselineColor; /*
								 * number 'black' The color of the baseline for
								 * the horizontal axis. Can be any HTML color
								 * string, for example: 'red' or '#00cc00'.
								 */
	private Integer direction; /*
								 * 1 or -1 1 The direction in which the values
								 * along the horizontal axis grow. Specify -1 to
								 * reverse the order of the values.
								 */
	private String format; /*
							 * string auto A format string for numeric axis
							 * labels. This is a subset of the ICU pattern set.
							 * For instance, {format:'#,###%'} will display
							 * values "1,000%", "750%", and "50%" for values 10,
							 * 7.5, and 0.5. The actual formatting applied to
							 * the label is derived from the locale the API has
							 * been loaded with. For more details, see loading
							 * charts with a specific locale.
							 */
	private Gridlines gridlines; /*
								 * Object null An object with members to
								 * configure the gridlines on the horizontal
								 * axis. To specify properties of this object,
								 * you can use object literal notation, as shown
								 * here:
								 * 
								 * {color: '#333', count: 4}
								 */
	private Gridlines minorGridlines;
	/*
	 * Object null An object with members to configure the minor gridlines on
	 * the horizontal axis, similar to the gridlines option.
	 * minorGridlines.color string A blend of the gridline and background colors
	 * The color of the horizontal minor gridlines inside the chart area.
	 * Specify a valid HTML color string. minorGridlines.count number 0 The
	 * number of horizontal minor gridlines between two regular gridlines.
	 */
	private Boolean logScale;/*
							 * boolean false hAxis property that makes the
							 * horizontal axis a logarithmic scale (requires all
							 * values to be positive). Set to true for yes.
							 */
	private TextStyle textStyle;/*
								 * Object {color: 'black', fontName:
								 * <global-font-name>, fontSize:
								 * <global-font-size>} An object that specifies
								 * the horizontal axis text style. The object
								 * has this format:
								 * 
								 * { color: <string>, fontName: <string>,
								 * fontSize: <number>, bold: <boolean>, italic:
								 * <boolean> } The color can be any HTML color
								 * string, for example: 'red' or '#00cc00'. Also
								 * see fontName and fontSize.
								 */
	private String textPosition;/*
								 * string 'out' Position of the horizontal axis
								 * text, relative to the chart area. Supported
								 * values: 'out', 'in', 'none'.
								 */
	private Object[] ticks;/*
							 * Array of elements auto Replaces the automatically
							 * generated X-axis ticks with the specified array.
							 * Each element of the array should be either a
							 * valid tick value (such as a number, date,
							 * datetime, or timeofday), or an object. If it's an
							 * object, it should have a v property for the tick
							 * value, and an optional f property containing the
							 * literal string to be displayed as the label.
							 * 
							 * Examples:
							 * 
							 * hAxis: { ticks: [5,10,15,20] } hAxis: { ticks:
							 * [{v:32, f:'thirty two'}, {v:64, f:'sixty four'}]
							 * } hAxis: { ticks: [new Date(2014,3,15), new
							 * Date(2013,5,15)] } hAxis: { ticks: [16, {v:32,
							 * f:'thirty two'}, {v:64, f:'sixty four'}, 128] }
							 */
	private String title;/*
						 * string null hAxis property that specifies the title
						 * of the horizontal axis.
						 */
	private TextStyle titleTextStyle;/*
									 * Object {color: 'black', fontName:
									 * <global-font-name>, fontSize:
									 * <global-font-size>} An object that
									 * specifies the horizontal axis title text
									 * style. The object has this format:
									 * 
									 * { color: <string>, fontName: <string>,
									 * fontSize: <number>, bold: <boolean>,
									 * italic: <boolean> } The color can be any
									 * HTML color string, for example: 'red' or
									 * '#00cc00'. Also see fontName and
									 * fontSize.
									 */
	private Integer maxValue;/*
							 * number automatic Moves the max value of the
							 * horizontal axis to the specified value; this will
							 * be rightward in most charts. Ignored if this is
							 * set to a value smaller than the maximum x-value
							 * of the data. viewWindow.max overrides this
							 * property.
							 */
	private Integer minValue;/*
							 * number automatic Moves the min value of the
							 * horizontal axis to the specified value; this will
							 * be leftward in most charts. Ignored if this is
							 * set to a value greater than the minimum x-value
							 * of the data. viewWindow.min overrides this
							 * property.
							 */
	private String viewWindowMode;/*
								 * string Equivalent to 'pretty', but
								 * haxis.viewWindow.min and haxis.viewWindow.max
								 * take precedence if used. Specifies how to
								 * scale the horizontal axis to render the
								 * values within the chart area. The following
								 * string values are supported:
								 * 
								 * 'pretty' - Scale the horizontal values so
								 * that the maximum and minimum data values are
								 * rendered a bit inside the left and right of
								 * the chart area. This will cause
								 * haxis.viewWindow.min and haxis.viewWindow.max
								 * to be ignored. 'maximized' - Scale the
								 * horizontal values so that the maximum and
								 * minimum data values touch the left and right
								 * of the chart area. This will cause
								 * haxis.viewWindow.min and haxis.viewWindow.max
								 * to be ignored. 'explicit' - A deprecated
								 * option for specifying the left and right
								 * scale values of the chart area. (Deprecated
								 * because it's redundant with
								 * haxis.viewWindow.min and
								 * haxis.viewWindow.max.) Data values outside
								 * these values will be cropped. You must
								 * specify an viewWindow object describing the
								 * maximum and minimum values to show.
								 */
	private WiewWindow viewWindow;/*
								 * Object null Specifies the cropping range of
								 * the horizontal axis.
								 */

	public Integer getBaseline() {
		return baseline;
	}

	public void setBaseline(Integer baseline) {
		this.baseline = baseline;
	}

	public String getBaselineColor() {
		return baselineColor;
	}

	public void setBaselineColor(String baselineColor) {
		this.baselineColor = baselineColor;
	}

	public Integer getDirection() {
		return direction;
	}

	public void setDirection(Integer direction) {
		this.direction = direction;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public Gridlines getGridlines() {
		return gridlines;
	}

	public void setGridlines(Gridlines gridlines) {
		this.gridlines = gridlines;
	}

	public Gridlines getMinorGridlines() {
		return minorGridlines;
	}

	public void setMinorGridlines(Gridlines minorGridlines) {
		this.minorGridlines = minorGridlines;
	}

	public Boolean getLogScale() {
		return logScale;
	}

	public void setLogScale(Boolean logScale) {
		this.logScale = logScale;
	}

	public TextStyle getTextStyle() {
		return textStyle;
	}

	public void setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
	}

	public String getTextPosition() {
		return textPosition;
	}

	public void setTextPosition(String textPosition) {
		this.textPosition = textPosition;
	}

	public Object[] getTicks() {
		return ticks;
	}

	public void setTicks(Object[] ticks) {
		this.ticks = ticks;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public TextStyle getTitleTextStyle() {
		return titleTextStyle;
	}

	public void setTitleTextStyle(TextStyle titleTextStyle) {
		this.titleTextStyle = titleTextStyle;
	}

	public Integer getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(Integer maxValue) {
		this.maxValue = maxValue;
	}

	public Integer getMinValue() {
		return minValue;
	}

	public void setMinValue(Integer minValue) {
		this.minValue = minValue;
	}

	public String getViewWindowMode() {
		return viewWindowMode;
	}

	public void setViewWindowMode(String viewWindowMode) {
		this.viewWindowMode = viewWindowMode;
	}

	public WiewWindow getViewWindow() {
		return viewWindow;
	}

	public void setViewWindow(WiewWindow viewWindow) {
		this.viewWindow = viewWindow;
	}

}
