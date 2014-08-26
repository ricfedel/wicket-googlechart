package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Animation implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = 2663820042148161974L;
	private Integer duration; /*
							 * number 0 The duration of the animation, in
							 * milliseconds. For details, see the animation
							 * documentation.
							 */
	private String easing; /*
							 * string 'linear' The easing function applied to
							 * the animation. The following options are
							 * available: 'linear' - Constant speed. 'in' - Ease
							 * in - Start slow and speed up. 'out' - Ease out -
							 * Start fast and slow down. 'inAndOut' - Ease in
							 * and out - Start slow, speed up, then slow down.
							 */

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getEasing() {
		return easing;
	}

	public void setEasing(String easing) {
		this.easing = easing;
	}

}
