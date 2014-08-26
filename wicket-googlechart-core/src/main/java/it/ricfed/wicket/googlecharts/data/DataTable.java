package it.ricfed.wicket.googlecharts.data;

import it.ricfed.wicket.googlecharts.utils.DataTableHelper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonInclude(Include.NON_NULL)
public class DataTable implements Serializable {

	private static final long serialVersionUID = 7025778198291528398L;

	List<Map<String, Object>> cols;
	List<Map<String, List<Map<String, Object>>>> rows;

	@JsonIgnore
	private Map<Integer, String> formatColumns;

	public List<Map<String, Object>> getCols() {
		if (cols == null)
			cols = new ArrayList<Map<String, Object>>();
		return cols;
	}

	public void setCols(List<Map<String, Object>> cols) {
		this.cols = cols;
	}

	public List<Map<String, List<Map<String, Object>>>> getRows() {
		if (rows == null)
			rows = new ArrayList<Map<String, List<Map<String, Object>>>>();
		return rows;
	}

	public void setRows(List<Map<String, List<Map<String, Object>>>> rows) {
		this.rows = rows;
	}

	@JsonIgnore
	public void setParameterColumn(int column, String parameter, Object value) {
		cols.get(column).put(parameter, value);
	}

	@JsonIgnore
	public void setParameterCell(int row, int column, String parameter,
			Object value) {
		rows.get(row).get("c").get(column).put(parameter, value);
	}

	public static void main(String[] args) {
		DataTable dataTable = new DataTable();
		DataTableHelper.addCol("a", "labelA", "string", null, null, dataTable);
		List<Map<String, Object>> row = DataTableHelper.addRow("a", null, null,
				dataTable);
		DataTableHelper.addCell(1.0, "One", null, row);
		try {
			System.out
					.println(new ObjectMapper().writeValueAsString(dataTable));
		} catch (Throwable t) {
			System.err.println(t.getMessage());
		}
	}

	@JsonIgnore
	public Map<Integer, String> getFormatColumns() {
		if (formatColumns == null)
			formatColumns = new HashMap<Integer, String>();
		return formatColumns;
	}

	@JsonIgnore
	public String getFormatColumn(int index) {
		return formatColumns.get(index);
	}

	@JsonIgnore
	public void setFormatColumn(int index, String format) {
		if (index < 0 || index >= getCols().size() || format == null
				|| format.trim().length() == 0)
			return;
		getFormatColumns().put(index, format);
	}
}
