package it.ricfed.wicket.googlecharts.options.chart;

import it.ricfed.wicket.googlecharts.options.Bubble;
import it.ricfed.wicket.googlecharts.options.ColorAxis;
import it.ricfed.wicket.googlecharts.options.Explorer;
import it.ricfed.wicket.googlecharts.options.Serie;
import it.ricfed.wicket.googlecharts.options.SizeAxis;

import java.awt.geom.Area;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class AreaChartOptions provides options, that are available for
 * {@link Area}.
 * 
 * @author ricfed
 */
@JsonInclude(Include.NON_NULL)
public class BubbleChartOptions extends ChartOptions {

	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	private Bubble bubble;

	private ColorAxis colorAxis; /*
								 * colorAxis Object null An object that
								 * specifies a mapping between color column
								 * values and colors or a gradient scale. To
								 * specify properties of this object, you can
								 * use object literal notation, as shown here:
								 * {minValue: 0, colors: ['#FF0000', '#00FF00']}
								 */
	private Explorer explorer;

	private String selectionMode;/*
								 * string 'single' When selectionMode is
								 * 'multiple', users may select multiple data
								 * points.
								 */
	private Serie[] series;
	private SizeAxis sizeAxis;/*
							 * Object null An object with members to configure
							 * how values are associated with bubble size. To
							 * specify properties of this object, you can use
							 * object literal notation, as shown here:
							 * {minValue: 0, maxSize: 20}
							 */
	private Boolean sortBubblesBySize;/*
									 * boolean true If true, sorts the bubbles
									 * by size so the smaller bubbles appear
									 * above the larger bubbles. If false,
									 * bubbles are sorted according to their
									 * order in the DataTable.
									 */

	public Bubble getBubble() {
		return bubble;
	}

	public void setBubble(Bubble bubble) {
		this.bubble = bubble;
	}

	public ColorAxis getColorAxis() {
		return colorAxis;
	}

	public void setColorAxis(ColorAxis colorAxis) {
		this.colorAxis = colorAxis;
	}

	public Explorer getExplorer() {
		return explorer;
	}

	public void setExplorer(Explorer explorer) {
		this.explorer = explorer;
	}

	public String getSelectionMode() {
		return selectionMode;
	}

	public void setSelectionMode(String selectionMode) {
		this.selectionMode = selectionMode;
	}

	public SizeAxis getSizeAxis() {
		return sizeAxis;
	}

	public void setSizeAxis(SizeAxis sizeAxis) {
		this.sizeAxis = sizeAxis;
	}

	public Boolean getSortBubblesBySize() {
		return sortBubblesBySize;
	}

	public void setSortBubblesBySize(Boolean sortBubblesBySize) {
		this.sortBubblesBySize = sortBubblesBySize;
	}

	public Serie[] getSeries() {
		return series;
	}

	public void setSeries(Serie[] series) {
		this.series = series;
	}

}
