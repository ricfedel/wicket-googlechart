package it.ricfed.wicket.googlecharts.options.chart;

import it.ricfed.wicket.googlecharts.options.Animation;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public abstract class AbstractChartOptions implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = 2401861279216541412L;
	private Animation animation;

	public Animation getAnimation() {
		return animation;
	}

	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

}
