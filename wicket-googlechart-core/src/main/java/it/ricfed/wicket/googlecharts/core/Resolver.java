package it.ricfed.wicket.googlecharts.core;

import it.ricfed.wicket.googlecharts.data.DataTable;
import it.ricfed.wicket.googlecharts.options.chart.ChartWrapperOptions;
import it.ricfed.wicket.googlecharts.options.control.ControlWrapperOptions;
import it.ricfed.wicket.googlecharts.utils.ScriptHelper;
import it.ricfed.wicket.googlecharts.wrapper.ControlWrapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Resolver implements Serializable {

	private static final long serialVersionUID = 525439201072167344L;
	private ObjectMapper mapper;

	public ObjectMapper getMapper() {
		if (mapper == null) {
			mapper = new ObjectMapper();
		}
		return mapper;
	}

	public String toScriptDashboard(IWrapperContainer component) {
		IDashboard dash = (IDashboard) component;
		List<Binding> bindings = dash.getBinding();
		if (bindings == null || bindings.isEmpty()) {
			bindings = defaultBilding(dash.getElements());
		}
		StringBuilder generato = scripts(bindings, component);
		generato.append(generate(component.getMarkupId(), bindings,
				dash.getDataTable(), component));
		return generato.toString();
	}

	private List<Binding> defaultBilding(List<IWrapperContainer> elements) {
		List<Binding> items = new ArrayList<Binding>();
		int n = elements.size();
		Binding b = null;
		Binding prec = null;
		for (int i = 0; i < n; i++) {
			IWrapperContainer c = elements.get(i);
			String id = c.getId();
			if (c.isControl()) {
				b = new Binding();
				b.getLeft().add(id);
				if (prec != null) {
					prec.getRigth().add(id);
				}
				items.add(b);
				prec = b;
			}
			if (c instanceof IChart) {
				if (prec != null) {
					prec.getRigth().add(id);
				}
			}
		}
		return items;
	}

	private String generate(String markupId, List<Binding> items,
			DataTable data, IWrapperContainer component) {
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
				String mkid = component.getWrapperContainer(id).getMarkupId();
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
				String mkid = component.getWrapperContainer(id).getMarkupId();
				sb.append(c).append("obj_").append(mkid);
				c = ',';
			}
			if (binding.getRigth().size() > 1) {
				sb.append(']');
			}
			sb.append(");\n");
		}
		try {
			String dataTable = getMapper().writeValueAsString(data);
			dataTable = ScriptHelper.toFunctions(dataTable);
			sb.append("var data_" + markupId
					+ "=new google.visualization.DataTable(" + dataTable
					+ ");\n");
			List<String> formatters = new ArrayList<String>();
			for (Integer col : data.getFormatColumns().keySet()) {
				String formatter = data.getFormatColumns().get(col);
				int k = formatter.indexOf('(');
				String f = formatter;
				if (k >= 0)
					f = formatter.substring(0, k);
				if (!formatters.contains(f)) {
					formatters.add(f);
					sb.append("var f_" + f + "_" + markupId + "=new "
							+ formatter + ";\n");
				}
				sb.append("f_" + f + "_" + markupId + ".format(data_"
						+ markupId + "," + col + ");\n");
			}

		} catch (JsonProcessingException e) {
			System.err.println(e.getMessage());
		}
		sb.append("dashboard_" + markupId + ".draw(data_" + markupId + ");");
		return ScriptHelper.toFunctions(sb.toString());
	}

	private StringBuilder scripts(List<Binding> bindings,
			IWrapperContainer component) {
		StringBuilder generato = new StringBuilder();
		List<String> elabs = new ArrayList<String>();
		for (Binding b : bindings) {
			for (String p : b.getLeft()) {
				script(p, elabs, generato, component);
			}
			for (String p : b.getRigth()) {
				script(p, elabs, generato, component);
			}
		}
		return generato;
	}

	private void script(String id, List<String> elabs, StringBuilder generato,
			IWrapperContainer component) {
		if (!elabs.contains(id)) {
			elabs.add(id);
			IWrapperContainer wc = component.getWrapperContainer(id);
			IBaseBehavior baseBehavior = baseBehavior(wc);
			generato.append(baseBehavior.toScript(wc));
		}
	}

	private IBaseBehavior baseBehavior(IWrapperContainer wc) {
		return wc.getBaseBehavior();
	}

	public String toScriptChart(IWrapperContainer component) {
		StringBuilder sb = new StringBuilder();
		String ops = "";
		IChart<?> panel = (IChart<?>) component;
		String containerId = panel.getMarkupId();
		String id=panel.getId();
		try {
			ChartWrapperOptions opt = panel.getWrapper().getWrapperOptions();
			opt.setContainerId(containerId);
			ops = getMapper().writeValueAsString(opt);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		sb.append("var opt_" + containerId + "=")
				.append(ops)
				.append(";\nvar obj_" + containerId + "=buildChart(opt_"
						+ containerId + ");\n");
		sb.append("WicketCharts['" + id + "']=obj_" + containerId + ";\n");
		
		if (!component.isInDashboard()) {
			DataTable data = panel.getWrapper().getDataTable();
			if (data != null) {
				List<String> formatters = new ArrayList<String>();
				for (Integer col : data.getFormatColumns().keySet()) {
					String formatter = data.getFormatColumns().get(col);
					int k = formatter.indexOf('(');
					String f = formatter;
					if (k >= 0)
						f = formatter.substring(0, k);
					if (!formatters.contains(f)) {
						formatters.add(f);
						sb.append("var f_" + f + "_" + containerId + "=new "
								+ formatter + ";\n");
					}
					sb.append("f_" + f + "_" + containerId + ".format(opt_"
							+ containerId + ".dataTable," + col + ");\n");
				}
			}
			sb.append("obj_" + component.getMarkupId() + ".draw();\n");
		}
		return ScriptHelper.toFunctions(sb.toString());
	}

	public String toScriptControl(IWrapperContainer component) {
		String ops = null;
		final String containerId = component.getMarkupId();
		try {
			ControlWrapper<?, ?> cw = (ControlWrapper<?, ?>) component
					.getWrapper();
			ControlWrapperOptions o = cw.getWrapperOptions();
			if (o == null)
				o = new ControlWrapperOptions();
			o.setContainerId(containerId);
			ops = getMapper().writeValueAsString(cw.getWrapperOptions());
			ops = ScriptHelper.toFunctions(ops);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "var opt_" + containerId + "=" + ops + ";\nvar obj_"
				+ containerId + "=buildControl(opt_" + containerId + ");\n";

	}



}
