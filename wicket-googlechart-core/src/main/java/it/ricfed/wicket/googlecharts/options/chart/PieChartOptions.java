package it.ricfed.wicket.googlecharts.options.chart;

import it.ricfed.wicket.googlecharts.options.Slice;
import it.ricfed.wicket.googlecharts.options.TextStyle;

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
public class PieChartOptions extends ChartBaseOptions {

	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	private Boolean is3D;/*
						 * boolean false If true, displays a three-dimensional
						 * chart.
						 */
	private Number pieHole;/*
							 * number 0 If between 0 and 1, displays a donut
							 * chart. The hole with have a radius equal to
							 * number times the radius of the chart.
							 */
	private String pieSliceBorderColor;/*
										 * string 'white' The color of the slice
										 * borders. Only applicable when the
										 * chart is two-dimensional.
										 */
	private String pieSliceText;/*
								 * string 'percentage' The content of the text
								 * displayed on the slice. Can be one of the
								 * following: 'percentage' - The percentage of
								 * the slice size out of the total. 'value' -
								 * The quantitative value of the slice. 'label'
								 * - The name of the slice. 'none' - No text is
								 * displayed.
								 */
	private TextStyle pieSliceTextStyle;/*
										 * Object {color: 'black', fontName:
										 * <global-font-name>, fontSize:
										 * <global-font-size>} An object that
										 * specifies the slice text style. The
										 * object has this format:
										 * 
										 * {color: <string>, fontName: <string>,
										 * fontSize: <number>} The color can be
										 * any HTML color string, for example:
										 * 'red' or '#00cc00'. Also see fontName
										 * and fontSize.
										 */
	private Number pieStartAngle;/*
								 * Number 0 The angle, in degrees, to rotate the
								 * chart by. The default of 0 will orient the
								 * leftmost edge of the first slice directly up.
								 */
	private String pieResidueSliceColor;/*
										 * string '#ccc' Color for the
										 * combination slice that holds all
										 * slices below
										 * sliceVisibilityThreshold.
										 */
	private String pieResidueSliceLabel;/*
										 * string 'Other' A label for the
										 * combination slice that holds all
										 * slices below
										 * sliceVisibilityThreshold.
										 */
	private Slice[] slices;/*
							 * Array of objects, or object with nested objects
							 * {} An array of objects, each describing the
							 * format of the corresponding slice in the pie. To
							 * use default values for a slice, specify an empty
							 * object (i.e., {}). If a slice or a value is not
							 * specified, the global value will be used. Each
							 * object supports the following properties:
							 * 
							 * color - The color to use for this slice. Specify
							 * a valid HTML color string. offset - How far to
							 * separate the slice from the rest of the pie, from
							 * 0.0 (not at all) to 1.0 (the pie's radius).
							 * textStyle - Overrides the global
							 * pieSliceTextSlice for this slice. You can specify
							 * either an array of objects, each of which applies
							 * to the slice in the order given, or you can
							 * specify an object where each child has a numeric
							 * key indicating which slice it applies to. For
							 * example, the following two declarations are
							 * identical, and declare the first slice as black
							 * and the fourth as red:
							 * 
							 * slices: [{color: 'black', {}, {}, {color: 'red'}]
							 * slices: {0: {color: 'black'}, 3: {color: 'red'}}
							 */
	private Number sliceVisibilityThreshold;/*
											 * number 1/720 The slice relative
											 * part, below which a slice will
											 * not show individually. All slices
											 * that have not passed this
											 * threshold will be combined to a
											 * single slice, whose size is the
											 * sum of all their sizes. Default
											 * is not to show individually any
											 * slice which is smaller than half
											 * a degree.
											 */

	public Boolean getIs3D() {
		return is3D;
	}

	public void setIs3D(Boolean is3d) {
		is3D = is3d;
	}

	public Number getPieHole() {
		return pieHole;
	}

	public void setPieHole(Number pieHole) {
		this.pieHole = pieHole;
	}

	public String getPieSliceBorderColor() {
		return pieSliceBorderColor;
	}

	public void setPieSliceBorderColor(String pieSliceBorderColor) {
		this.pieSliceBorderColor = pieSliceBorderColor;
	}

	public String getPieSliceText() {
		return pieSliceText;
	}

	public void setPieSliceText(String pieSliceText) {
		this.pieSliceText = pieSliceText;
	}

	public TextStyle getPieSliceTextStyle() {
		return pieSliceTextStyle;
	}

	public void setPieSliceTextStyle(TextStyle pieSliceTextStyle) {
		this.pieSliceTextStyle = pieSliceTextStyle;
	}

	public Number getPieStartAngle() {
		return pieStartAngle;
	}

	public void setPieStartAngle(Number pieStartAngle) {
		this.pieStartAngle = pieStartAngle;
	}

	public String getPieResidueSliceColor() {
		return pieResidueSliceColor;
	}

	public void setPieResidueSliceColor(String pieResidueSliceColor) {
		this.pieResidueSliceColor = pieResidueSliceColor;
	}

	public String getPieResidueSliceLabel() {
		return pieResidueSliceLabel;
	}

	public void setPieResidueSliceLabel(String pieResidueSliceLabel) {
		this.pieResidueSliceLabel = pieResidueSliceLabel;
	}

	public Slice[] getSlices() {
		return slices;
	}

	public void setSlices(Slice[] slices) {
		this.slices = slices;
	}

	public Number getSliceVisibilityThreshold() {
		return sliceVisibilityThreshold;
	}

	public void setSliceVisibilityThreshold(Number sliceVisibilityThreshold) {
		this.sliceVisibilityThreshold = sliceVisibilityThreshold;
	}

}
