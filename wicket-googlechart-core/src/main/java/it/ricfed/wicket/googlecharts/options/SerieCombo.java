package it.ricfed.wicket.googlecharts.options;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SerieCombo extends Serie {
	@JsonIgnore
	private static final long serialVersionUID = -5417701176758276991L;

	private Number areaOpacity;/*
								 * - Overrides the global areaOpacity for this
								 * series.
								 */
	private String curveType;/*
							 * - Overrides the global curveType value for this
							 * series.
							 */

	private BackgroundColor fallingColor;
	private Number lineWidth;/*
							 * - Overrides the global lineWidth value for this
							 * series.
							 */
	private String pointShape;/*- Overrides the global pointShape value for this series.*/
	private Number pointSize;/*
							 * - Overrides the global pointSize value for this
							 * series.
							 */
	private BackgroundColor risingColor;/*
										 * .fill - Overrides the global
										 * candlestick.risingColor.
										 */
	private String type;/*
						 * - The type of marker for this series. Valid values
						 * are 'line', 'area', 'bars', 'candlesticks' and
						 * 'steppedArea'. Note that bars are actually vertical
						 * bars (columns). The default value is specified by the
						 * chart's seriesType option.
						 */

	public Number getAreaOpacity() {
		return areaOpacity;
	}

	public void setAreaOpacity(Number areaOpacity) {
		this.areaOpacity = areaOpacity;
	}

	public String getCurveType() {
		return curveType;
	}

	public void setCurveType(String curveType) {
		this.curveType = curveType;
	}

	public BackgroundColor getFallingColor() {
		return fallingColor;
	}

	public void setFallingColor(BackgroundColor fallingColor) {
		this.fallingColor = fallingColor;
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

	public BackgroundColor getRisingColor() {
		return risingColor;
	}

	public void setRisingColor(BackgroundColor risingColor) {
		this.risingColor = risingColor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
