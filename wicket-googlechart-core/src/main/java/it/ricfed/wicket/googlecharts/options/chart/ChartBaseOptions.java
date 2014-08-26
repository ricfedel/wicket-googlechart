package it.ricfed.wicket.googlecharts.options.chart;

import it.ricfed.wicket.googlecharts.options.ChartArea;
import it.ricfed.wicket.googlecharts.options.Legend;
import it.ricfed.wicket.googlecharts.options.TextStyle;
import it.ricfed.wicket.googlecharts.options.Tooltip;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class BarChartOptions provides options, that are available for
 * {@link Bar}.
 * 
 * @author ricfed
 */
@JsonInclude(Include.NON_NULL)
public class ChartBaseOptions extends AbstractChartOptions {

	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	private Object backgroundColor;
	/*
	 * string or object 'white' The background color for the main area of the
	 * chart. Can be either a simple HTML color string, for example: 'red' or
	 * '#00cc00', or an object with the following properties.
	 * backgroundColor.stroke string '#666' The color of the chart border, as an
	 * HTML color string. backgroundColor.strokeWidth number 0 The border width,
	 * in pixels. backgroundColor.fill string 'white' The chart fill color, as
	 * an HTML color string.
	 */

	private ChartArea chartArea;
	/*
	 * Object null An object with members to configure the placement and size of
	 * the chart area (where the chart itself is drawn, excluding axis and
	 * legends). Two formats are supported: a number, or a number followed by %.
	 * A simple number is a value in pixels; a number followed by % is a
	 * percentage. Example: chartArea:{left:20,top:0,width:'50%',height:'75%'}
	 */
	private String[] colors;
	/*
	 * Array of strings default colors The colors to use for the chart elements.
	 * An array of strings, where each element is an HTML color string, for
	 * example: colors:['red','#004411'].
	 */
	private Boolean enableInteractivity;/*
										 * boolean true Whether the chart throws
										 * user-based events or reacts to user
										 * interaction. If false, the chart will
										 * not throw 'select' or other
										 * interaction-based events (but will
										 * throw ready or error events), and
										 * will not display hovertext or
										 * otherwise change depending on user
										 * input.
										 */

	private Integer fontSize;/*
							 * number automatic The default font size, in
							 * pixels, of all text in the chart. You can
							 * override this using properties for specific chart
							 * elements.
							 */
	private String fontName;/*
							 * string 'Arial' The default font face for all text
							 * in the chart. You can override this using
							 * properties for specific chart elements.
							 */
	private Boolean forceIFrame;/*
								 * boolean false Draws the chart inside an
								 * inline frame. (Note that on IE8, this option
								 * is ignored; all IE8 charts are drawn in
								 * i-frames.)
								 */
	private Integer height;/*
							 * number height of the containing element Height of
							 * the chart, in pixels.
							 */
	private Legend legend;
	/*
	 * Object null An object with members to configure various aspects of the
	 * legend. To specify properties of this object, you can use object literal
	 * notation, as shown here:
	 * 
	 * {position: 'top', textStyle: {color: 'blue', fontSize: 16}}
	 */
	private String orientation;/*
								 * string 'horizontal' The orientation of the
								 * chart. When set to 'vertical', rotates the
								 * axes of the chart so that (for instance) a
								 * column chart becomes a bar chart, and an area
								 * chart grows rightward instead of up:
								 */
	private String reverseCategories;/*
									 * boolean false If set to true, will draw
									 * series from bottom to top. The default is
									 * to draw top-to-bottom.
									 */
	private String title;/*
						 * string no title Text to display above the chart.
						 */
	private String titlePosition; /*
								 * string 'out' Where to place the chart title,
								 * compared to the chart area. Supported values:
								 * 
								 * in - Draw the title inside the chart area.
								 * out - Draw the title outside the chart area.
								 * none - Omit the title.
								 */
	private TextStyle titleTextStyle; /*
									 * Object {color: 'black', fontName:
									 * <global-font-name>, fontSize:
									 * <global-font-size>} An object that
									 * specifies the title text style. The
									 * object has this format:
									 * 
									 * { color: <string>, fontName: <string>,
									 * fontSize: <number>, bold: <boolean>,
									 * italic: <boolean> } The color can be any
									 * HTML color string, for example: 'red' or
									 * '#00cc00'. Also see fontName and
									 * fontSize.
									 */
	private Tooltip tooltip; /*
							 * Object null An object with members to configure
							 * various tooltip elements. To specify properties
							 * of this object, you can use object literal
							 * notation, as shown here:
							 * 
							 * {textStyle: {color: '#FF0000'}, showColorCode:
							 * true} tooltip.isHtml boolean false If set to
							 * true, use HTML-rendered (rather than
							 * SVG-rendered) tooltips. See Customizing Tooltip
							 * Content for more details. tooltip.showColorCode
							 * boolean automatic If true, show colored squares
							 * next to the series information in the tooltip.
							 * The default is true when focusTarget is set to
							 * 'category', otherwise the default is false.
							 */
	private Integer width;/*
						 * number width of the containing element Width of the
						 * chart, in pixels.
						 */

	public Object getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(Object backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public ChartArea getChartArea() {
		return chartArea;
	}

	public void setChartArea(ChartArea chartArea) {
		this.chartArea = chartArea;
	}

	public String[] getColors() {
		return colors;
	}

	public void setColors(String[] colors) {
		this.colors = colors;
	}

	public Boolean getEnableInteractivity() {
		return enableInteractivity;
	}

	public void setEnableInteractivity(Boolean enableInteractivity) {
		this.enableInteractivity = enableInteractivity;
	}

	public Integer getFontSize() {
		return fontSize;
	}

	public void setFontSize(Integer fontSize) {
		this.fontSize = fontSize;
	}

	public String getFontName() {
		return fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public Boolean getForceIFrame() {
		return forceIFrame;
	}

	public void setForceIFrame(Boolean forceIFrame) {
		this.forceIFrame = forceIFrame;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Legend getLegend() {
		return legend;
	}

	public void setLegend(Legend legend) {
		this.legend = legend;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public String getReverseCategories() {
		return reverseCategories;
	}

	public void setReverseCategories(String reverseCategories) {
		this.reverseCategories = reverseCategories;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitlePosition() {
		return titlePosition;
	}

	public void setTitlePosition(String titlePosition) {
		this.titlePosition = titlePosition;
	}

	public TextStyle getTitleTextStyle() {
		return titleTextStyle;
	}

	public void setTitleTextStyle(TextStyle titleTextStyle) {
		this.titleTextStyle = titleTextStyle;
	}

	public Tooltip getTooltip() {
		return tooltip;
	}

	public void setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

}
