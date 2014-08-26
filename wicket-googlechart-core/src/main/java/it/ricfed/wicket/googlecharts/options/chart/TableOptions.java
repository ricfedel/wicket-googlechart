package it.ricfed.wicket.googlecharts.options.chart;

import it.ricfed.wicket.googlecharts.options.CssClassNames;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class TableOptions extends AbstractChartOptions {

	private static final long serialVersionUID = 7156593391539920360L;

	private Boolean allowHtml;/*
							 * boolean false If set to true, formatted values of
							 * cells that include HTML tags will be rendered as
							 * HTML. If set to false, most custom formatters
							 * will not work properly.
							 */
	private Boolean alternatingRowStyle;/*
										 * boolean true Determines if
										 * alternating color style will be
										 * assigned to odd and even rows.
										 */
	private CssClassNames cssClassNames;/*
										 * object null An object in which each
										 * property name describes a table
										 * element, and the property value is a
										 * string, defining a class to assign to
										 * that table element. Use this property
										 * to assign custom CSS to specific
										 * elements of your table. To use this
										 * property, assign an object, where the
										 * property name specifies the table
										 * element, and the property value is a
										 * string, specifying a class name to
										 * assign to that element. You must then
										 * define a CSS style for that class on
										 * your page. The following property
										 * names are supported:
										 * 
										 * headerRow - Assigns a class name to
										 * the table header row (<tr> element).
										 * tableRow - Assigns a class name to
										 * the non-header rows (<tr> elements).
										 * oddTableRow - Assigns a class name to
										 * odd table rows (<tr> elements). Note:
										 * the alternatingRowStyle option must
										 * be set to true. selectedTableRow -
										 * Assigns a class name to the selected
										 * table row (<tr> element).
										 * hoverTableRow - Assigns a class name
										 * to the hovered table row (<tr>
										 * element). headerCell - Assigns a
										 * class name to all cells in the header
										 * row (<td> element). tableCell -
										 * Assigns a class name to all
										 * non-header table cells (<td>
										 * element). rowNumberCell - Assigns a
										 * class name to the cells in the row
										 * number column (<td> element). Note:
										 * the showRowNumber option must be set
										 * to true. Example: var cssClassNames =
										 * {headerRow: 'bigAndBoldClass',
										 * hoverTableRow: 'highlightClass'};
										 * 
										 * Note: In CSS, some elements override
										 * others. For instance, if you specify
										 * a background color for a <tr> element
										 * and a <td> element, the latter takes
										 * precedence over the former. Be sure
										 * to specify all relevant CSS styles in
										 * cssClassNames to avoid conflicts.
										 */
	private Integer firstRowNumber;/*
									 * number 1 The row number for the first row
									 * in the dataTable. Used only if
									 * showRowNumber is true.
									 */
	private String height;/*
						 * string automatic Sets the height of the
						 * visualization's container element. You can use
						 * standard HTML units (for example, '100px', '80em',
						 * '60'). If no units are specified the number is
						 * assumed to be pixels. If not specified, the browser
						 * will set the width automatically to fit the table; if
						 * set smaller than the size required by the table, will
						 * add a vertical scroll bar. page string 'disable' If
						 * and how to enable paging through the data. Choose one
						 * of the following string values:
						 * 
						 * 'enable' - The table will include page-forward and
						 * page-back buttons. Clicking on these buttons will
						 * perform the paging operation and change the displayed
						 * page. You might want to also set the pageSize option.
						 * 'event' - The table will include page-forward and
						 * page-back buttons, but clicking them will trigger a
						 * 'page' event and will not change the displayed page.
						 * This option should be used when the code implements
						 * its own page turning logic. See the TableQueryWrapper
						 * example for an example of how to handle paging events
						 * manually. 'disable' - [Default] Paging is not
						 * supported.
						 */
	private Integer pageSize;/*
							 * number 10 The number of rows in each page, when
							 * paging is enabled with the page option.
							 */
	private Boolean rtlTable;/*
							 * boolean false Adds basic support for
							 * right-to-left languages (such as Arabic or
							 * Hebrew) by reversing the column order of the
							 * table, so that column zero is the rightmost
							 * column, and the last column is the leftmost
							 * column. This does not affect the column index in
							 * the underlying data, only the order of display.
							 * Full bi-directional (BiDi) language display is
							 * not supported by the table visualization even
							 * with this option. This option will be ignored if
							 * you enable paging (using the page option), or if
							 * the table has scroll bars because you have
							 * specified height and width options smaller than
							 * the required table size.
							 */
	private Integer scrollLeftStartPosition;/*
											 * number 0 Sets the horizontal
											 * scrolling position, in pixels, if
											 * the table has horizontal scroll
											 * bars because you have set the
											 * width property. The table will
											 * open scrolled that many pixels
											 * past the leftmost column.
											 */
	private Boolean showRowNumber;/*
								 * boolean false If set to true, shows the row
								 * number as the first column of the table. sort
								 * string 'enable' If and how to sort columns
								 * when the user clicks a column heading. If
								 * sorting is enabled, consider setting the
								 * sortAscending and sortColumn properties as
								 * well. Choose one of the following string
								 * values:
								 * 
								 * 'enable' - [Default] Users can click on
								 * column headers to sort by the clicked column.
								 * When users click on the column header, the
								 * rows will be automatically sorted, and a
								 * 'sort' event will be triggered. 'event' -
								 * When users click on the column header, a
								 * 'sort' event will be triggered, but the rows
								 * will not be automatically sorted. This option
								 * should be used when the page implements its
								 * own sort. See the TableQueryWrapper example
								 * for an example of how to handle sorting
								 * events manually. 'disable' - Clicking a
								 * column header has no effect.
								 */
	private Boolean sortAscending;/*
								 * boolean true The order in which the initial
								 * sort column is sorted. True for ascending,
								 * false for descending. Ignored if sortColumn
								 * is not specified.
								 */
	private Integer sortColumn;/*
								 * number -1 An index of a column in the data
								 * table, by which the table is initially
								 * sorted. The column will be marked with a
								 * small arrow indicating the sort order.
								 */
	private Integer startPage;/*
							 * number 0 The first table page to display. Used
							 * only if page is in mode enable/event.
							 */
	private String width;/*
						 * string automatic Sets the width of the
						 * visualization's container element. You can use
						 * standard HTML units (for example, '100px', '80em',
						 * '60'). If no units are specified the number is
						 * assumed to be pixels. If not specified, the browser
						 * will set the width automatically to fit the table; if
						 * set smaller than the size required by the table, will
						 * add a horizontal scroll bar.
						 */

	public Boolean getAllowHtml() {
		return allowHtml;
	}

	public void setAllowHtml(Boolean allowHtml) {
		this.allowHtml = allowHtml;
	}

	public Boolean getAlternatingRowStyle() {
		return alternatingRowStyle;
	}

	public void setAlternatingRowStyle(Boolean alternatingRowStyle) {
		this.alternatingRowStyle = alternatingRowStyle;
	}

	public CssClassNames getCssClassNames() {
		return cssClassNames;
	}

	public void setCssClassNames(CssClassNames cssClassNames) {
		this.cssClassNames = cssClassNames;
	}

	public Integer getFirstRowNumber() {
		return firstRowNumber;
	}

	public void setFirstRowNumber(Integer firstRowNumber) {
		this.firstRowNumber = firstRowNumber;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Boolean getRtlTable() {
		return rtlTable;
	}

	public void setRtlTable(Boolean rtlTable) {
		this.rtlTable = rtlTable;
	}

	public Integer getScrollLeftStartPosition() {
		return scrollLeftStartPosition;
	}

	public void setScrollLeftStartPosition(Integer scrollLeftStartPosition) {
		this.scrollLeftStartPosition = scrollLeftStartPosition;
	}

	public Boolean getShowRowNumber() {
		return showRowNumber;
	}

	public void setShowRowNumber(Boolean showRowNumber) {
		this.showRowNumber = showRowNumber;
	}

	public Boolean getSortAscending() {
		return sortAscending;
	}

	public void setSortAscending(Boolean sortAscending) {
		this.sortAscending = sortAscending;
	}

	public Integer getSortColumn() {
		return sortColumn;
	}

	public void setSortColumn(Integer sortColumn) {
		this.sortColumn = sortColumn;
	}

	public Integer getStartPage() {
		return startPage;
	}

	public void setStartPage(Integer startPage) {
		this.startPage = startPage;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

}
