package it.ricfed.wicket.googlecharts.options.chart;

import it.ricfed.wicket.googlecharts.options.Axis;
import it.ricfed.wicket.googlecharts.options.Crosshair;
import it.ricfed.wicket.googlecharts.options.Explorer;
import it.ricfed.wicket.googlecharts.options.SerieArea;

import java.awt.geom.Area;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Class AreaChartOptions provides options, that are available for
 * {@link Area}.
 * 
 * @author ricfed
 */
@JsonInclude(Include.NON_NULL)
public class AreaChartOptions extends ChartOptions {

	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	private String aggregationTarget;/*
									 * string 'auto' How multiple data
									 * selections are rolled up into tooltips:
									 * 'category': Group selected data by
									 * x-value. 'series': Group selected data by
									 * series. 'auto': Group selected data by
									 * x-value if all selections have the same
									 * x-value, and by series otherwise. 'none':
									 * Show only one tooltip per selection.
									 * aggregationTarget will often be used in
									 * tandem with selectionMode and
									 * tooltip.trigger, e.g.: var options = { //
									 * Allow multiple simultaneous selections.
									 * selectionMode: 'multiple', // Trigger
									 * tooltips on selections. tooltip: {
									 * trigger: 'selection' }, // Group
									 * selections by x-value. aggregationTarget:
									 * 'category', };
									 */
	private Number areaOpacity; /*
								 * number, 0.0–1.0 0.3 The default opacity of
								 * the colored area under an area chart series,
								 * where 0.0 is fully transparent and 1.0 is
								 * fully opaque. To specify opacity for an
								 * individual series, set the areaOpacity value
								 * in the series property.
								 */
	private Crosshair crosshair;

	private Explorer explorer;

	private Boolean interpolateNulls;/*
									 * boolean false Whether to guess the value
									 * of missing points. If true, it will guess
									 * the value of any missing data based on
									 * neighboring points. If false, it will
									 * leave a break in the line at the unknown
									 * point.
									 */
	private Number lineWidth;/*
							 * number 2 Data line width in pixels. Use zero to
							 * hide all lines and show only the points. You can
							 * override values for individual series using the
							 * series property.
							 */
	private String pointShape;/*
							 * string 'circle' The shape of individual data
							 * elements: 'circle', 'triangle', 'square',
							 * 'diamond', 'star', or 'polygon'. See the points
							 * documentation for examples.
							 */
	private Number pointSize;/*
							 * number 0 Diameter of displayed points in pixels.
							 * Use zero to hide all points. You can override
							 * values for individual series using the series
							 * property.
							 */

	private String selectionMode;/*
								 * string 'single' When selectionMode is
								 * 'multiple', users may select multiple data
								 * points.
								 */
	private SerieArea[] series;
	private Axis[] vAxes;

	public String getAggregationTarget() {
		return aggregationTarget;
	}

	public void setAggregationTarget(String aggregationTarget) {
		this.aggregationTarget = aggregationTarget;
	}

	public Number getAreaOpacity() {
		return areaOpacity;
	}

	public void setAreaOpacity(Number areaOpacity) {
		this.areaOpacity = areaOpacity;
	}

	public Crosshair getCrosshair() {
		return crosshair;
	}

	public void setCrosshair(Crosshair crosshair) {
		this.crosshair = crosshair;
	}

	public Explorer getExplorer() {
		return explorer;
	}

	public void setExplorer(Explorer explorer) {
		this.explorer = explorer;
	}

	public Boolean getInterpolateNulls() {
		return interpolateNulls;
	}

	public void setInterpolateNulls(Boolean interpolateNulls) {
		this.interpolateNulls = interpolateNulls;
	}

	public Number getLineWidth() {
		return lineWidth;
	}

	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
	}

	public String getPointShape() {
		return pointShape;
	}

	public void setPointShape(String pointShape) {
		this.pointShape = pointShape;
	}

	public Number getPointSize() {
		return pointSize;
	}

	public void setPointSize(Number pointSize) {
		this.pointSize = pointSize;
	}

	public String getSelectionMode() {
		return selectionMode;
	}

	public void setSelectionMode(String selectionMode) {
		this.selectionMode = selectionMode;
	}

	public SerieArea[] getSeries() {
		return series;
	}

	public void setSeries(SerieArea[] series) {
		this.series = series;
	}

	@JsonProperty("vAxes")
	public Axis[] getVAxes() {
		return vAxes;
	}

	public void setVAxes(Axis[] vAxes) {
		this.vAxes = vAxes;
	}

}
