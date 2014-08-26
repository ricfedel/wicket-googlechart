package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Tooltip implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = -5469248971109702287L;
	private Boolean isHtml;/*
							 * boolean false If set to true, use HTML-rendered
							 * (rather than SVG-rendered) tooltips. See
							 * Customizing Tooltip Content for more details.
							 */
	private Boolean showColorCode;/*
								 * boolean automatic If true, show colored
								 * squares next to the series information in the
								 * tooltip. The default is true when focusTarget
								 * is set to 'category', otherwise the default
								 * is false.
								 */
	private TextStyle textStyle;/*
								 * Object {color: 'black', fontName:
								 * <global-font-name>, fontSize:
								 * <global-font-size>} An object that specifies
								 * the tooltip text style. The object has this
								 * format:
								 * 
								 * { color: <string>, fontName: <string>,
								 * fontSize: <number>, bold: <boolean>, italic:
								 * <boolean> } The color can be any HTML color
								 * string, for example: 'red' or '#00cc00'. Also
								 * see fontName and fontSize.
								 */
	private String trigger;/*
							 * string 'focus' The user interaction that causes
							 * the tooltip to be displayed:
							 * 
							 * 'focus' - The tooltip will be displayed when the
							 * user hovers over the element. 'none' - The
							 * tooltip will not be displayed. 'selection' - The
							 * tooltip will be displayed when the user selects
							 * the element.
							 */

	public Boolean getIsHtml() {
		return isHtml;
	}

	public void setIsHtml(Boolean isHtml) {
		this.isHtml = isHtml;
	}

	public Boolean getShowColorCode() {
		return showColorCode;
	}

	public void setShowColorCode(Boolean showColorCode) {
		this.showColorCode = showColorCode;
	}

	public TextStyle getTextStyle() {
		return textStyle;
	}

	public void setTextStyle(TextStyle textStyle) {
		this.textStyle = textStyle;
	}

	public String getTrigger() {
		return trigger;
	}

	public void setTrigger(String trigger) {
		this.trigger = trigger;
	}

}
