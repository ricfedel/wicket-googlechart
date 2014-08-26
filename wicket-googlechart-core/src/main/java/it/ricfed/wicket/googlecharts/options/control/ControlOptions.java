package it.ricfed.wicket.googlecharts.options.control;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public abstract class ControlOptions implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = 907716259284683680L;
}
