package it.ricfed.wicket.googlecharts.core;

import it.ricfed.wicket.googlecharts.chart.Dashboard;
import it.ricfed.wicket.googlecharts.data.DataTable;
import it.ricfed.wicket.googlecharts.utils.ScriptHelper;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

public class DashboardBehavior extends BaseBehavior {

	private static final long serialVersionUID = -9167469119665044503L;

	@Override
	protected String toScript(IWrapperContainer component) {
		Dashboard dash = (Dashboard) component;
		List<Binding> bindings = dash.getBinding();
		if (bindings == null || bindings.isEmpty()) {
			bindings = defaultBilding(dash.getElements());
		}

		String generato = generate(component.getMarkupId(), bindings,
				dash.getDataTable(),dash);
		return generato;
	}

	private List<Binding> defaultBilding(List<IWrapperContainer> elements) {
		List<Binding> items = new ArrayList<Binding>();
		int n = elements.size();
		Binding b = null;
		Binding prec = null;
		for (int i = 0; i < n; i++) {
			IWrapperContainer c = elements.get(i);
			String id = ((WrapperContainer) c).getId();
			if (c instanceof ControlContainer) {
				b = new Binding();
				b.getLeft().add(id);
				if (prec != null) {
					prec.getRigth().add(id);
				}
				items.add(b);
				prec = b;
			}
			if (c instanceof Chart) {
				if (prec != null) {
					prec.getRigth().add(id);
				}
			}
		}
		return items;
	}

	private String generate(String markupId, List<Binding> items, DataTable data,Dashboard dash) {
		StringBuilder sb = new StringBuilder();
		sb.append("var dashboard_"
				+ markupId
				+ " = new google.visualization.Dashboard(document.getElementById('"
				+ markupId + "'));\n");
		for (Binding binding : items) {
			sb.append("dashboard_" + markupId + ".bind(");
			if (binding.getLeft().size() > 1) {
				sb.append('[');
			}
			Character c = ' ';
			for (String id : binding.getLeft()) {
				String mkid=dash.get(id).getMarkupId();
				sb.append(c).append("obj_").append(mkid);
				c = ',';
			}
			if (binding.getLeft().size() > 1) {
				sb.append(']');
			}

			sb.append(',');
			if (binding.getRigth().size() > 1) {
				sb.append('[');
			}
			c = ' ';
			for (String id : binding.getRigth()) {
				String mkid=dash.get(id).getMarkupId();
				sb.append(c).append("obj_").append(mkid);
				c = ',';
			}
			if (binding.getRigth().size() > 1) {
				sb.append(']');
			}
			sb.append(");\n");
		}
		try {
			String dataTable = getMapper()
					.writeValueAsString(data);
			dataTable = ScriptHelper.toFunctions(dataTable);
			sb.append("var data_" + markupId
					+ "=new google.visualization.DataTable(" + dataTable
					+ ");\n");
		} catch (JsonProcessingException e) {
			System.err.println(e.getMessage());
		}
		sb.append("dashboard_" + markupId + ".draw(data_" + markupId + ");");
		return ScriptHelper.toFunctions(sb.toString());
	}

}
