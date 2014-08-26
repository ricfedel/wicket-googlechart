package it.ricfed.wicket.googlecharts.core;

import it.ricfed.wicket.googlecharts.chart.Dashboard;
import it.ricfed.wicket.googlecharts.data.DataTable;
import it.ricfed.wicket.googlecharts.utils.ScriptHelper;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.behavior.IBehavior;

import com.fasterxml.jackson.core.JsonProcessingException;

public class DashboardBehavior extends BaseBehavior {

	public DashboardBehavior(WrapperContainer container) {
		super(container);
	}

	private static final long serialVersionUID = -9167469119665044503L;

	@Override
	protected String toScript(IWrapperContainer component) {
		Dashboard dash = (Dashboard) component;
		List<Binding> bindings = dash.getBinding();
		if (bindings == null || bindings.isEmpty()) {
			bindings = defaultBilding(dash.getElements());
		} 
		StringBuilder generato = scripts(bindings);
		generato.append(generate(component.getMarkupId(), bindings,
				dash.getDataTable()));
		return generato.toString();
	}



	private StringBuilder scripts(List<Binding> bindings) {
		StringBuilder generato = new StringBuilder();
		List<String> elabs = new ArrayList<String>();
		for (Binding b : bindings) {
			for (String p : b.getLeft()) {
				script(p, elabs, generato);
			}
			for (String p : b.getRigth()) {
				script(p, elabs, generato);
			}
		}
		return generato;
	}

	private void script(String id, List<String> elabs, StringBuilder generato) {
		if (!elabs.contains(id)) {
			elabs.add(id);
			WrapperContainer wc = (WrapperContainer) getContainer().get(
					id);
			BaseBehavior baseBehavior = baseBehavior(wc);
			generato.append(baseBehavior.toScript(wc));
		}
	}

	private BaseBehavior baseBehavior(WrapperContainer wc) {
		for (IBehavior b : wc.getBehaviors()) {
			if (b instanceof BaseBehavior) {
				return (BaseBehavior) b;
			}
		}
		return null;
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

	private String generate(String markupId, List<Binding> items, DataTable data) {
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
				String mkid=getContainer().get(id).getMarkupId();
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
				String mkid=getContainer().get(id).getMarkupId();
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
			List<String> formatters=new ArrayList<String>();
			for (Integer col : data.getFormatColumns().keySet()) {
				String formatter=data.getFormatColumns().get(col);
				int k=formatter.indexOf('(');
				String f=formatter;
				if(k>=0)
					f=formatter.substring(0,k);
				if(!formatters.contains(f)){
					formatters.add(f);
					sb.append("var f_"+f+"_"+ markupId+"=new "+formatter+";\n");
				}
				sb.append("f_"+f+"_"+ markupId+".format(data_" + markupId+","+col+");\n");
			}			
			
		} catch (JsonProcessingException e) {
			System.err.println(e.getMessage());
		}
		sb.append("dashboard_" + markupId + ".draw(data_" + markupId + ");");
		return ScriptHelper.toFunctions(sb.toString());
	}

}
