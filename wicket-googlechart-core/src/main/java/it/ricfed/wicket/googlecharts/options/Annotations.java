package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Annotations implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = 6495755578966405178L;

	private BoxStyle boxStyle;
	private Boolean highContrast;
	private TextStyle textStyle;

	public BoxStyle getBoxStyle() {
		return boxStyle;
	}

	public void setBoxStyle(BoxStyle boxStyle) {
		this.boxStyle = boxStyle;
	}

	public Boolean getHighContrast() {
		return highContrast;
	}

	public void setHighContrast(Boolean highContrast) {
		this.highContrast = highContrast;
	}

	public TextStyle getTextStyle() {
		return textStyle;
	}

	public void setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
	}

}
