package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Explorer implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = 4189870450338007451L;

	private String[] actions;/*
							 * Array of strings ['dragToPan',
							 * 'rightClickToReset'] The Google Charts explorer
							 * supports three actions:
							 * 
							 * dragToPan: Drag to pan around the chart
							 * horizontally and vertically. To pan only along
							 * the horizontal axis, use explorer: { axis:
							 * 'horizontal' }. Similarly for the vertical axis.
							 * 
							 * dragToZoom: The explorer's default behavior is to
							 * zoom in and out when the user scrolls.
							 * 
							 * If explorer: { actions: ['dragToZoom',
							 * 'rightClickToReset'] } is used, dragging across a
							 * rectangular area zooms into that area.
							 * 
							 * We recommend using rightClickToReset whenever
							 * dragToZoom is used. See explorer.maxZoomIn,
							 * explorer.maxZoomOut, and explorer.zoomDelta for
							 * zoom customizations.
							 * 
							 * rightClickToReset: Right clicking on the chart
							 * returns it to the original pan and zoom level.
							 */
	private String axis;/*
						 * string both horizontal and vertical panning By
						 * default, users can pan both horizontally and
						 * vertically when the explorer option is used. If you
						 * want to users to only pan horizontally, use explorer:
						 * { axis: 'horizontal' }. Similarly, explorer: { axis:
						 * 'vertical' } enables vertical-only panning.
						 */
	private Boolean keepInBounds;/*
								 * boolean false By default, users can pan all
								 * around, regardless of where the data is. To
								 * ensure that users don't pan beyond the
								 * original chart, use explorer: { keepInBounds:
								 * true }.
								 */
	private Number maxZoomIn;/*
							 * number 0.25 The maximum that the explorer can
							 * zoom in. By default, users will be able to zoom
							 * in enough that they'll see only 25% of the
							 * original view. Setting explorer: { maxZoomIn: .5
							 * } would let users zoom in only far enough to see
							 * half of the original view.
							 */
	private Number maxZoomOut;/*
							 * number 4 The maximum that the explorer can zoom
							 * out. By default, users will be able to zoom out
							 * far enough that the chart will take up only 1/4
							 * of the available space. Setting explorer: {
							 * maxZoomOut: 8 } would let users zoom out far
							 * enough that the chart would take up only 1/8 of
							 * the available space.
							 */
	private Number zoomDelta;/*
							 * number 1.5 When users zoom in or out,
							 * explorer.zoomDelta determines how much they zoom
							 * by. The smaller the number, the smoother and
							 * slower the zoom.
							 */

	public String[] getActions() {
		return actions;
	}

	public void setActions(String[] actions) {
		this.actions = actions;
	}

	public String getAxis() {
		return axis;
	}

	public void setAxis(String axis) {
		this.axis = axis;
	}

	public Boolean getKeepInBounds() {
		return keepInBounds;
	}

	public void setKeepInBounds(Boolean keepInBounds) {
		this.keepInBounds = keepInBounds;
	}

	public Number getMaxZoomIn() {
		return maxZoomIn;
	}

	public void setMaxZoomIn(Number maxZoomIn) {
		this.maxZoomIn = maxZoomIn;
	}

	public Number getMaxZoomOut() {
		return maxZoomOut;
	}

	public void setMaxZoomOut(Number maxZoomOut) {
		this.maxZoomOut = maxZoomOut;
	}

	public Number getZoomDelta() {
		return zoomDelta;
	}

	public void setZoomDelta(Number zoomDelta) {
		this.zoomDelta = zoomDelta;
	}

}
