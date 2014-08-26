package it.ricfed.wicket.googlecharts.options;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SerieArea extends Serie {
	@JsonIgnore
	private static final long serialVersionUID = -5417701176758276991L;

	private Number areaOpacity;/*
								 * - Overrides the global areaOpacity for this
								 * series.
								 */

	private Number lineWidth;/*
							 * - Overrides the global lineWidth value for this
							 * series.
							 */
	private String pointShape;/*- Overrides the global pointShape value for this series.*/
	private Number pointSize;/*
							 * - Overrides the global pointSize value for this
							 * series.
							 */

	public Number getAreaOpacity() {
		return areaOpacity;
	}

	public void setAreaOpacity(Number areaOpacity) {
		this.areaOpacity = areaOpacity;
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

}
