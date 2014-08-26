package it.ricfed.wicket.googlecharts.core;

import it.ricfed.wicket.googlecharts.data.DataTable;
import it.ricfed.wicket.googlecharts.options.chart.ChartWrapperOptions;
import it.ricfed.wicket.googlecharts.utils.ScriptHelper;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

public class ChartBehavior extends BaseBehavior {

	public ChartBehavior(WrapperContainer container) {
		super(container);
	}

	private static final long serialVersionUID = 5935294904099227859L;

	@Override
	protected String toScript(IWrapperContainer component) {
		StringBuilder sb = new StringBuilder();
		String ops="";
		Chart<?> panel=(Chart<?>)component;
		String containerId=panel.getMarkupId();
		try {
			ChartWrapperOptions opt = panel.getWrapper().getWrapperOptions();
			opt.setContainerId(containerId);
			ops = getMapper().writeValueAsString(opt);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		sb.append( "var opt_" + containerId + "=").append(ops).append(";\nvar obj_" + containerId
				+ "=buildChart(opt_" + containerId + ");\n");
		if(!component.isInDashboard()){		
			DataTable data = panel.getWrapper().getDataTable();
			if(data!=null){
				List<String> formatters=new ArrayList<String>();
				for (Integer col : data.getFormatColumns().keySet()) {
					String formatter=data.getFormatColumns().get(col);
					int k=formatter.indexOf('(');
					String f=formatter;
					if(k>=0)
						f=formatter.substring(0,k);
					if(!formatters.contains(f)){
						formatters.add(f);
						sb.append("var f_"+f+"_"+ containerId+"=new "+formatter+";\n");
					}
					sb.append("f_"+f+"_"+ containerId+".format(opt_" + containerId+".dataTable,"+col+");\n");
				}			
			}
			sb.append("obj_"
						+ component.getMarkupId() + ".draw();\n");
		}
		return ScriptHelper.toFunctions(sb.toString());
	}
}
