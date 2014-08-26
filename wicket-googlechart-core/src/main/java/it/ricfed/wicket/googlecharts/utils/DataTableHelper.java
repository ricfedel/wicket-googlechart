package it.ricfed.wicket.googlecharts.utils;

import it.ricfed.wicket.googlecharts.data.ChartData;
import it.ricfed.wicket.googlecharts.data.DataTable;
import it.ricfed.wicket.googlecharts.data.sets.DataSet;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataTableHelper {
	public static DataTable makeDataTable(ChartData data) {
		DataTable dataTable = new DataTable();
		int k = 0;
		List<String> types = new ArrayList<String>();
		for (String label : data.getLabels()) {
			String type = type(data.getDatasets(), k);
			types.add(type);
			addCol(label, label, type, pattern(type), null, dataTable);
			k++;
		}
		for (DataSet d : data.getDatasets()) {
			if (d.getData() == null || d.getData().isEmpty())
				continue;
			List<Map<String, Object>> items = addRow(
					value(d.getData().get(0), types.get(0)), null, null,
					dataTable);
			int n = d.getData().size();
			for (int i = 1; i < n; i++) {
				addCell(value(d.getData().get(i), types.get(i)), null, null,
						items);
			}
		}
		return dataTable;
	}

	private static String pattern(String type) {
		if (type == null)
			return null;
		if (type.equals("date")) {
			return "d/M/yyyy";
		}
		if (type.equals("datetime")) {
			return "d/M/yyyy H:m:s";
		}
		if (type.equals("timeofday")) {
			return "H:m:s";
		}
		return null;
	}

	private static Object value(Serializable v, String type) {
		if (v == null)
			return null;
		if (type.equals("date")) {
			if (v instanceof Date) {
				Date date = (Date) v;
				return ScriptHelper.functionDate(date);
			}
		}
		if (type.equals("datetime")) {
			if (v instanceof Date) {
				Date date = (Date) v;
				return ScriptHelper.functionDateTime(date);
			}
		}
		if (type.equals("timeofday")) {
			if (v instanceof Date) {
				Date date = (Date) v;
				return ScriptHelper.functionTimeOfDay(date);
			}
		}
		if (type.equals("string")) {
			return v.toString();
		}
		return v;
	}

	private static String type(List<DataSet> datasets, int k) {
		for (DataSet d : datasets) {
			if (d.getData() == null || d.getData().isEmpty())
				continue;
			if (d.getData().get(k) == null)
				continue;
			return type(d.getData().get(k));
		}
		return "string";
	}

	private static String type(Serializable value) {
		if (value instanceof Number)
			return "number";
		if (value instanceof Boolean)
			return "boolean";
		if (value instanceof Timestamp)
			return "datatime";
		if (value instanceof Time)
			return "timeofday";
		if (value instanceof Date)
			return "date";
		return "string";
	}

	public static void addCell(Object v, String f, Map<String, Object> p,
			List<Map<String, Object>> row) {
		Map<String, Object> cell = createCell(v, f, p);
		row.add(cell);
	}

	public static Map<String, Object> createCell(Object v, String f,
			Map<String, Object> p) {
		Map<String, Object> cell = new HashMap<String, Object>();
		if (v != null)
			cell.put("v", v);
		if (f != null && f.trim().length() > 0)
			cell.put("f", f);
		if (p != null && !p.isEmpty())
			cell.put("p", p);
		return cell;
	}

	public static List<Map<String, Object>> addRow(Object v, String f,
			Map<String, Object> p, DataTable dataTable) {
		Map<String, List<Map<String, Object>>> row = newRow();
		dataTable.getRows().add(row);
		addCell(v, f, p, row.get("c"));
		return row.get("c");
	}

	public static List<Map<String, Object>> addRow(DataTable dataTable) {
		Map<String, List<Map<String, Object>>> row = newRow();
		dataTable.getRows().add(row);
		return row.get("c");
	}

	public static Map<String, List<Map<String, Object>>> newRow() {
		HashMap<String, List<Map<String, Object>>> row = new HashMap<String, List<Map<String, Object>>>();
		ArrayList<Map<String, Object>> items = new ArrayList<Map<String, Object>>();
		row.put("c", items);
		return row;
	}

	public static Map<String, Object> newCol() {
		return new HashMap<String, Object>();
	}

	public static void addCol(String id, String label, String type,
			String pattern, Map<String, Object> p, DataTable dataTable) {
		Map<String, Object> col = new HashMap<String, Object>();
		if (id != null && id.trim().length() > 0)
			col.put("id", id);
		if (label != null && label.trim().length() > 0)
			col.put("label", label);
		if (type != null && type.trim().length() > 0)
			col.put("type", type);
		if (pattern != null && pattern.trim().length() > 0)
			col.put("pattern", pattern);
		if (p != null && !p.isEmpty())
			col.put("p", p);
		dataTable.getCols().add(col);
	}

}
