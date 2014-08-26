package it.ricfed.wicket.googlecharts.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class CssClassNames implements Serializable {

	private static final long serialVersionUID = -868065170305495253L;

	private String headerRow;/*
							 * - Assigns a class name to the table header row
							 * (<tr> element).
							 */
	private String tableRow;/*
							 * - Assigns a class name to the non-header rows
							 * (<tr> elements).
							 */
	private String oddTableRow;/*
								 * - Assigns a class name to odd table rows
								 * (<tr> elements). Note: the
								 * alternatingRowStyle option must be set to
								 * true.
								 */
	private String selectedTableRow;/*
									 * - Assigns a class name to the selected
									 * table row (<tr> element).
									 */
	private String hoverTableRow;/*
								 * - Assigns a class name to the hovered table
								 * row (<tr> element).
								 */
	private String headerCell;/*
							 * - Assigns a class name to all cells in the header
							 * row (<td> element).
							 */
	private String tableCell;/*
							 * - Assigns a class name to all non-header table
							 * cells (<td> element).
							 */
	private String rowNumberCell;/*
								 * - Assigns a class name to the cells in the
								 * row number column (<td> element). Note: the
								 * showRowNumber option must be set to true.
								 */

	public String getHeaderRow() {
		return headerRow;
	}

	public void setHeaderRow(String headerRow) {
		this.headerRow = headerRow;
	}

	public String getTableRow() {
		return tableRow;
	}

	public void setTableRow(String tableRow) {
		this.tableRow = tableRow;
	}

	public String getOddTableRow() {
		return oddTableRow;
	}

	public void setOddTableRow(String oddTableRow) {
		this.oddTableRow = oddTableRow;
	}

	public String getSelectedTableRow() {
		return selectedTableRow;
	}

	public void setSelectedTableRow(String selectedTableRow) {
		this.selectedTableRow = selectedTableRow;
	}

	public String getHoverTableRow() {
		return hoverTableRow;
	}

	public void setHoverTableRow(String hoverTableRow) {
		this.hoverTableRow = hoverTableRow;
	}

	public String getHeaderCell() {
		return headerCell;
	}

	public void setHeaderCell(String headerCell) {
		this.headerCell = headerCell;
	}

	public String getTableCell() {
		return tableCell;
	}

	public void setTableCell(String tableCell) {
		this.tableCell = tableCell;
	}

	public String getRowNumberCell() {
		return rowNumberCell;
	}

	public void setRowNumberCell(String rowNumberCell) {
		this.rowNumberCell = rowNumberCell;
	}

}
