package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class NumberFormat implements Serializable {
	@JsonIgnore
	private static final long serialVersionUID = 1965685656373730444L;
	private String decimalSymbol;/*
								 * 
								 * A character to use as the decimal marker. The
								 * default is a dot (.).
								 */
	private String fractionDigits;/*
								 * 
								 * A number specifying how many digits to
								 * display after the decimal. The default is 2.
								 * If you specify more digits than the number
								 * contains, it will display zeros for the
								 * smaller values. Truncated values will be
								 * rounded (5 rounded up).
								 */
	private String groupingSymbol;/*
								 * 
								 * A character to be used to group digits to the
								 * left of the decimal into sets of three.
								 * Default is a comma (,).
								 */
	private String negativeColor;/*
								 * 
								 * The text color for negative values. No
								 * default value. Values can be any acceptable
								 * HTML color value, such as "red" or "#FF0000".
								 */
	private Boolean negativeParens;/*
									 * 
									 * A boolean, where true indicates that
									 * negative values should be surrounded by
									 * parentheses. Default is true.
									 */

	public String getDecimalSymbol() {
		return decimalSymbol;
	}

	public void setDecimalSymbol(String decimalSymbol) {
		this.decimalSymbol = decimalSymbol;
	}

	public String getFractionDigits() {
		return fractionDigits;
	}

	public void setFractionDigits(String fractionDigits) {
		this.fractionDigits = fractionDigits;
	}

	public String getGroupingSymbol() {
		return groupingSymbol;
	}

	public void setGroupingSymbol(String groupingSymbol) {
		this.groupingSymbol = groupingSymbol;
	}

	public String getNegativeColor() {
		return negativeColor;
	}

	public void setNegativeColor(String negativeColor) {
		this.negativeColor = negativeColor;
	}

	public Boolean getNegativeParens() {
		return negativeParens;
	}

	public void setNegativeParens(Boolean negativeParens) {
		this.negativeParens = negativeParens;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	private String pattern;/*
							 * 
							 * A format string. When provided, all other options
							 * are ignored, except negativeColor.
							 * 
							 * The format string is a subset of the ICU pattern
							 * set. For instance, {pattern:'#,###%'} will result
							 * in output values "1,000%", "750%", and "50%" for
							 * values 10, 7.5, and 0.5.
							 */
	private String prefix;/*
						 * 
						 * A string prefix for the value, for example "$".
						 */
	private String suffix;/*
						 * 
						 * A string suffix for the value, for example "%".
						 */
}
