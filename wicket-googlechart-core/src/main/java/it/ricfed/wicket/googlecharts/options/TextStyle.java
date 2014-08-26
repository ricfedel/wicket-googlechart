package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TextStyle implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = 3551278550771577592L;
	private String fontName;
	private Integer fontSize;
	private Boolean bold;
	private Boolean italic;
	private String color; /* '#871b47', // The color of the text. */
	private String auraColor; /* '#d799ae', // The color of the text outline. */
	private Float opacity; /* 0.8 // The transparency of the text. */

	public String getFontName() {
		return fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public Integer getFontSize() {
		return fontSize;
	}

	public void setFontSize(Integer fontSize) {
		this.fontSize = fontSize;
	}

	public Boolean getBold() {
		return bold;
	}

	public void setBold(Boolean bold) {
		this.bold = bold;
	}

	public Boolean getItalic() {
		return italic;
	}

	public void setItalic(Boolean italic) {
		this.italic = italic;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAuraColor() {
		return auraColor;
	}

	public void setAuraColor(String auraColor) {
		this.auraColor = auraColor;
	}

	public Float getOpacity() {
		return opacity;
	}

	public void setOpacity(Float opacity) {
		this.opacity = opacity;
	}

}
