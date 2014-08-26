package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Candlestick implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = -5361792014118429449L;
	private Boolean hollowIsRising;/*
									 * boolean false (will later be changed to
									 * true) If true, rising candles will appear
									 * hollow and falling candles will appear
									 * solid, otherwise, the opposite.
									 */
	private BackgroundColor fallingColor; /*
										 * .fill string auto (depends on the
										 * series color and hollowIsRising) The
										 * fill color of falling candles, as an
										 * HTML color string. stroke string auto
										 * (the series color) The stroke color
										 * of falling candles, as an HTML color
										 * string. strokeWidth number 2 The
										 * stroke width of falling candles, as
										 * an HTML color string.
										 */
	private BackgroundColor risingColor;/*
										 * fill string auto (white or the series
										 * color, depending on hollowIsRising)
										 * The fill color of rising candles, as
										 * an HTML color string.
										 * risingColor.stroke string auto (the
										 * series color or white, depending on
										 * hollowIsRising) The stroke color of
										 * rising candles, as an HTML color
										 * string. risingColor.strokeWidth
										 * number 2 The stroke width of rising
										 * candles, as an HTML color string.
										 */

	public Boolean getHollowIsRising() {
		return hollowIsRising;
	}

	public void setHollowIsRising(Boolean hollowIsRising) {
		this.hollowIsRising = hollowIsRising;
	}

	public BackgroundColor getFallingColor() {
		return fallingColor;
	}

	public void setFallingColor(BackgroundColor fallingColor) {
		this.fallingColor = fallingColor;
	}

	public BackgroundColor getRisingColor() {
		return risingColor;
	}

	public void setRisingColor(BackgroundColor risingColor) {
		this.risingColor = risingColor;
	}

}
