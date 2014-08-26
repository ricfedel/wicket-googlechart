package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Serie implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = -5417701176758276991L;
	private Annotations annotations;/*
									 * - An object to be applied to annotations
									 * for this series. This can be used to
									 * control, for instance, the textStyle for
									 * the series: series: { 0: { annotations: {
									 * textStyle: {fontSize: 12, color: 'red' }
									 * } } } See the various annotations options
									 * for a more complete list of what can be
									 * customized.
									 */
	private String color; /*
						 * - The color to use for this series. Specify a valid
						 * HTML color string.
						 */
	private Integer targetAxisIndex; /*
									 * - Which axis to assign this series to,
									 * where 0 is the default axis, and 1 is the
									 * opposite axis. Default value is 0; set to
									 * 1 to define a chart where different
									 * series are rendered against different
									 * axes. At least one series much be
									 * allocated to the default axis. You can
									 * define a different scale for different
									 * axes.
									 */
	private Boolean visibleInLegend;/*
									 * - A boolean value, where true means that
									 * the series should have a legend entry,
									 * and false means that it should not.
									 * Default is true.
									 */

	public Annotations getAnnotations() {
		return annotations;
	}

	public void setAnnotations(Annotations annotations) {
		this.annotations = annotations;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getTargetAxisIndex() {
		return targetAxisIndex;
	}

	public void setTargetAxisIndex(Integer targetAxisIndex) {
		this.targetAxisIndex = targetAxisIndex;
	}

	public Boolean getVisibleInLegend() {
		return visibleInLegend;
	}

	public void setVisibleInLegend(Boolean visibleInLegend) {
		this.visibleInLegend = visibleInLegend;
	}

}
